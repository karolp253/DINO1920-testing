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

    public static String mnozenie(String a, String b)
    {
        // both "a" and "b" are double or int
        if(isParsableToDouble(a) && isParsableToDouble(b))
        {
            // both "a" and "b" are int
            if(isParsableToInt(a) && isParsableToInt(b)){
                int aa = Integer.parseInt(a);
                int bb = Integer.parseInt(b);
                return Integer.toString(aa * bb);
            }
            // one of them is double
            else {
                double aa = Double.parseDouble(a);
                double bb = Double.parseDouble(b);
                double result = aa * bb;
                System.out.println(result);
                return Double.toString(result);
            }
        }
        else if (isParsableToInt(a) && !isParsableToInt(b))
        {
            int aa = Integer.parseInt(a);
            return multiplyString(b, aa);
        }
        else if (!isParsableToInt(a) && isParsableToInt(b))
        {
            int bb = Integer.parseInt(b);
            return multiplyString(a, bb);
        }
        else {
            StringBuilder result = new StringBuilder();
            for (char i : a.toCharArray())
                for (char j : b.toCharArray())
                    result.append(i).append(j).append(", ");
            return result.substring(0, result.length() - 2);
        }
    }

    public static  int mnozenieWileluInt (int arg0, int...args){
        int wynik = arg0;
        for (int i = 0; i < args.length; i++){
            wynik *= args[i];
        }
        return wynik;
    }

    // Method checks if given String is parsable to int
    public static boolean isParsableToInt(String value)
    {
        try
        {
            Integer.parseInt(value);
            return true;
        }
        catch (NumberFormatException e)
        {
            return false;
        }
    }


    public static String multiplyString(String stringToMultiply, int howManyTimes)
    {
        String result = "";
        for(int i = 0; i < howManyTimes; i ++)
        {
            result += stringToMultiply;
        }
        return result;
    }


    private static boolean isParsableToDouble(String value){
        try{
            Double.parseDouble(value);
            return true;
        }
        catch (NumberFormatException e){
            return false;
        }
    }
}