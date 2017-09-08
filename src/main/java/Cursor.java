import java.util.ArrayList;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Cursor extends Building{
    public Cursor()
    {
        super();
        cost = 10;
        cookiesPerSecond=15;
        upgrades= new ArrayList<Upgrade>();
        //todo : add upgrades
        amount=0;
    }

}
