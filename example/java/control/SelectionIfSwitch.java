package example.java.control;

public class SelectionIfSwitch{
    public static void main(String [] args){

        Integer bil1 = 1;
        Integer bil2 = 20;

        if (bil1 == bil2){
            System.out.println("bilangan hasilnya sama");
        } else {
            System.out.println("bilangan hasilnya tidak sama!");
        } 

        switch(bil1){
            case 1:  System.out.println("Satu"); break;
            case 2:  System.out.println("Dua");  break;
            case 3: System.out.println("Tiga"); break;
        }
    }
}