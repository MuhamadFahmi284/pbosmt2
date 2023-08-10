public class Rumah {
    private String jenis;
    private int luasTanah;
    private int luasBangunan;
    private int jumlahKamar;
    private int jumlahKamarMandi;

    // konstruktor 1 (konstruktor default)
    public Rumah() {
        this.jenis = "Rumah";
        this.luasTanah = 0;
        this.luasBangunan = 0;
        this.jumlahKamar = 0;
        this.jumlahKamarMandi = 0;
    }

    // konstruktor 2 (konstruktor dengan parameter jenis dan luasTanah)
    public Rumah(String jenis, int luasTanah) {
        this.jenis = jenis;
        this.luasTanah = luasTanah;
        this.luasBangunan = 0;
        this.jumlahKamar = 0;
        this.jumlahKamarMandi = 0;
    }

    // konstruktor 3 (konstruktor dengan parameter jenis, luasTanah, dan luasBangunan)
    public Rumah(String jenis, int luasTanah, int luasBangunan) {
        this.jenis = jenis;
        this.luasTanah = luasTanah;
        this.luasBangunan = luasBangunan;
        this.jumlahKamar = 0;
        this.jumlahKamarMandi = 0;
    }

    // konstruktor 4 (konstruktor dengan parameter jenis, luasTanah, luasBangunan, jumlahKamar, dan jumlahKamarMandi)
    public Rumah(String jenis, int luasTanah, int luasBangunan, int jumlahKamar, int jumlahKamarMandi) {
        this.jenis = jenis;
        this.luasTanah = luasTanah;
        this.luasBangunan = luasBangunan;
        this.jumlahKamar = jumlahKamar;
        this.jumlahKamarMandi = jumlahKamarMandi;
    }

    // method untuk mencetak data rumah
    public void printDataRumah(){
        System.out.println("Jenis: " + this.jenis);
        System.out.println("Luas Tanah: " + this.luasTanah + " meter persegi");
        System.out.println("Luas Bangunan: " + this.luasBangunan + " meter persegi");
        System.out.println("Jumlah Kamar: " + this.jumlahKamar);
        System.out.println("Jumlah Kamar Mandi: " + this.jumlahKamarMandi);
    }

    public static void main(String args[]) {
        // membuat objek rumah dengan menggunakan konstruktor 1
        Rumah rumah1 = new Rumah();

        // membuat objek rumah dengan menggunakan konstruktor 2
        Rumah rumah2 = new Rumah("Rumah Minimalis", 100);
        // membuat objek rumah dengan menggunakan konstruktor 3
        Rumah rumah3 = new Rumah("Rumah Elegan", 200, 150);
        // membuat objek rumah dengan menggunakan konstruktor 4
        Rumah rumah4 = new Rumah("Rumah Modern", 250, 200, 4, 3);
        // mencetak data rumah
        rumah1.printDataRumah();
    }
}
