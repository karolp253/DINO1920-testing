/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.sd;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author bikol
 */
public class Dodawanie {
    public static String dodawanie(String a, String b) throws IllegalArgumentException {

        PizzaFactory pizzaFactory = new PizzaFactory();
        if (pizzaFactory.CanMakePizza(a,b)){
            return pizzaFactory.Make(a,b);
        }
       if(!isInteger(a)) {
            return dodawanieFloatDoInt(a, b);
        } else if(isValidNumber(a) && isValidNumber(b)) {
            int aa = Integer.valueOf(a);
            int bb = Integer.valueOf(b);

            if(aa<=100 && bb<=100){
                return Integer.toString(aa+bb);
            }
            if(!isInteger(b)){
                return "Niedozwolona operacja";
            }
            if(aa>=1000 && aa<=1200){
                int wynik = aa + bb;
                return "HEX: " + Integer.toHexString(wynik);
            }
            else if (aa>1200 && aa<=1300) {
                int wynik = aa + aa;
                return "SPECJALNY WYNIK HEX DLA CIEBIE: " + Integer.toHexString(wynik);
            }

            return "etam co mnie to";
        }
        else{
            throw new IllegalArgumentException("Co najmniej jeden z argumentow nie jest liczba");
        }

        try {
            int aa = Integer.parseInt(a);
            int bb = Integer.parseInt(b);

            if (aa <= 100 && bb <= 100) {
                return Integer.toString(aa + bb);
            }
        }
        catch (java.lang.NumberFormatException e) {
         
        }
        
        
        
        
        return a+b;
    }
    static class PizzaFactory{
        /*Jedyna na świecie fabryka produkująca pizzę ze stringów!*/

        //masz nowy pomysł na składniki? Dodaj je
       List<String> allowedIngridients = Arrays.asList("ser", "kiełbasa", "sos czosnkowy", "szynka", "kukurydza", "kurczak");
        List<String> forbiddenIngridients = Arrays.asList("ananas", "keczup", "musztarda");

        PizzaFactory(){

        }
        boolean CanMakePizza(String a, String b){
           return  (allowedIngridients.contains(a.toLowerCase())||forbiddenIngridients.contains(a.toLowerCase())) &&( allowedIngridients.contains(b.toLowerCase())||forbiddenIngridients.contains(b.toLowerCase()));
        }
       String Make(String ingridient1, String ingridient2){
            if (forbiddenIngridients.contains(ingridient1.toLowerCase()) || forbiddenIngridients.contains(ingridient2.toLowerCase())){
                return "Nie.";
            }
            else{
                return ingridient1.toLowerCase()+" i "+ingridient2.toLowerCase()+" :)";
            }
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
