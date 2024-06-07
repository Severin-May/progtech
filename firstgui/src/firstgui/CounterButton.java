package firstgui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class CounterButton extends JButton implements ActionListener {
    private int counter = 0;
    
    public CounterButton() {
        setText("Clicks: 0"); 
        addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        setText("Clicks: " + ++counter); 
    }
}
