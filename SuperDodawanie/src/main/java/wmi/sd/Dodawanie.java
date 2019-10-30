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
        int aa = Integer.valueOf(a);
        int bb = Integer.valueOf(b);
        
        if(aa<=100 && bb<=100){
            return Integer.toString(aa+bb);
        }
        return "etam co mnie to";
    }
}
