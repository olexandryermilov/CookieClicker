import javax.swing.*;

/**
 * Created by Олександр on 09.09.2017.
 */

public class GameFrame extends JFrame {
    private static final int DEFAULT_WIDTH=1000;
    private static final int DEFAULT_HEIGHT=600;
    public GameFrame()
    {
        setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
    }
}
class MenuFrame extends GameFrame{

    private static final int MENU_HEIGHT=300;
    private static final int MENU_WIDTH=400;
    public MenuFrame()
    {
        super();
        setSize(MENU_WIDTH,MENU_HEIGHT);
        setTitle(Game.getTitle());
        MenuButton newGame = new MenuButton("Start new game");
        MenuButton loadFromFile = new MenuButton("Load from file");
        this.add(newGame);
        this.add(loadFromFile);
    }
}
class MenuButton extends JButton
{
    private static final int BUTTON_HEIGHT = 30;
    private static final int BUTTON_WIDTH = 80;
    public MenuButton(String text)
    {
        super(text);
        this.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
        //this.setText(text);
        //todo:add action
    }
}