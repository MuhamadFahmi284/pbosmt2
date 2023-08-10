package modul.pkg4;
public class overload{
public static void main(String args []) {
        // membuat objek rumah dengan menggunakan konstruktor 1
        Rumah rumah1 = new Rumah();

        // membuat objek rumah dengan menggunakan konstruktor 2
        Rumah rumah2 = new Rumah("Rumah Minimalis", 100);
        System.out.println("rumah1");
        rumah1.printDataRumah();
        // membuat objek rumah dengan menggunakan konstruktor 3
        Rumah rumah3 = new Rumah("Rumah Elegan", 200, 150);
        System.out.println("rumah2");
        rumah1.printDataRumah();

        // membuat objek rumah dengan menggunakan konstruktor 4
        Rumah rumah4 = new Rumah("Rumah Modern", 250, 200, 4, 3);
        System.out.println("rumah3");
        rumah1.printDataRumah();

        // mencetak data rumah
        rumah1.printDataRumah();
    }
}
