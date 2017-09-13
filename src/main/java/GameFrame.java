import javax.swing.*;
import java.awt.*;

/**
 * Created by Олександр on 09.09.2017.
 */

public abstract class GameFrame extends JFrame {
    protected final String TITLE = "Cookie Clicker v0.01";
    private final int WIDTH_DIVISOR;
    private final int HEIGHT_DIVISOR;
    public GameFrame(int width, int height)
    {
        WIDTH_DIVISOR=width;
        HEIGHT_DIVISOR=height;
        setFrameSize(WIDTH_DIVISOR,HEIGHT_DIVISOR);
        setLocationByPlatform(true);
        setTitle(TITLE);
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
    protected abstract void addButtons();
    protected abstract void addLabels();
}

