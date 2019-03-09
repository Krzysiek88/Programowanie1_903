package _1_Zad1._3_Jedzacy;

import _1_Zad1._0_Kontrakt.IPotrafiacyJesc;

public class JedzacyMetodyInstancji implements IJedzacy {
    @Override
    public void jedz(IPotrafiacyJesc potrafiacyJesc, String cos) {
        potrafiacyJesc.jedz(cos);

    }
}
