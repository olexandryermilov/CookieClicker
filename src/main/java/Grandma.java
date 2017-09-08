import java.util.ArrayList;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Grandma extends Building{
    public static Building getInstance() {
        if(INSTANCE==null)INSTANCE=new Grandma();
        return INSTANCE;
    }
    private Grandma() {
        super();
        cost = 70;
        cookiesPerSecond = 5;
        upgrades = new ArrayList<Upgrade>();
        //todo : add upgrades
        amount = 0;
    }
}
