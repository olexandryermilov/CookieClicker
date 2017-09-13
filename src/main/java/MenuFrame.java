import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Олександр on 12.09.2017.
 */
public class MenuFrame extends GameFrame{
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
    private JPanel buttonPanel;
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
    public void addLabels(){
    }
    public void addButtons()
    {
        buttonPanel = new JPanel();
        MenuButton newGame = new MenuButton("Start new game");
        MenuButton loadFromFile = new MenuButton("Load from file");
        buttonPanel.add(newGame);
        buttonPanel.add(loadFromFile);
        add(buttonPanel);
        newGame.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.hideMenu();
                Main.showMainFrame();
                Game game = new Game();
            }
        });
    }
}
