package _1_Zad1;

import _1_Zad1._0_Kontrakt.IPotrafiacyJesc;

public class Czlowiek implements IPotrafiacyJesc {
    private String imie;
    public Czlowiek (){
        System.out.println("Tworzę człowieka!");
    }
    public Czlowiek (String imie){this.imie = imie;}



    public static void przywitajSię(){
        System.out.println("Cześć - metoda statyczna.");
    }

    public void ziewnij (){
        System.out.println("AAAAAaaaaaaAAAAAaaaaa - metoda instancji.");
    }

    public static void zerknijNa (String cos){
        System.out.println("Zerkam na: " + cos + " - metoda statyczna.");
    }

    public void przygladajSie (String czemus){
        System.out.println("Przygladam sie: " + czemus + " - metoda instancji.");
    }


    @Override
    public void jedz(String cos) {
        System.out.println( "Jem: " + cos );

    }

    @Override
    public String toString() {
        return "Czlowiek{" +
                "imie='" + imie + '\'' +
                '}';
    }
}




