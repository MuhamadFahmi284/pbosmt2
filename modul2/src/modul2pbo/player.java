package modul2pbo;

class player{
    //ini adalah atribut atau variabel
    String nama;
    int kecepatan;
    
    //ini adalah method atau fungsi
    void jalan(){
            System.out.println(nama +" sedang berlari");
            System.out.println("dengan kecepatan " + kecepatan + " km/jam");
}

            public static void main(String[] args){
            //ini adalah objek baru
            player orang = new player();

            //ini adalah atribut
            orang.nama="Fahmi";
            orang.kecepatan=100;

            //ini adalah method
            orang.jalan();
            }
}
