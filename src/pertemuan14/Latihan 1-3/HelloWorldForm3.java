
import javax.swing.*;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {

    private JLabel label;
    private JButton button;

    public HelloWorldForm3() {
        label = new JLabel("Hello World!");
        button = new JButton("Klik Saya");

        add(label);
        add(button);

        // Gunakan layout default agar komponen tidak tumpang tindih
        setLayout(new java.awt.FlowLayout());

        button.addActionListener(this);

        setTitle("Form Hello World dengan Tombol");
        setSize(300, 100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        label.setText("Tombol diklik!");
    }

    public static void main(String[] args) {
        new HelloWorldForm3();
    }
}