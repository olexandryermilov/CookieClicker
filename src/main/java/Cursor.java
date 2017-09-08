import java.util.ArrayList;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Cursor extends Building{
    public static Building getInstance() {
        if(INSTANCE==null)INSTANCE=new Cursor();
        return INSTANCE;
    }
    private Cursor() {
        super();
        cost = 10;
        cookiesPerSecond = 1;
        upgrades = new ArrayList<Upgrade>();
        //todo : add upgrades
        amount = 0;
    }
}
