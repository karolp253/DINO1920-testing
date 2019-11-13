/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.mm;

/**
 * @author bikol
 */
public class MegaMnozenie {

    static boolean isNumeric(String strNum) {
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException | NullPointerException nfe) {
            return false;
        }
        return true;
    }

    public static String mnozenie(String a, String b) {
        if (!isNumeric(a) && !isNumeric(b)) {
            StringBuilder result = new StringBuilder();
            for (char i : a.toCharArray())
                for (char j : b.toCharArray())
                    result.append(i).append(j).append(", ");
            return result.substring(0, result.length() - 2);
        }

        int aa = Integer.parseInt(a);
        int bb = Integer.parseInt(b);

        if (aa <= 100 && bb <= 100) {
            return Integer.toString(aa * bb);
        } else {
            throw new IllegalArgumentException();
        }
    }
}
