package modul2pbo;

class volumekubus
{
    public static void main(String[]args)
    {
        double volume;
        kubus b2 = new kubus();
        b2.sisi=4;
        volume =b2.sisi*b2.sisi*b2.sisi;
        System.out.println("hasil perhitungan volume kubus adalah :" +volume);
    }
}
