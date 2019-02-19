package example.java.variable;

public class BelajarVariableBoolean{
    public static void main(String[] args){
        Boolean benar = false;

        System.out.println(benar);
        System.out.println(
            "Nilai dari variable benar adalah " +  (benar ? "Benar" : "Salah")
        );

        Integer nilaiUas = 100;
        System.out.println("Apakah anda lulus: "+ (nilaiUas == 100 ? "LULUS" : "TIDAK LULUS"));
    }
}