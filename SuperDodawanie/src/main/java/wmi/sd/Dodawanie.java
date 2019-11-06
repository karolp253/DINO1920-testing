/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.sd;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    public static String dodawanie(String a, String b) throws IllegalArgumentException{
        if(!isInteger(a)) {
            return dodawanieFloatDoInt(a, b);
        } else if(isValidNumber(a) && isValidNumber(b)) {
            int aa = Integer.valueOf(a);
            int bb = Integer.valueOf(b);

            if(aa<=100 && bb<=100){
                return Integer.toString(aa+bb);
            }
            return "etam co mnie to";
        }
        else{
            throw new IllegalArgumentException("Co najmniej jeden z argumentow nie jest liczba");
        }
    }
    
    private static boolean isInteger(String s){
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e){ 
            return false; 
        }
        return true;
    }
            
    private static String dodawanieFloatDoInt(String a, String b){
        float aa = Float.valueOf(a);
        int bb = Integer.valueOf(b);
        System.out.println(aa+bb);
        return Float.toString(aa+bb);
    }

    private static boolean isValidNumber(String a) {
        return a.matches("[0-9]+");
    }
}
