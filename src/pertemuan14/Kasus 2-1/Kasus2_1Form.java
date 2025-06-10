
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Kasus2_1Form extends JFrame implements ActionListener {

    private JTextField textField1;
    private JTextField textField2;
    private JButton tombolJumlah;

    public Kasus2_1Form() {
        // Set layout
        setLayout(new FlowLayout());

        // Buat komponen
        JLabel label1 = new JLabel("Angka 1:");
        textField1 = new JTextField(10);

        JLabel label2 = new JLabel("Angka 2:");
        textField2 = new JTextField(10);

        tombolJumlah = new JButton("Jumlahkan");

        // Tambahkan komponen ke frame
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(tombolJumlah);

        // Tambah listener
        tombolJumlah.addActionListener(this);

        // Set properti frame
        setTitle("Penjumlahan Dua Angka");
        setSize(250, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // agar muncul di tengah
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            int angka1 = Integer.parseInt(textField1.getText());
            int angka2 = Integer.parseInt(textField2.getText());
            int hasil = angka1 + angka2;

            JOptionPane.showMessageDialog(this, "Hasil: " + hasil);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Masukkan angka yang valid!", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    public static void main(String[] args) {
        new Kasus2_1Form();
    }
}