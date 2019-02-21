package example.java.module;

public class MethodAndProcedure {

    public Integer perkalianBilangan(){
        pembagianBilangan();
        perkalianStatic();
        return 2*4;
    }

    public String pembagianBilangan(){
        return "Halo ini dari procedure";
    }

    public void perkalian(){
        System.out.println("ini method perkalian");
        pembagian();
    } 

    public void pembagian(){
        System.out.println("ini method perbagian");
    } 

    public static void main(String[] args){
        MethodAndProcedure obj = new MethodAndProcedure();
        obj.perkalian();    

       System.out.println("hasil perkalian dari 2 * 4 = "+ obj.perkalianBilangan());
       System.out.println(obj.pembagianBilangan());
    }

    public static void perkalianStatic(){
        System.out.println("ini method utama dengan static modifier");
    }
}