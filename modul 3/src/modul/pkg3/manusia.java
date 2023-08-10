package modul.pkg3;

public class manusia
{
   public String nama;
   public manusia(String n)
   {
       this.nama=n;
   }
   public String tampilkanNama()
   {
       return nama;
   }
   public void makan()
   {
       System.out.println("Nyam....Nyam.....Nyam....");
   }
   public void kerja()
   {
       System.out.println("Kerja....Kerja....");
   }
}
