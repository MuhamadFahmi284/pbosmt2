
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Class RentalMobil (contoh penggunaan objek, encapsulation, dan polymorphism)
public class RentalMobil {
    public static void main(String[] args) {
        List<Mobil> mobilList = new ArrayList<>();
        mobilList.add(new MobilSedan("Toyota Camry", 2022, "Hitam", 500000, 2000));
        mobilList.add(new MobilMinibus("Isuzu Elf", 2021, "Putih", 800000, 12));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Selamat datang di Rental Mobil!");
        System.out.println("Pilih jenis mobil yang ingin disewa:");
        System.out.println("1. Mobil Sedan");
        System.out.println("2. Mobil Minibus");
        System.out.print("Pilihan Anda (1/2): ");
        int pilihan = scanner.nextInt();

        Mobil mobil = null;

        if (pilihan == 1) {
            mobil = mobilList.get(0);
        } else if (pilihan == 2) {
            mobil = mobilList.get(1);
        } else {
            System.out.println("Pilihan tidak valid.");
            System.exit(0);
        }

        if (mobil.isTersedia()) {
            System.out.println("Anda memilih mobil:");
            mobil.displayInfo();
            mobil.setTersedia(false);
            System.out.println("Mobil telah disewa.");
        } else {
            System.out.println("Maaf, mobil tidak tersedia.");
        }

        scanner.close();
    }
}
