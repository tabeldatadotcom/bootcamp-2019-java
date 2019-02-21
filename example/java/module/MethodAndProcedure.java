package example.java.module;

public class MethodAndProcedure {

    public Integer perkalianBilangan(Integer bil1, Integer bil2){
        return bil1*bil2;
    }

    public String pembagianBilangan(){
        return "Halo ini dari procedure";
    }

    public void perkalian(String value){
        System.out.println(value);
    } 

    public void pembagian(){
        System.out.println("ini method perbagian");
    } 

    public String namaLengkap(String namaDepan, String namaBelakang){
        StringBuilder value = new StringBuilder()
            .append(namaDepan)
            .append(" ")
            .append(namaBelakang);
        return value.toString();
    }

    public static void main(String[] args){
        MethodAndProcedure obj = new MethodAndProcedure();
        obj.perkalian("Ini dari method perkalian yang diisi dengan parameter");    

       System.out.println("hasil perkalian dari 2 * 6 = "+ obj.perkalianBilangan(2, 6));
       System.out.println(obj.pembagianBilangan());
       System.out.println("tampilkan nama lengkap : "+ obj.namaLengkap("Dimas", "Maryanto"));

    //    System.out.println(args[0]+" " + args[1]);
        Mahasiswa mhs = new Mahasiswa();
        System.out.println("nama: "+ mhs.namaSiswa()+ " kelas: "+ mhs.kelas());

        Dosen dosen = new Dosen();
        System.out.println("nama dosen: "+ dosen.namaDosen());
    }

    public static void perkalianStatic(){
        System.out.println("ini method utama dengan static modifier");
    }
}