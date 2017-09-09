import javax.swing.*;
import java.awt.*;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Main {
    public static void main(String args[])
    {
        showMenu();
    }
    public static void showMenu()
    {
        EventQueue.invokeLater(()->{
            MenuFrame menuFrame = new MenuFrame();
            menuFrame.setVisible(true);
        });
    }
}



//class MainFrame extends JFrame{

//}