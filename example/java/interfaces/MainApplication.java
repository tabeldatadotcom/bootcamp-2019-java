package example.java.interfaces;

public class MainApplication{
    public static void main(String[] args){
        Mobil lamborghini = new Mobil("V8");
        lamborghini.getMesin();
        
        System.out.println("nama lamborghini jumlah cylinder : "+ lamborghini.getCylinder()+ " port : "+ lamborghini.getPort());

        Mesin zx10 = new Motor();
        zx10.getMesin();
        System.out.println("nama kawasaki zx10 jumlah cylinder : "+ zx10.getCylinder());
    }
}