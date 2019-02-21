package example.java.oop;

public class MainApplication{

    public static void main(String[] args){
        Sepeda polygon = new Sepeda();
        System.out.println("jumlah roda : "+ polygon.getJumlahRoda()+ " berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");

        polygon.meningkatkanSpeed(10);
        System.out.println("berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");

        polygon = new Sepeda();
        System.out.println("jumlah roda : "+ polygon.getJumlahRoda()+ " berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");
        
        System.out.println("berkecepatan: "+ polygon.kecepatanSekarang()+ " km/h");
    }
}