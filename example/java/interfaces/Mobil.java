package example.java.interfaces;

public class Mobil implements Mesin{

    private String mesin;

    public Mobil(){
        System.out.println("Ini adalah contructor");
    }

    public Mobil(String mesin){
        this.mesin =  mesin;
        System.out.println(mesin);
    }

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

    @Override
    public Integer getSize() {
        return null;
    }

    @Override
    public String getTire() {
        return null;
    }
    
}