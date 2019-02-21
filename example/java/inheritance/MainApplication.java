package example.java.inheritance;

public class MainApplication{
    public static void main(String[] args){
        Motor kawasakiNinja = new Motor();
        System.out.println("Konfigurasi mesin: "+ kawasakiNinja.cylinder +" cylinder,  "+ kawasakiNinja.getExample());

        Mobil toyotaAvanza = new Mobil();
        System.out.println("Konfigurasi mesin: "+ toyotaAvanza.cylinder + " cylinder, "+ toyotaAvanza.getExample());
    }
}