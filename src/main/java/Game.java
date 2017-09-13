import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Game {

    private ArrayList<Building> buildings;
    private int cookiesPerSecond;
    private int cookiesPerClick=1;

    public int getAmountOfCookies() {
        return amountOfCookies;
    }

    private int secondsToNextGoldenCookie;
    private int amountOfCookies;
    Random random;
    private void initializeBuildings()
    {
        buildings = new ArrayList<>();
        buildings.add(Cursor.getInstance());
        buildings.add(Grandma.getInstance());
    }
    public Game()
    {
        random = new Random(System.currentTimeMillis()/1000);
        initializeBuildings();
    }
    public void startNewGame()
    {
        cookiesPerSecond = 0;
        cookiesPerClick = 1;
        secondsToNextGoldenCookie=random.nextInt(500);
        amountOfCookies=0;
    }
    public void saveToFile(String pathToFile)
    {
        StringBuilder saveText = new StringBuilder();
        saveText.append(Main.gson.toJson(amountOfCookies));
        saveText.append("\n");
        saveText.append(Main.gson.toJson(cookiesPerClick));
        saveText.append('\n');
        saveText.append(Main.gson.toJson(cookiesPerSecond));
        saveText.append('\n');
        for(int i=0;i<buildings.size();i++)
        {
            saveText.append(Main.gson.toJson(buildings.get(i)));
            saveText.append('\n');
        }
        System.out.println(new String(saveText));
        FileWriter writer;
        try
        {
            writer = new FileWriter(pathToFile,false);
            writer.write(new String(saveText));
            writer.close();
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
    }
    public void loadFromFile(String pathToFile)
    {
        FileReader reader;
        try
        {
            reader = new FileReader(pathToFile);
            StringBuilder text = new StringBuilder();
            int r;
            while(true)
            {
                r = reader.read();
                if(r==-1)break;
                text.append((char)r);
            }
            reader.close();
            String[] jsonStrings = new String(text).split("\\n");
            for(int i=0;i<jsonStrings.length;i++)System.out.println(jsonStrings[i]);
            try
            {
                amountOfCookies = Main.gson.fromJson(jsonStrings[0],int.class);
                cookiesPerClick = Main.gson.fromJson(jsonStrings[1],int.class);
                cookiesPerSecond = Main.gson.fromJson(jsonStrings[2],int.class);
                for(int i=0;i<buildings.size();i++)
                {
                    buildings.set(i,Main.gson.fromJson(jsonStrings[3+i],Building.class));
                }
                System.out.println(amountOfCookies);
            }
            catch (ArrayIndexOutOfBoundsException e)
            {
                System.out.println("Your save is broken");
            }
        }
        catch (IOException e)
        {
            System.out.println(e.getMessage());
        }
        finally {

        }
    }
    public void pressCookie()
    {
        amountOfCookies+=cookiesPerClick;
    }
}
