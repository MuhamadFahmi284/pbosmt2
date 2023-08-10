import javax.swing.JOptionPane;

public class baloktuman 
{
    public static void main(String[] args) 
    {
        int volume,panjang,lebar,tinggi;
       String temp;
        
        temp = JOptionPane.showInputDialog(null, "masukan panjang :");
        panjang =Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "masukan lebar  :");
        lebar =Integer.parseInt(temp);
        temp = JOptionPane.showInputDialog(null, "masukan tinggi :");
        tinggi =Integer.parseInt(temp);
        
        volume = panjang*lebar*tinggi;
        JOptionPane.showMessageDialog(null, "volume balok :" +volume +"cm3");
    }
}

