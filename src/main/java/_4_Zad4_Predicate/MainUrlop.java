package _4_Zad4_Predicate;

import java.time.LocalDate;
import java.util.function.Predicate;

public class MainUrlop {
    public static void main(String[] args) {

        Urlop urlop1 = new Urlop(LocalDate.of(2017,7,13),
                LocalDate.of(2017,8,01));
        Urlop urlop2 = new Urlop(LocalDate.of(2019,3,10),
                LocalDate.of(2019,3,17));


        Predicate<Urlop> czyAktualnaDataWOkresieUrlopu =
                urlop -> {
            LocalDate dzisiaj = LocalDate.now();
            return !dzisiaj.isBefore(urlop.getDataOd())&&           //zamiast sprawdzać zakres urlopu sprawdzamy czy data nie jest przed ani za urlopem
                    !dzisiaj.isAfter(urlop.getDatado());
            };
        System.out.println(czyAktualnaDataWOkresieUrlopu.test(urlop1));
        System.out.println(czyAktualnaDataWOkresieUrlopu.test(urlop2));

        LocalDate dataDoSprawdzenia = LocalDate.of(2018,1,1);
        ZweryfikujUrlop zweryfikujUrlop = new ZweryfikujUrlop(dataDoSprawdzenia);

        System.out.println("Urlop trwa");





        }

    }

