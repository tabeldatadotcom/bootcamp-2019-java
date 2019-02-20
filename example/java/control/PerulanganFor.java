package example.java.control;

public class PerulanganFor{
    public static void main(String[] args){

        Integer i = 0;

        // menampilkan nilai index ke 0 s/d 10
        for(i = 0; i < 11; i++){
            System.out.println("index ke "+ i);
        }

        // menampilkan nilai index ke 11 s/d 1
        for(i = 11; i > 0; i--){
            System.out.println("index ke "+ i);
        }
    }
}