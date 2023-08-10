package modul.pkg4;

public class data_diri {
    private String nama;
    private String alamat;
    private int umur;

    // konstruktor untuk menginisialisasi data diri
    public data_diri (String nama, String alamat, int umur) {
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    // method untuk mencetak data diri
    public void printdata_diri() {
        System.out.println("Nama: " + nama);
        System.out.println("Alamat: " + alamat);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        // membuat objek data diri dengan memasukkan 3 data
        data_diri dataDiri = new data_diri("Muhamad Fahmi", "Jl. Raya Kuningan No. 123", 19);

        // mencetak data diri
        dataDiri.printdata_diri();
    }
}

