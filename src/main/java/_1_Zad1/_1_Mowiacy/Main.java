package _1_Zad1._1_Mowiacy;

import _1_Zad1.Czlowiek;
import _1_Zad1._0_Kontrakt.IPatrzacy;
import _1_Zad1._0_Kontrakt.ITworzacy;
import _1_Zad1._0_Kontrakt.Imowiacy;
import _1_Zad1._2_Patrzacy.PatrzacyMetodyStatycznej;
import _1_Zad1._2_Patrzacy.PatrzącyMetodyInstancji;

public class Main {
    public static void main(String[] args) {
        Imowiacy jawna = new MowiacyMetodyStatycznej(); // metoda jawna, wywołujemy nową instancję z klasy MMS, która ma zaimplementowany interfejs Imowiacy
        jawna.powiedzCos();


        Imowiacy wLocie = new Imowiacy() {              //metoda niejawna (w locie) - omijamy obiekt i "tworzymy instancję" interfejsu
            @Override
            public void powiedzCos() {
                Czlowiek.przywitajSię();
            }
        };
        wLocie.powiedzCos();


        Imowiacy lambda = () -> Czlowiek.przywitajSię();        //lambda - czlowiek i metoda z interfejsu ze strzałką
        lambda.powiedzCos();



        Imowiacy methodRef = Czlowiek::przywitajSię;            //referencje - jeśli tylko betoda nie przyjmuje żadnych argumetnów można ją załatwić referencjami
        methodRef.powiedzCos();

        Imowiacy jawna1 = new MowiacyMetodyInstancji(); // znowu tworzymy "zmienna" który tak naprawdę jest obiektem klasy MMI która implementuje interfejs
        jawna1.powiedzCos();                            // wywołujemy metodę interfejsu
        new Czlowiek().ziewnij();                       // wywołujemy metodę instacji ziewnij

        Imowiacy wLocie1 = new Imowiacy() {             // od razu "obiekt interfejsu"
            @Override
            public void powiedzCos() {                  //wywołanie metody interfejsu, która wywołuje metodę instacji człowiek (ziewnij)
                new Czlowiek().ziewnij();
            }
        };

        Imowiacy lambda1 = () -> new Czlowiek().ziewnij();       // lambda Interfejs - nowy obiekt klasy czlowiek i wywołanie metody tej instancji
        lambda1.powiedzCos();                                     // wywołanie metody instancji przez wywołanie metody statycznej z interfejsu

        Czlowiek czlowiek = new Czlowiek();                     // stworzenie noweg obiektu klasy człowiek
        Imowiacy ref1 = czlowiek::ziewnij;                      // obiekt interfejsu = nowy obiekt klasy instancji i metoda tej instancji
        ref1.powiedzCos();                                      // wywołanie metody statycznej ktora wywola metodę instancji


        Imowiacy ref2 = new Czlowiek()::ziewnij;                  // jw. tylko tworzenie nowego obiektu klasy człowiek dzieje się na bieżąco i od razu wywoływana jest jego metoda
        ref2.powiedzCos();                                      // wywołanie metody statycznej, która wywoła metodę instancji






        IPatrzacy jawna2 = new PatrzacyMetodyStatycznej();
        jawna2.patrzNa("tablica");                          //wywołanie metody k


        IPatrzacy wLocie2 = new IPatrzacy() {
            @Override
            public void patrzNa(String cos) {
                Czlowiek.zerknijNa(cos);
            }
        };
        wLocie2.patrzNa("stół");                        //wywołanie metody zadanej w instrukcji wLocie2

        IPatrzacy lambda2 = (cos -> Czlowiek.zerknijNa(cos));
        lambda2.patrzNa("ławka");                       // wywołanie metody zadanej w instrukcji lamdba2

        IPatrzacy ref3 = Czlowiek ::zerknijNa;
        ref3.patrzNa("kabanos" );



       IPatrzacy jawna3 = new PatrzącyMetodyInstancji();
       jawna3.patrzNa("Tv");


       IPatrzacy wLocie3 = new IPatrzacy() {        //tworzenie w locie jako nowy obiekt z metodą interfejsu
           @Override
           public void patrzNa(String cos) {
               new Czlowiek().przygladajSie(cos);      //nowy człowiek z metodą instacji
           }
       };
       wLocie3.patrzNa("parowke");                  // wywołanie metody interfejsu, która wywola metodę instancji i wskaze dany obiekt
        System.out.println();

        Czlowiek jakisczlowiek = new Czlowiek();           //stworzenie nowego obiektu klasy czlowiek, żeby nie towrzyc przy lambdach


        System.out.println("Implementacja jako lambda dla jawnie stworzonej instacji.");
        IPatrzacy patrzacyLambda = cos -> jakisczlowiek.przygladajSie(cos);             // Stworzenie "obiektu interfejsu" z jego metodą = podanie "parametru"
                                                                                        // coś i przekazanie jej metodzie instancji
                                                                                        // w metodzie instancji nie podajemy wartosci parametru, podajemy go dopiero w metodzie interfejsu
        patrzacyLambda.patrzNa("kompa");                                            //wywołanie metody instancji poprzez wywołanie metody interfejsu
        System.out.println();


        System.out.println( "Implementacja jako referencja metoda dla jawnie stworzonej instancji.");
        IPatrzacy patrzacyReferencjiMetody = jakisczlowiek:: przygladajSie;                //Obiekt interfejsu = obiekt klasy czlowiek utowrzony powyzej i referencja do metody interfejsu
        patrzacyReferencjiMetody.patrzNa("kaszanka");           //wywołanie metody instancji poprzez wywołanie metody interfejsu i podanie parametru



    }


}
