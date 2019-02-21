package example.java.oop;

public class MainApplication{

    public static void main(String[] args){
        Sepeda polygon = new Sepeda();
        System.out.println("polygon jumlah roda : "+ polygon.getJumlahRoda()+ " berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");

        polygon.meningkatkanSpeed(10);
        System.out.println("polygon berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");

        Sepeda asdkfld = new Sepeda();
        System.out.println("asdkfld jumlah roda : "+ asdkfld.getJumlahRoda()+ " berkecepatan: "+ asdkfld.kecepatanSekarang()+ " km/h");
        
        System.out.println("asdkfld berkecepatan: "+ asdkfld.kecepatanSekarang()+ " km/h");

        polygon.meningkatkanSpeed(10);
        System.out.println("polygon berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");   
    }
}