package example.java.control;

public class StatementBreackContinues {
    public static void main(String[] args){
        for(int i = 0 ; i< 100; i++){
            if(i == 5) break;
            System.out.println("index ke "+ i);
        }

        for(int i = 0 ; i< 10; i++){
            if(i == 5) continue;
            System.out.println("index ke "+ i);
        }
    }
}