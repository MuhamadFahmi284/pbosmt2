import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Superclass Mahasiswa
class Mahasiswa {
    private String nama;
    private String nim;

    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void displayData() {
        JOptionPane.showMessageDialog(null, "Nama: " + nama + "\nNIM: " + nim);
    }
}

// Subclass MahasiswaBaru dengan inheritance
class MahasiswaBaru extends Mahasiswa {
    private String jurusan;

    public MahasiswaBaru(String nama, String nim, String jurusan) {
        super(nama, nim);
        this.jurusan = jurusan;
    }

    public String getJurusan() {
        return jurusan;
    }

    // Polimorfisme - overriding metode displayData() dari superclass
    @Override
    public void displayData() {
        JOptionPane.showMessageDialog(null, "Nama: " + getNama() + "\nNIM: " + getNim() + "\nJurusan: " + jurusan);
    }
}

// GUI utama
public class DataMahasiswaGUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Data Mahasiswa");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);
        frame.setLayout(new FlowLayout());

        // Button untuk input data mahasiswa baru
        JButton inputButton = new JButton("Input Data Mahasiswa Baru");
        inputButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String nama = JOptionPane.showInputDialog("Masukkan Nama:");
                String nim = JOptionPane.showInputDialog("Masukkan NIM:");
                String jurusan = JOptionPane.showInputDialog("Masukkan Jurusan:");

                // Membuat objek MahasiswaBaru
                MahasiswaBaru mahasiswaBaru = new MahasiswaBaru(nama, nim, jurusan);

                // Menampilkan data menggunakan metode displayData()
                mahasiswaBaru.displayData();
            }
        });

        frame.add(inputButton);
        frame.setVisible(true);
    }
}
