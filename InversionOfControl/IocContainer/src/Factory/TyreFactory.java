package Factory;

import Interface.Tyre;
import tire.AmericanTire;
import tire.KoreanTire;

public class TyreFactory {
    public Tyre getTyre(String tireType){
        if(tireType == null){
            return null;
        }
        if(tireType.equalsIgnoreCase("AMERICAN")){
            return new AmericanTire();
        }else if(tireType.equalsIgnoreCase("KOREAN")){
            return new KoreanTire();
        }
        return null;
    }
}
