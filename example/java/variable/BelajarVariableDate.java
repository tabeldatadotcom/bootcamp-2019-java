package example.java.variable;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class BelajarVariableDate{

    public static void main(String[] args){
        Date tanggal = new Date();

        LocalDate tanggalLocal = LocalDate.now();
        LocalDateTime timeLocal = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy MM dd hh:mm:ss");
        String text = timeLocal.format(formatter);
  
        System.out.println("tanggal saat ini : "+ tanggal);
        System.out.println("taggal saat ini local: "+ text);
        System.out.println("watu saat ini local : "+ timeLocal);
    }
}   