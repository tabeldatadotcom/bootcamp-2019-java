package example.java.arrays;

import java.util.*;

public class ArrayMapCollection{
    public static void main(String[] args){
        Map<Integer, String> daftarMahasiswa = new HashMap<>();
        daftarMahasiswa.put(1 , "Dimas Maryanto");
        daftarMahasiswa.put(2 , "Hadi Siswanto");
        daftarMahasiswa.put(3 , "Hadi Siswanti");

        daftarMahasiswa.forEach((k, v) -> {
            System.out.println("key : "+ k + " , value : "+ v);
        });

        System.out.println(
            "Key ke 1 dari daftar mahasiswa adalah " + 
            daftarMahasiswa.get(1) + 
            " dari jumlah data " + 
            daftarMahasiswa.size()
        );

        daftarMahasiswa.remove(2);
        System.out.println(
            "jumlah array sekarang adalah " + daftarMahasiswa.size()
        );

        System.out.println();
        for(Map.Entry<Integer, String> entry : daftarMahasiswa.entrySet()){
            System.out.println("key : "+ entry.getKey()+" , value : "+ entry.getValue());
        }
    }
}