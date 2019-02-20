package example.java.control;

public class PerulanganWhileDo{
    public static void main(String[] args){
        Integer i = 11;
        while(i > 0){
            System.out.println("index ke "+ i);
            i--;
        }

        System.out.println("----------------");

        i = 11;
        do{
            i--;
            System.out.println("index ke "+ i);
        }while(i > 0);
    }
}