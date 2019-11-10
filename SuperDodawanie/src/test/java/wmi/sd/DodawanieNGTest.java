/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wmi.sd;

import java.util.Random;
import static org.testng.Assert.*;
import org.testng.annotations.Test;

/**
 *
 * @author bikol
 */
public class DodawanieNGTest {

    public DodawanieNGTest() {
    }

    /**
     * Test of dodawanie method, of class Dodawanie.
     */
    @Test
    public void testDodawanie1() {
        System.out.println("dodawanie");
        String a = "1";
        String b = "1";
        String expResult = "2";
        String result = Dodawanie.dodawanie(a, b);
        assertEquals(result, expResult);
    }
    
        @Test
    public void testDodawanie2() {
        System.out.println("dodawanie");
        Random  r = new Random();
        for(int i = 0;i<10;i++){
            int aa = r.nextInt(100);
            int bb = r.nextInt(100);
            String a = Integer.toString(aa);
            String b = Integer.toString(bb);
            
            String expResult = Integer.toString(aa + bb);
            String result = Dodawanie.dodawanie(a, b);
            assertEquals(result, expResult);
        }
    }
    
    @Test
    public void testDodawanie3() {
        System.out.println("dodawanie3");
        String a = "4.3";
        String b = "2";
        String expResult = "6.3";
        String result = Dodawanie.dodawanie(a, b);
        assertEquals(result, expResult);
    }
    
    @Test
    public void testDodawanie4() {
        System.out.println("dodawanie4");
        Random  r = new Random();
        for(int i = 0; i < 5; i++){
            float aa = r.nextFloat()*100;
            int bb = r.nextInt(100);
            String a = Float.toString(aa);
            String b = Integer.toString(bb);

            String expResult = Float.toString(aa + bb);
            String result = Dodawanie.dodawanie(a, b);
            assertEquals(result, expResult);
        }
    }
}
