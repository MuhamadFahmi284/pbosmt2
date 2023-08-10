class Bentuk{
    public void gambar(){System.out.println("Menggambar");}
    public void hapus(){System.out.println("Menghapus gambar\n");}
}
class lingkaran extends Bentuk{
    public void gambar(){System.out.println("Gambar Lingkaran");}
    public void hapus(){System.out.println("Hapus Lingkaran");}
}
class Elips extends Bentuk{
    public void gambar(){System.out.println("Gambar Elips");}
    public void hapus(){System.out.println("Hapus Elips");}
}
class segitiga extends Bentuk{
    public void gambar(){System.out.println("Gambar Segitiga");}
    public void hapus(){System.out.println("Hapus Segitiga");}
}
public class TesBentuk{
public static void main(String[]args){
    Bentuk b= new Bentuk();
    lingkaran l=new lingkaran();
    Elips e= new Elips();
    segitiga s= new segitiga();
    System.out.println("Bentuk");
    b.gambar();b.hapus();
    System.out.println("Bentuk Lingkaran");
    l.gambar();l.hapus();
    System.out.println("Bentuk Elips");
    e.gambar();e.hapus();
    System.out.println("Bentuk Segitiga");
    s.gambar();s.hapus(); 
}
}