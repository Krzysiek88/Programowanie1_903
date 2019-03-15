package _6_Proby;

import java.util.function.IntConsumer;

public class Main {


    public static void repeat(int n, IntConsumer action){
            for (int i = 0; i < n; i++) action.accept(i);



    }

    public static void main(String[] args) {
        repeat(10,i -> System.out.println("Odliczanie: " + (9-i)));
    }
}

