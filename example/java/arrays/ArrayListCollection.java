package example.java.arrays;

import java.util.List;
import java.util.ArrayList;

public class ArrayListCollection{

    public static void main(String[] args){
        List<String> daftarMahasiswa = new ArrayList<>();
        daftarMahasiswa.add("Dimas Maryanto");
        daftarMahasiswa.add("Hadi Siswanto");

        for(String data : daftarMahasiswa){
            System.out.println(data);
        }

        System.out.println(
            "Index ke 1 dari daftar mahasiswa adalah " + 
            daftarMahasiswa.get(1) + 
            " dari jumlah data " + 
            daftarMahasiswa.size()
        );

        daftarMahasiswa.remove(0);
        System.out.println(
            "jumlah array sekarang adalah " + daftarMahasiswa.size()
        );

        for(String data : daftarMahasiswa){
            System.out.println(data);
        }
    }
}