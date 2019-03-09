package _1_Zad1._3_Jedzacy;

import _1_Zad1.Czlowiek;
import _1_Zad1._0_Kontrakt.IPotrafiacyJesc;

public class Main {
    public static void main(String[] args) {
        IJedzacy jawna = new JedzacyMetodyInstancji();
        Czlowiek czlowiek = new Czlowiek();


        IJedzacy wLocie = new IJedzacy() {
            @Override
            public void jedz(IPotrafiacyJesc potrafiacyJesc, String cos) {
                potrafiacyJesc.jedz(cos);
            }
        };
        wLocie.jedz(czlowiek, "kabanos");

        IJedzacy lambda = (potrafiacyJesc, cos) -> potrafiacyJesc.jedz(cos);
        lambda.jedz(new Czlowiek(), "banan");


        IJedzacy ref = IPotrafiacyJesc::jedz;
        ref.jedz(czlowiek, "kwiwi");

    }
}
