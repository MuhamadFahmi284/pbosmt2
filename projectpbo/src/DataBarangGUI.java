import javax.swing.*;
import java.awt.event.*;

// Parent class: Barang
class Barang {
    private String nama;
    private int harga;

    public Barang(String nama, int harga) {
        this.nama = nama;
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public void displayInfo() {
        JOptionPane.showMessageDialog(null, "Nama Barang: " + nama + "\nHarga: " + harga);
    }
}

// Child class: BarangElektronik
class BarangElektronik extends Barang {
    private String merek;

    public BarangElektronik(String nama, int harga, String merek) {
        super(nama, harga);
        this.merek = merek;
    }

    public String getMerek() {
        return merek;
    }
}

public class DataBarangGUI {
    public static void main(String[] args) {
        // Membuat objek BarangElektronik
        BarangElektronik barang1 = new BarangElektronik("", , "");

        // Menampilkan informasi barang1
        barang1.displayInfo();

        // Membuat objek JFrame
        JFrame frame = new JFrame("Data Barang");
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat JLabel untuk nama barang
        JLabel labelNama = new JLabel("Nama Barang:");
        labelNama.setBounds(10, 10, 100, 20);
        frame.add(labelNama);

        // Membuat JTextField untuk input nama barang
        JTextField fieldNama = new JTextField();
        fieldNama.setBounds(120, 10, 150, 20);
        frame.add(fieldNama);

        // Membuat JLabel untuk harga barang
        JLabel labelHarga = new JLabel("Harga:");
        labelHarga.setBounds(10, 40, 100, 20);
        frame.add(labelHarga);

        // Membuat JTextField untuk input harga barang
        JTextField fieldHarga = new JTextField();
        fieldHarga.setBounds(120, 40, 150, 20);
        frame.add(fieldHarga);

        // Membuat JButton untuk menampilkan data barang
        JButton buttonTampil = new JButton("Tampilkan Data");
        buttonTampil.setBounds(80, 80, 140, 30);
        frame.add(buttonTampil);

        // Menambahkan ActionListener untuk buttonTampil
        buttonTampil.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = fieldNama.getText();
                int harga = Integer.parseInt(fieldHarga.getText());

                // Membuat objek Barang
                Barang barang2 = new Barang(nama, harga);

                // Menampilkan informasi barang2
                barang2.displayInfo();
            }
        });

        frame.setVisible(true);
    }
}
