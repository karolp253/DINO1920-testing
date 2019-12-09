/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.mm;
import java.io.IOException;
import java.util.Arrays;
/**
 * @author bikol
 */

class MegaMnozenie {

    static String mnozenie(String a, String b) {
        if(ifContainsPowerSymbol(a)){
            return powerInt(a, b);
        }
        else{
            if (isSpaceInString(a) && isSpaceInString(b)) {
                return multiplyStringWithSpaces(a, b);
            } else {
                // both "a" and "b" are double or int
                if (isParsableToDouble(a) && isParsableToDouble(b)) {
                    // both "a" and "b" are int
                    if (isParsableToInt(a) && isParsableToInt(b)) {
                        int aa = Integer.parseInt(a);
                        int bb = Integer.parseInt(b);
                        return Integer.toString(aa * bb);
                    }
                    // one of them is double
                    else {
                        double aa = Double.parseDouble(a);
                        double bb = Double.parseDouble(b);
                        double result = aa*bb;
                        return Double.toString(result);
                    }
                }
                // second one is string
                else if (isParsableToInt(a) && !isParsableToInt(b)) {
                    int aa = Integer.parseInt(a);
                    return multiplyString(b, aa);
                }
                // first one is string
                else if (!isParsableToInt(a) && isParsableToInt(b)) {
                    int bb = Integer.parseInt(b);
                    return multiplyString(a, bb);
                } else if (isLetterInStringAndDigit(a, b)) {
                    throw new IllegalArgumentException();
                }
                // Both "a" and "b" can't be parsed
                else {
                    StringBuilder result = new StringBuilder();
                    for (char i : a.toCharArray())
                        for (char j : b.toCharArray())
                            result.append(i).append(j).append(", ");
                    return result.substring(0, result.length() - 2);
                }
            }
        }
    }

    static  int mnozenieWileluInt (int arg0, int...args){
        int wynik = arg0;

        for (int i = 0; i < args.length; i++){
            wynik *= args[i];
        }
        return wynik;

    }

    // Method checks if given String is parsable to int
    private static boolean isParsableToInt(String value) {
        try {
            Integer.parseInt(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    private static boolean isLetterInStringAndDigit(String a,String b){
        boolean isDigitAorB=false;
        boolean isLetterAorB=false;
        for(char x : a.toCharArray()){
            if(Character.isAlphabetic(x)){
                isLetterAorB=true;
            }
        }
        for(char x : b.toCharArray()){
            if(Character.isAlphabetic(x)){
                isLetterAorB=true;
            }
        }
        for(char x : a.toCharArray()){
            if(Character.isDigit(x)){
                isDigitAorB=true;
            }
        }
        for(char x : b.toCharArray()){
            if(Character.isDigit(x)){
                isDigitAorB=true;
            }
        }
        return isDigitAorB && isLetterAorB;
    }

    private static String multiplyString(String stringToMultiply, int howManyTimes) {
        String result = "";

        for (int i = 0; i < howManyTimes; i++) {
            result += stringToMultiply;
        }
        return result;
    }

    private static boolean isSpaceInString(String a){
        return a.contains(" ");
    }

    private static int countSpacesInString(String a){
        int count = 0;
        int index_of_space = 0;
        String substring_of_a;
        do{
            index_of_space = a.indexOf(" ");
            substring_of_a = a.substring(index_of_space+1);
            a=substring_of_a;
            count++;
        }while(index_of_space!=-1);
        return count-1;
    }

    private static String multiplyStringWithSpaces(String first,String second){
        String result="";

        int spacesInFirst = countSpacesInString(first);
        int spacesInSecond = countSpacesInString(second);

        String[] first_splited = first.split(" ");
        String[] second_splited = second.split(" ");

        int i=0;
        if(spacesInFirst<spacesInSecond){
            String[] arrayResult = new String[spacesInFirst+1];
            for(String x:first_splited){
                arrayResult[i] = MegaMnozenie.mnozenie(x,second_splited[i]);
                i++;
            }
            result= Arrays.toString(arrayResult);
            result=result.substring(1, result.length()-1).replace(",", "");
        }
        else {
            String[] arrayResult = new String[spacesInSecond+1];
            for(String x:second_splited){
                arrayResult[i] = MegaMnozenie.mnozenie(x,first_splited[i]);
                i++;
            }
            result= Arrays.toString(arrayResult);
            result=result.substring(1, result.length()-1).replace(",", "");
        }
        return result;
    }

    private static boolean isParsableToDouble(String value){
        try{
            Double.parseDouble(value);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    private static boolean ifContainsPowerSymbol(String value){
        return value.contains("^");
    }

    private static String powerInt(String a, String b){

        String clearA = a.replace("^", "");
        if(b.equals("0"))
            return "1";
        if(b.equals("1"))
            return clearA;
        String result = clearA;
        for(int i = 1; i < Integer.parseInt(b); i++){
            result = mnozenie(result, clearA);
        }
        return result;
    }
}
