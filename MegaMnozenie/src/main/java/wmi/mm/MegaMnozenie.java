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
public class MegaMnozenie 
{
    
    public static String mnozenie(String a, String b)
    {
        if(isParsableToInt(a) || isParsableToInt(b))
        {
            // "a" and "b" can be parsed to int
            if(isParsableToInt(a) && isParsableToInt(b))
            {
                int aa = Integer.parseInt(a);
                int bb = Integer.parseInt(b);
                if(aa <=100 && bb <=100)
                {
                    return Integer.toString(aa*bb);
                } 
                else 
                {
                    throw new IllegalArgumentException();
                }   
            }
            // Only "a" can be parsed to int OR
            // only "b" can be parsed to int
            else
            {
                // If "a" is number and "b" is some string ...
                if(isParsableToInt(a))
                {
                    // ... return "b" multiplied "a" times
                    int aa = Integer.parseInt(a);
                    return multiplyString(b, aa);
                    
                }
                // If "b" is number and "a" is some string ...
                else if(isParsableToInt(b))
                {
                    // ... return "a" multiplied "b" times
                    int bb = Integer.parseInt(b);
                    return multiplyString(a, bb);
                }
            }
        }
        // Both "a" and "b" can't be parsed to int
        else
        {
            throw new IllegalArgumentException();
        }
        
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
    
}

