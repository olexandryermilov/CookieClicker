import java.util.Random;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Game {
    private final String TITLE = "Cookie Clicker 0.01";
    private int cookiesPerSecond;
    private int cookiePerClick=1;

    public int getAmountOfCookies() {
        return amountOfCookies;
    }

    private int secondsToNextGoldenCookie;
    private int amountOfCookies;
    Random random;
    public Game()
    {
        random = new Random(System.currentTimeMillis()/1000);
    }
    public String getTitle()
    {
        return TITLE;
    }
    public void startNewGame()
    {
        cookiesPerSecond = 0;
        cookiePerClick = 1;
        secondsToNextGoldenCookie=random.nextInt(500);
        amountOfCookies=0;
    }
    public void pressCookie()
    {
        amountOfCookies+=cookiePerClick;
    }
}
