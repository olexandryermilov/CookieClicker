import java.util.ArrayList;

/**
 * Created by Олександр on 09.09.2017.
 */
public abstract class Building {
    protected static Building INSTANCE = null;


    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getCookiesPerSecond() {
        return cookiesPerSecond;
    }

    public void setCookiesPerSecond(int cookiesPerSecond) {
        this.cookiesPerSecond = cookiesPerSecond;
    }

    public ArrayList<Upgrade> getUpgrades() {
        return upgrades;
    }

    public void setUpgrades(ArrayList<Upgrade> upgrades) {
        this.upgrades = upgrades;
    }

    protected int cost;
    protected int amount;
    protected int cookiesPerSecond;
    protected ArrayList<Upgrade> upgrades;
}
