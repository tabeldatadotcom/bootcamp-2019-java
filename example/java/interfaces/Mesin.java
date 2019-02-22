package example.java.interfaces;

public interface Mesin extends Rantai, Ban {
    Integer port = 10;

    public void getMesin();

    public Integer getCylinder();
}