package modul.pkg4;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jurusan;
    private double ipk;

    // konstruktor untuk menginisialisasi data mahasiswa
    public Mahasiswa(String nama, String nim, String jurusan, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.ipk = ipk;
    }

    // method untuk mencetak data mahasiswa
    public void printDataMahasiswa() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("IPK: " + ipk);
    }

    public static void main(String[] args) {
        // membuat objek mahasiswa dengan memasukkan 4 data
        Mahasiswa mahasiswa = new Mahasiswa("Muhamad Fahmi", "20220810029", "Teknik Informatika", 3.15);

        // mencetak data mahasiswa
        mahasiswa.printDataMahasiswa();
    }
}

