package _1_Zad1._2_Patrzacy;

import _1_Zad1.Czlowiek;
import _1_Zad1._0_Kontrakt.IPatrzacy;

public class PatrzacyMetodyStatycznej implements IPatrzacy {
    @Override
    public void patrzNa(String cos) {
        Czlowiek.zerknijNa(cos);

    }
}
