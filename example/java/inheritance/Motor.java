package example.java.inheritance;

public class Motor extends Mesin{
    private String manufacture = "Honda";

    public Motor(){
        cylinder = 2;
    }

    public String getExample(){
        return this.manufacture;
    }
}