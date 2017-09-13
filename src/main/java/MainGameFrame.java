import javax.imageio.plugins.jpeg.JPEGHuffmanTable;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Олександр on 12.09.2017.
 */
public class MainGameFrame extends GameFrame
{
    private JPanel cookiePanel;
    private JLabel cookieLabel;
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
    class BigCookieButton extends JButton
    {
        private static final int BUTTON_HEIGHT = 100;
        private static final int BUTTON_WIDTH = 100;
        public BigCookieButton()
        {
            super();
            this.setSize(BUTTON_WIDTH,BUTTON_HEIGHT);
            //this.setIcon(new ImageIcon("resources/"));
        }
    }
    private static final int WIDTH_DIVISOR=2;
    private static final int HEIGHT_DIVISOR=2;
    public MainGameFrame()
    {
        super(WIDTH_DIVISOR,HEIGHT_DIVISOR);
        addComponents();
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//todo: add operation
        Main.game.startNewGame();
    }
    public void addComponents()
    {
        addButtons();
        addLabels();
    }
    protected void addButtons()
    {
        cookiePanel = new JPanel();
        BigCookieButton bigCookieButton = new BigCookieButton();
        cookiePanel.add(bigCookieButton);
        bigCookieButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Main.game.pressCookie();
                updateCookieLabel();
            }
        });
        add(cookiePanel);
    }
    private void updateCookieLabel()
    {
        //cookiePanel.remove(cookieLabel);
        Integer amountOfCookies = Main.game.getAmountOfCookies();
        StringBuilder labelText =new StringBuilder();
        labelText.append(amountOfCookies.toString());
        labelText.append(" cookie");
        if(amountOfCookies%10!=1)labelText.append("s");
        cookieLabel.setText(new String(labelText));
        cookiePanel.add(cookieLabel);
    }
    protected void addLabels()
    {
        cookieLabel= new JLabel("0 cookies");
        cookiePanel.add(cookieLabel);
        //add(cookiePanel);
    }
}
