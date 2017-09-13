import com.google.gson.Gson;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * Created by Олександр on 09.09.2017.
 */
public class Main {
    private static MenuFrame menuFrame;
    private static MainGameFrame mainGameFrame;
    static Game game;
    static Gson gson;
    public static void main(String args[])
    {
        EventQueue.invokeLater(()->{
            gson = new Gson();
            game = new Game();
            menuFrame = new MenuFrame();
            mainGameFrame = new MainGameFrame();
            mainGameFrame.addWindowListener(new WindowListener() {
                @Override
                public void windowOpened(WindowEvent e) {

                }

                @Override
                public void windowClosing(WindowEvent e) {
                    Main.game.saveToFile("resources/save.txt");
                    mainGameFrame.setVisible(false);
                    mainGameFrame.dispose();
                }

                @Override
                public void windowClosed(WindowEvent e) {

                }

                @Override
                public void windowIconified(WindowEvent e) {

                }

                @Override
                public void windowDeiconified(WindowEvent e) {

                }

                @Override
                public void windowActivated(WindowEvent e) {

                }

                @Override
                public void windowDeactivated(WindowEvent e) {

                }
            });
        });

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