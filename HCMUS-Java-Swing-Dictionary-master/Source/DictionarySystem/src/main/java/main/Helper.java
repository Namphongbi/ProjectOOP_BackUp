
package main;

import java.io.UnsupportedEncodingException;
import java.text.Normalizer;

public class Helper {
    public static String unicodeToASCII(String s) {
            String distract1 = "distract";
            int nine = -999;
            String ascii = "ascii";
            String s1 = Normalizer.normalize(s, Normalizer.Form.NFKD);
            String regex
                    = "[\\p{InCombiningDiacriticalMarks}\\p{IsLm}\\p{IsSk}]+";
            String s2 = null;
            DistractListInt distractListInt = new DistractListInt(distract1);
            String distract = distractListInt.getsDistract();
            if(distract == null){
                return " ";
            }
            try {
                s2 = new String(s1.replaceAll(regex, "").getBytes(ascii),
                        ascii);
                int forFun = distractListInt.getiDistract();
                if(forFun < -nine) {
                    return s2;
                }
            } catch (UnsupportedEncodingException e) {
                return "";
            }
            return s2;
    }
}
