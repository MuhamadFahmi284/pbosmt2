
import java.util.ArrayList;

class Kendaraan {
    protected String merk;
    protected int tahun;
    protected String warna;

    public Kendaraan(String merk, int tahun, String warna) {
        this.merk = merk;
        this.tahun = tahun;
        this.warna = warna;
    }

    public void informasi() {
        System.out.println("Merk: " + merk);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
    }
}

class Mobil extends Kendaraan {
    private int jumlahKursi;

    public Mobil(String merk, int tahun, String warna, int jumlahKursi) {
        super(merk, tahun, warna);
        this.jumlahKursi = jumlahKursi;
    }

    @Override
    public void informasi() {
        super.informasi();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}

class Rental {
    private ArrayList<Kendaraan> kendaraanDisewa;

    public Rental() {
        kendaraanDisewa = new ArrayList<>();
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        kendaraanDisewa.add(kendaraan);
    }

    public void daftarKendaraan() {
        for (Kendaraan kendaraan : kendaraanDisewa) {
            kendaraan.informasi();
        }
    }

    void tambahKendaraan(Mobil mobil1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
