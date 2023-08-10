import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

// Kelas abstrak untuk bentuk geometri
abstract class Bentuk {
    private String nama;

    public Bentuk(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Metode abstrak untuk menghitung luas bentuk
    public abstract double hitungLuas();
}

// Kelas Lingkaran yang merupakan subkelas Bentuk
class Lingkaran extends Bentuk {
    private double radius;

    public Lingkaran(String nama, double radius) {
        super(nama);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double hitungLuas() {
        return Math.PI * radius * radius;
    }
}

// Kelas Persegi yang merupakan subkelas Bentuk
class Persegi extends Bentuk {
    private double sisi;

    public Persegi(String nama, double sisi) {
        super(nama);
        this.sisi = sisi;
    }

    public double getSisi() {
        return sisi;
    }

    @Override
    public double hitungLuas() {
        return sisi * sisi;
    }
}

// Antarmuka grafis utama
public class ProgramGUI {
    private JFrame frame;
    private JTextArea outputTextArea;

    public ProgramGUI() {
        frame = new JFrame("Program GUI");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Membuat panel konten utama
        JPanel contentPane = new JPanel();
        contentPane.setLayout(new BorderLayout());

        // Membuat panel atas
        JPanel topPanel = new JPanel();
        topPanel.setLayout(new FlowLayout());

        JLabel label = new JLabel("Pilih Bentuk:");
        topPanel.add(label);

        // Membuat combo box untuk memilih bentuk
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Lingkaran");
        comboBox.addItem("Persegi");
        topPanel.add(comboBox);

        JButton buttonHitung = new JButton("Hitung Luas");
        topPanel.add(buttonHitung);

        contentPane.add(topPanel, BorderLayout.NORTH);

        // Membuat area teks untuk output
        outputTextArea = new JTextArea();
        contentPane.add(new JScrollPane(outputTextArea), BorderLayout.CENTER);

        // Menambahkan panel konten utama ke dalam frame
        frame.setContentPane(contentPane);

        // Menambahkan pemroses acara (event listener) untuk tombol
        buttonHitung.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedShape = (String) comboBox.getSelectedItem();
                double luas = 0.0;

                if (selectedShape.equals("Lingkaran")) {
                    Lingkaran lingkaran = new Lingkaran("Lingkaran", 5.0);
                    luas = lingkaran.hitungLuas();
                } else if (selectedShape.equals("Persegi")) {
                    Persegi persegi = new Persegi("Persegi", 4.0);
                    luas = persegi.hitungLuas();
                }

                outputTextArea.setText("Luas " + selectedShape + ": " + luas);
            }
        });

        // Menampilkan frame
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ProgramGUI();
            }
        });
    }
}
