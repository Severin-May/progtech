package myapp;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

public class ClickButton extends JButton implements ActionListener {
    
    private int counter = 0;
    
    public ClickButton() {
        setText("Clicks: 0");
        addActionListener(this); //button implements its own actionlistener
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        counter++;
        setText("Clicks: " + counter);
    }
            
}
