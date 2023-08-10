import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Superclass Mobil
class Mobil {
    private String merek;
    private int tahun;
    private String warna;
    private int hargaSewaPerHari;
    private boolean tersedia;

    public Mobil(String merek, int tahun, String warna, int hargaSewaPerHari) {
        this.merek = merek;
        this.tahun = tahun;
        this.warna = warna;
        this.hargaSewaPerHari = hargaSewaPerHari;
        this.tersedia = true;
    }

    public String getMerek() {
        return merek;
    }

    public int getTahun() {
        return tahun;
    }

    public String getWarna() {
        return warna;
    }

    public int getHargaSewaPerHari() {
        return hargaSewaPerHari;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void displayInfo() {
        System.out.println("Merek: " + merek);
        System.out.println("Tahun: " + tahun);
        System.out.println("Warna: " + warna);
        System.out.println("Harga Sewa per Hari: " + hargaSewaPerHari);
        System.out.println("Tersedia: " + (tersedia ? "Ya" : "Tidak"));
    }
    
}

// Subclass MobilSedan (inheritance dari Mobil)
class MobilSedan extends Mobil {
    private int kapasitasMesin;

    public MobilSedan(String merek, int tahun, String warna, int hargaSewaPerHari, int kapasitasMesin) {
        super(merek, tahun, warna, hargaSewaPerHari);
        this.kapasitasMesin = kapasitasMesin;
    }

    public int getKapasitasMesin() {
        return kapasitasMesin;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Kapasitas Mesin: " + kapasitasMesin);
    }
}

// Subclass MobilMinibus (inheritance dari Mobil)
class MobilMinibus extends Mobil {
    private int jumlahKursi;

    public MobilMinibus(String merek, int tahun, String warna, int hargaSewaPerHari, int jumlahKursi) {
        super(merek, tahun, warna, hargaSewaPerHari);
        this.jumlahKursi = jumlahKursi;
    }

    public int getJumlahKursi() {
        return jumlahKursi;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Jumlah Kursi: " + jumlahKursi);
    }
}

