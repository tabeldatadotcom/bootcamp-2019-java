package example.java.control;

public class NestedControl{
    public static void main(String[] args){

        for(int i = 0; i < 5; i++){
            if(i % 2 == 0){
                System.out.print(i +" : ");
                for(int j = 0; j < i; j++){
                    if(j % 2 == 1){
                        System.out.print(j+ ", ");
                    }
                }                   
                System.out.println();
            }
        }
    }
}