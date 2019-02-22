package example.java.interfaces;

public class Motor implements Mesin{

    @Override
    public void getMesin() {
        System.out.println("Inline 4");
    }

    @Override
    public Integer getCylinder() {
        return 4;
    }

}