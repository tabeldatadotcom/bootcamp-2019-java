package example.java.arrays;

import java.util.Set;
import java.util.HashSet;

public class ArraySetCollection{

    public static void main(String[] args){
        Set<String> daftarMahasiswa = new HashSet<>();
        daftarMahasiswa.add("Dimas Maryanto");
        daftarMahasiswa.add("Hadi Siswanto");
        daftarMahasiswa.add("Hadi Siswanto");
        
        for(String data : daftarMahasiswa){
            System.out.println(data);
        }

        Object[] datas = daftarMahasiswa.toArray();
        System.out.println((String) datas[0]);
    }
}