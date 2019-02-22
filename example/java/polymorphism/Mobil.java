package example.java.polymorphism;

public class Mobil extends Mesin {

    @Override
    public Integer jumlahCylinder(){
        return 6;
    }

    public Integer jumlahCylinder(Integer value, Integer value2){
        return value + value2;
    }

    public Integer jumlahCylinder(String value){
        return Integer.valueOf(value);
    }

}