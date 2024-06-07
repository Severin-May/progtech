package myapp;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class MyFrame extends JFrame {
    
    private final WindowAdapter exitAdapter = new WindowAdapter() {
        @Override
        public void windowClosing(WindowEvent e) {
            //super.windowClosing(e); //To change body of generated methods, choose Tools | Templates.
            //System.out.println("I am closing, bitch");
            System.exit(0);
        }   
    };
    
    public MyFrame() {
        addWindowListener(exitAdapter);
        setTitle("Empty frame");
        setSize(600,200);
        //getContentPane().add(new ClickButton());
        getContentPane().add(new CounterButton());
        getContentPane().add(new ExitButton());
        //in this approach img can be lost (maybe)
        //setIconImage(Toolkit.getDefaultToolkit().getImage("icon.png"));
        java.net.URL url = MyFrame.class.getResource("icon.png");
        setLayout(new FlowLayout());
        setIconImage(Toolkit.getDefaultToolkit().getImage(url));
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new MyFrame();
    }
    
}
