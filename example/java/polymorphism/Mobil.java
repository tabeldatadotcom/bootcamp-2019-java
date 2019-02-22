package example.java.polymorphism;

public class Mobil extends Mesin {

    @Override
    public Integer getCylinder(){
        System.out.println("ini dari kelas anak");
        return super.getCylinder();
    }

    public Integer getCylinder(Integer value){
        System.out.println("ini dari kelas anak");
        return value;
    }

    public Integer getCylinder(String value){
        return Integer.valueOf(value);
    }

}