import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        RentalMobil rentalMobil = new RentalMobil();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Selamat datang di Rental Mobil");
            System.out.println("1. Tampilkan mobil tersedia");
            System.out.println("2. Pesan mobil");
            System.out.println("3. Keluar");
            System.out.print("Pilihan: ");
            int pilihan = scanner.nextInt();

            if (pilihan == 1) {
                rentalMobil.tampilkanMobilTersedia();
            } else if (pilihan == 2) {
                scanner.nextLine(); // Membuang karakter newline
                System.out.print("Masukkan nama mobil yang ingin dipesan: ");
                String namiMobill = scanner.nextLine();
                rentalMobil.pesanMobil(namiMobill);
            } else if (pilihan == 3) {
                break;
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            System.out.println();
        }

        System.out.println("Terima kasih telah menggunakan layanan Rental Mobil.");
    }
}