package _2_Zad2_Consumer;

import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        //Consumer <String> konsument = ciagZnakow -> System.out.println(ciagZnakow.toUpperCase());
       // konsument.accept("cos tam");
       // konsument.accept("");


        Consumer <Integer> liczby = dowolnaLiczba -> System.out.println(dowolnaLiczba*dowolnaLiczba);
        liczby.accept(5);


        Consumer <String> wielkieLitery =
                ciagZnakow -> System.out.println(ciagZnakow.toUpperCase());

        Consumer <String> dlugosc =
                ciagZnakow -> System.out.println(ciagZnakow.length());
        Consumer<String> kompozyt = wielkieLitery.andThen(dlugosc);


        kompozyt.accept("cos tam");


    }
}
