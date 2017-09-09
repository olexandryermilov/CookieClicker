import javax.swing.*;
import java.awt.*;

/**
 * Created by Олександр on 09.09.2017.
 */

public abstract class GameFrame extends JFrame {

    public GameFrame()
    {
        setLocationByPlatform(true);
        Image img = new ImageIcon("resources/SmallCookie.gif").getImage();//todo: add image
        setIconImage(img);//todo: add new method setFrameIcon?
    }
    protected void setFrameSize(int widthDivisor, int heightDivisor)
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setSize(screenSize.width/widthDivisor,screenSize.height/heightDivisor);
    }
    public abstract void addButtons();
}
class MenuFrame extends GameFrame{

    private static final int WIDTH_DIVISOR = 4;
    private static final int HEIGHT_DIVISOR=3;
    public MenuFrame()
    {
        super();
        setFrameSize(WIDTH_DIVISOR,HEIGHT_DIVISOR);
        setTitle(Game.getTitle());
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addButtons();
    }
    public void addButtons()
    {
        MenuButton newGame = new MenuButton("Start new game");
        MenuButton loadFromFile = new MenuButton("Load from file");
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
        this.setText(text);
        //todo:add action
    }
}