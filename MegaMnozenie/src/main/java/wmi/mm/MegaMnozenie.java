/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.mm;

/**
 *
 * @author bikol
 */
public class MegaMnozenie {
    public static String mnozenie(String a, String b){
        if (isInteger(a) && isInteger(b)){
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);
            return Integer.toString(aa*bb);
        }
        else{
            double aa = Double.parseDouble(a);
            double bb = Double.parseDouble(b);
            double result = Math.round(aa * bb * 100.0) / 100.0;
            return Double.toString(result);
            }
        }
    private static boolean isInteger(String a){
        double number = Double.parseDouble(a);
        return (number % 1 == 0);
    }
}
