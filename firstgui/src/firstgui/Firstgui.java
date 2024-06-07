package firstgui;

import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.net.URL;
import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class Firstgui extends JFrame {
    
    private final WindowAdapter exitAdapter = new WindowAdapter() {
       
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    };
    
    public Firstgui() {
        /** 
         * addWindowListener and setDefaultCloseOperation do the same job
         * however, event listener offers much variety of other functionalities
         */
        addWindowListener(exitAdapter);
        //setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //addEventListener(new ExitClass());
        setTitle("Click counter");
        setSize(600, 200);
        //getContentPane().add(new ClickButton());
        getContentPane().setLayout(new FlowLayout());
        getContentPane().add(new CounterButton());
        //getContentPane().add(new ExitButton());
        /**
         * the next two lines are needed for icon change
         */
        //URL url = getClass().getClassLoader().getResource("icon.png");
        //setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        setVisible(true);
    }

    public static void main(String[] args) {
       new Firstgui();
    }
    
    
    // the professor's code has everything needed
    // !not complete code here
}
