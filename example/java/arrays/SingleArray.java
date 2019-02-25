package example.java.arrays;

public class SingleArray{

    public static void main(String[] args){
        Integer[] values = {1, 2, 3, 4, 5, 10, 50};
    
        System.out.println("tampilkan array sebelum di rubah");
        for(int i = 0; i < values.length; i++){
            System.out.println("i = "+ i +" bernilai " + values[i]);
        }

        values[2] = 10;
        System.out.println("tampilkan array setelah di rubah");
        for(int i = 0; i < values.length; i++){
            System.out.println("i = "+ i +" bernilai " + values[i]);
        }
    }
}