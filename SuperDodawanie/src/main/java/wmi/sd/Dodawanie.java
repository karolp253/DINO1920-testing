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
	public static String dodawanie(String a, String b){
		List<String> Cyfry = Arrays.asList("Jeden", "Dwa", "Trzy", "Cztery", "Pięć", "Sześć", "Siedem", "Osiem", "Dziewięć", "Zero");
        char[] charactersA = a.toCharArray();
        char[] charactersB = b.toCharArray();
		if(!isInteger(a)) {
        	if(Cyfry.contains(a) && Cyfry.contains(b)) {
        		int aa = cyfryToInt(a);
        		int bb = cyfryToInt(b);
        		String cc = String.valueOf(aa+bb);
        		return cc;
        	} else if(charactersA[1]==';' && charactersA[3]==';' && charactersB[1]==';' && charactersB[3]==';' && charactersA.length==5 && charactersB.length==5) {
        		int a1 = Character.getNumericValue(charactersA[0]);
        		System.out.println(a1);
        		int a2 = Character.getNumericValue(charactersA[2]);
        		System.out.println(a2);
        		int a3 = Character.getNumericValue(charactersA[4]);
        		System.out.println(a3);
        		int b1 = Character.getNumericValue(charactersB[0]);
        		System.out.println(b1);
        		int b2 = Character.getNumericValue(charactersB[2]);
        		System.out.println(b2);
        		int b3 = Character.getNumericValue(charactersB[4]);
        		System.out.println(b3);
        		int c1 = a1+b1;
        		System.out.println(c1);
        		int c2 = a2+b2;
        		int c3 = a3+b3;
        		String dd = c1+";"+c2+";"+c3;
        		return dd;
        	}
            return dodawanieFloatDoInt(a, b);
        } else {
            int aa = Integer.valueOf(a);
            int bb = Integer.valueOf(b);

            if(aa<=100 && bb<=100){
                return Integer.toString(aa+bb);
            }
            return "etam co mnie to";
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
    
    private static int cyfryToInt(String a) {
    	if (a.equals("Zero")) {
    		return 0;
    	} else if(a.equals("Jeden")) {
    		return 1;
    	} else if(a.equals("Dwa")) {
    		return 2;
    	} else if(a.equals("Trzy")) {
    		return 3;
    	} else if(a.equals("Cztery")) {
    		return 4;
    	} else if(a.equals("Pięć")) {
    		return 5;
    	} else if(a.equals("Sześć")) {
    		return 6;
    	} else if(a.equals("Siedem")) {
    		return 7;
    	} else if(a.equals("Osiem")) {
    		return 8;
    	} else if(a.equals("Dziewięć")) {
    		return 9;
    	} else {
    		return -1;
    	}
    	
    	
    }
    
    
}
