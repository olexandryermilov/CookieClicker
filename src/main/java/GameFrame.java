import javax.swing.*;
import java.awt.*;

/**
 * Created by Олександр on 09.09.2017.
 */

public abstract class GameFrame extends JFrame {

    private final int WIDTH_DIVISOR;
    private final int HEIGHT_DIVISOR;
    public GameFrame(int width, int height)
    {
        WIDTH_DIVISOR=width;
        HEIGHT_DIVISOR=height;
        setFrameSize(WIDTH_DIVISOR,HEIGHT_DIVISOR);
        setLocationByPlatform(true);
        setTitle(Game.getTitle());
    }
    private void setFrameIcon()
    {
        Image img = new ImageIcon("resources/SmallCookie.gif").getImage();
        setIconImage(img);
    }
    protected void setFrameSize(int widthDivisor, int heightDivisor)
    {
        Toolkit kit = Toolkit.getDefaultToolkit();
        Dimension screenSize = kit.getScreenSize();
        setSize(screenSize.width/widthDivisor,screenSize.height/heightDivisor);
    }
    public abstract void addComponents();
    public abstract void addButtons();
}
class MenuFrame extends GameFrame{

    private static final int WIDTH_DIVISOR = 4;
    private static final int HEIGHT_DIVISOR = 3;
    public MenuFrame()
    {
        super(WIDTH_DIVISOR,HEIGHT_DIVISOR);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        addComponents();
    }
    public void addComponents()
    {
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

class MainGameFrame extends GameFrame
{
    private static final int WIDTH_DIVISOR=1;
    private static final int HEIGHT_DIVISOR=1;
    public MainGameFrame()
    {
        super(WIDTH_DIVISOR,HEIGHT_DIVISOR);
        addComponents();
        // setDefaultCloseOperation();//todo: add operation
    }
    public void addComponents()
    {
        addButtons();
    }
    public void addButtons()
    {

    }
}
class changeAmountButton extends JButton
{
    private static final int BUTTON_HEIGHT = 30;
    private static final int BUTTON_WIDTH = 30;
    public changeAmountButton(String text)
    {
        super(text);
        this.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
        this.setText(text);
        //todo:add action
    }
}