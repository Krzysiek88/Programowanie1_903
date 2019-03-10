package _4_Zad4_Predicate;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainFunktion {
    public static void main(String[] args) {

        Pracownik janKowalski = new Pracownik("Jan", "Kowalski");

        //Function<Pracownik, String> inicjaly = pracownik ->
               // pracownik.getName().charAt(0) + " " + pracownik.getLastname().charAt(0);    //sprawdzic w dokumentacji funkcjonowanie charAt (zwraca inicjaly)
                                                                                                //sprawdzic czemu to nie dziala - null pointer
       // System.out.println(inicjaly.apply(janKowalski));


        janKowalski.setUrlop(new Urlop(
                LocalDate.of(2017,7,13),
                LocalDate.of (2018,8,2)
        ));


        //Function <Pracownik,Integer> iloscDni= pracownik ->
          //      Period.between(pracownik.getUrlop().getDataOd(),
            //            pracownik.getUrlop().getDatado().to

    }

    ;

    //Function<Pracownik,Integer>pracownikNaUrlop = pracownik ->
    // pracownik.getUrlop().getDataOd()

}

