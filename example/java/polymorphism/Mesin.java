package example.java.polymorphism;

public class Mesin{

    private Integer cylinder = 4;

    /**
     * @return the cylinder
     */
    public Integer getCylinder() {
        System.out.println("ini dari kelas induk");
        return cylinder;
    }

    /**
     * @param cylinder the cylinder to set
     */
    public void setCylinder(Integer cylinder) {
        this.cylinder = cylinder;
    }


    
}