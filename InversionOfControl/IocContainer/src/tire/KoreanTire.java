package tire;

import Interface.Tyre;

public class KoreanTire implements Tyre {
    @Override
    public String rotate() {
        return "Korean tire not nice";
    }
}
