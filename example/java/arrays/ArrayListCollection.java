package example.java.arrays;

import java.util.List;
import java.util.ArrayList;

public class ArrayListCollection{

    public static void main(String[] args){
        List<String> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add("Dimas Maryanto");
        daftarMahasiswa.add("Hadi Siswanto");
        daftarMahasiswa.add("Hadi Siswanto");
        
        for(String data : daftarMahasiswa){
            System.out.println(data);
        }

    }
}