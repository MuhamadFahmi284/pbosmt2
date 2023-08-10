// Definisikan kelas Mobil
class Mobil {
    // Atribut mobil
    String merek;
    String warna;
    int kecepatan;

    // Method start
    void start() {
        System.out.println("Mesin dihidupkan");
        kecepatan = 0;
    }

    // Method stop
    void stop() {
        System.out.println("Mesin dimatikan");
        kecepatan = 0;
    }

    // Method bergerak
    void bergerak(int kecepatanBaru) {
        kecepatan = kecepatanBaru;
        System.out.println("Mobil bergerak dengan kecepatan " + kecepatan + " km/jam");
    }
}

// Program utama
class ProgramUtama {
    public static void main(String[] args) {
        // Buat objek dari kelas Mobil
        Mobil mobil1 = new Mobil();

        // Set nilai atribut pada objek mobil1
        mobil1.merek = "Honda";
        mobil1.warna = "Merah";
        mobil1.kecepatan = 0;

        // Panggil method start pada objek mobil1
        mobil1.start();

        // Panggil method bergerak pada objek mobil1 dengan kecepatan 50 km/jam
        mobil1.bergerak(50);

        // Panggil method stop pada objek mobil1
        mobil1.stop();
    }
}

