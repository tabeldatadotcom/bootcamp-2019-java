package example.java.variable;

public class BelajarVariableString{
    public static void main(String[] args){
        Character singleCharacter = '1';
        String multipleCharacter = "Halo ini adalah sebuah kalimat";

        System.out.println("single character = "+ singleCharacter);
        System.out.println("multiple character "+ multipleCharacter);

        System.out.println("multiple character dengan concat = "+ multipleCharacter.concat(singleCharacter.toString()));
        System.out.println("multiple chracter dengan length = "+ multipleCharacter.length());

        System.out.println("multipe character dari index ke 3 = "+ multipleCharacter.charAt(3));
        System.out.println("multple character dari 3 sampe 7 = "+ multipleCharacter.substring(3, 7));
    }
}