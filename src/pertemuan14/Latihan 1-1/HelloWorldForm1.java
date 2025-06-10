
import javax.swing.JFrame;
import javax.swing.JLabel;

public class HelloWorldForm1 extends JFrame {

    public HelloWorldForm1() {
        JLabel label = new JLabel("Hello World!");
        add(label);

        setTitle("Form Hello World");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}