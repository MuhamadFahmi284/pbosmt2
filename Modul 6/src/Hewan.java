public class Hewan
{String jenis,ciri;
    public void suara(){System.out.println("Suara Hewan");}
    public void berjalan(){System.out.println("Cara berjalan hewan");}
}
class Singa extends Hewan
{
    public void suara(){System.out.println("WaouWaou");}
    public void berjalan(){
        System.out.println("Berlari");
        System.out.println("=========================");
    }
}
class Elang extends Hewan
{
    public void suara(){System.out.println("Ieoookkkk");}
    public void berjalan(){
        System.out.println("Terbang");
        System.out.println("=========================");
    }
}
class Lebah extends Hewan
{
    public void suara(){System.out.println("Wungggg");}
    public void berjalan(){
        System.out.println("Terbang");
        System.out.println("========================");
    }
}
class Paus extends Hewan
{
    public void suara(){System.out.println("Booomm");}
    public void berjalan(){
        System.out.println("Berenang");
        System.out.println("=======================");
    }
}