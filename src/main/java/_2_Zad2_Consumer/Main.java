package _2_Zad2_Consumer;

import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.LongConsumer;

public class Main {
    public static void main(String[] args) {
        Consumer <String> konsument = ciagZnakow -> System.out.println(ciagZnakow.toUpperCase());
        konsument.accept("cos tam");
        konsument.accept("");




        Consumer <Integer> liczby = dowolnaLiczba -> System.out.println(dowolnaLiczba*dowolnaLiczba); //dowolna liczba - parametr typu int zadeklarowany w Consumerze
        liczby.accept(5);       // ciało lambdy sout parametr razy parametr.  wywołanie lambdy liczby.accept  i podanie paramteru "dowolna liczba"


        Consumer <String> wielkieLitery =
                ciagZnakow -> System.out.println(ciagZnakow.toUpperCase());

        Consumer <String> dlugosc =
                ciagZnakow -> System.out.println(ciagZnakow.length());
        Consumer<String> kompozyt = wielkieLitery.andThen(dlugosc);


        kompozyt.accept("cos tam");


    }
}
