/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul1pbo;

/**
 *
 * @author ASUS
 */
public class tugas_mandiri {
    public static void main(String args[])
    {
    int p,l,t,vol,luas,kel;
    p =8;
    l =9;
    t =4;
    
    vol =p*l*t;
    luas = 2 * ((p*l)+(p*t)+(l*t));
    kel = 4*(p+l+t);
    
        System.out.println("---MENGHITUNG VOLUME,LUAS,KELILING BALOK---");
        System.out.println("p = 8\nL = 9\nT =4");
        System.out.println("Volume Balok    =" +vol);
        System.out.println("Luas Balok      =" +luas);
        System.out.println("Keliling Balok  =" +kel);
    }
}
