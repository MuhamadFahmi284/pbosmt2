import javax.swing.JOptionPane;

public class player_input
{

    private static String String;
    public static void main(String[] args) 
    {
        int kecepatan;
        String nama;
        String temp;
        
        nama = JOptionPane.showInputDialog( "masukan nama :");
        nama=nama;
        temp = JOptionPane.showInputDialog( "masukan kecepatan  :");
        kecepatan =Integer.parseInt(temp);
        
        JOptionPane.showMessageDialog(null,nama + " sedang berlari" + " dengan kecepatan " + kecepatan + " km/jam");
        }
}