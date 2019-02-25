package example.java.arrays;

import java.util.ArrayList;
import java.util.List;

public class GenericCollection{

    public static void main(String[] args){
        List<Example> values = new ArrayList<>();

        Example a = new Example();
        a.setNama("Dimas Maryanto");
        a.setActive(false);
        values.add(a);

        a = new Example();
        a.setNama("Muhamad husuf");
        a.setActive(false);
        values.add(a);
        
        values.forEach(v -> {
            System.out.println("nilai dari values "+ v.getNama() +", "+ v.isActive());
        });

    }
}