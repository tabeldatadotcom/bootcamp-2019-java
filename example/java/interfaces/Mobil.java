package example.java.interfaces;

public class Mobil implements Mesin{

    @Override
    public void getMesin() {
        System.out.println("V8");
    }

    @Override
    public Integer getCylinder() {
        return 12;
    }

    public Integer getPort(){
        return port;
    }
    
}