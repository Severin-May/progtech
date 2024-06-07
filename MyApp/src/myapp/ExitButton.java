package myapp;

import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JButton;

public class ExitButton extends JButton {
   
    public ExitButton() {
        super(new AbstractAction("Exit") {
            @Override
            public void actionPerformed(ActionEvent e) {
                new ExitClass().windowClosing(null);
            }
        });
        
    }    
}
