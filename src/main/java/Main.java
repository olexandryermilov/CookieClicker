import javax.swing.*;
import java.awt.*;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Main {
    private static MenuFrame menuFrame;
    private static MainGameFrame mainGameFrame;
    static Game game;
    public static void main(String args[])
    {
       // EventQueue.invokeLater(()->{
            game = new Game();
            menuFrame = new MenuFrame();
            mainGameFrame = new MainGameFrame();

        //});
        showMenu();
    }
    public static void showMenu()
    {
        EventQueue.invokeLater(()->{
            menuFrame.setVisible(true);
        });
    }
    public static void hideMenu()
    {
        EventQueue.invokeLater(()->{
            menuFrame.setVisible(false);
        });
    }
    public static void showMainFrame()
    {
        EventQueue.invokeLater(()->{
            mainGameFrame.setVisible(true);
        });
    }
}



//class MainFrame extends JFrame{

//}