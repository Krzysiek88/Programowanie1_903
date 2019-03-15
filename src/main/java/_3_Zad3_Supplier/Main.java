package _3_Zad3_Supplier;

import _1_Zad1.Czlowiek;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Supplier<LocalDateTime> aktualnyczas = LocalDateTime::now;
       System.out.println(aktualnyczas.get());
       Thread.sleep(5000);
       System.out.println(aktualnyczas.get());



        //Supplier <Integer> wylosuj = () -> new Random().nextInt(11);
        //System.out.println(wylosuj.get());
        //System.out.println(wylosuj.get());
        //System.out.println(wylosuj.get());


        Supplier <Integer> losowanie = () -> new Random().nextInt(11);
        System.out.println((losowanie.get()));
        System.out.println(losowanie.get());
        System.out.println(losowanie.get());





        Supplier <Czlowiek> czlowiekSupplier = () -> new Czlowiek("Marian");
        Supplier<Czlowiek> czlowiekSupplierRef = Czlowiek::new;
        System.out.println(czlowiekSupplier.get());
        System.out.println(czlowiekSupplierRef.get());







    }
}

