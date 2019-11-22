/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package wmi.sd;

import java.util.Random;
import static org.testng.Assert.*;

import org.junit.Assert;
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
    public void testPizzy(){
        String result = Dodawanie.dodawanie("Ser", "ser");
        assertEquals(result, "ser i ser :)");

        result = Dodawanie.dodawanie("Ser", "szynka");
        assertEquals(result, "ser i szynka :)");

        result = Dodawanie.dodawanie("Ser", "Ananas");
        assertEquals(result, "Nie.");

        result = Dodawanie.dodawanie("cebula", "bigos");
        assertNotEquals(result, "cebula i bigos :)");
    }
  
    @Test
    public void mergingTest(){
        String result = Dodawanie.dodawanie("BARDZO DZIWNY STRIIING!", "DURIG");
        assertEquals(result, "BARDZO DZIWNY STRIIING!"+"DURIG");

        result = Dodawanie.dodawanie("fasfasfa", "Dafsoafsopa");
        assertEquals(result, "fasfasfa" +"Dafsoafsopa");
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


    @Test
    public void testDodawanie5(){
        System.out.println("dodawanie5");
        String a = "aaa";
        String b = "bbb";

        try{
            Dodawanie.dodawanie(a,b);
            Assert.fail("Exception powinien zostać wrzucony.");
        }catch(NumberFormatException e){
            System.out.println("Exception został złapany.");
        }
    }

    @Test
    public void testDodawanie6(){
        System.out.println("dodawanie6");
        String a = "101";
        String b = "102";

        String expResult = "etam co mnie to";
        String result = Dodawanie.dodawanie(a,b);

        assertEquals(result, expResult);
    }
  
    @Test
    public void testDodawanie7() {
        System.out.println("dodawanie7");
        String a = "1250";
        String b = "8";
        String expected = "SPECJALNY WYNIK HEX DLA CIEBIE: 9c4";
        String result = Dodawanie.dodawanie(a, b);
        assertEquals(result, expected);
    }

    @Test
    public void testDodawanie8() {
        System.out.println("dodawanie8");
        Random r = new Random();
        for(int i = 0; i < 5; i++){
            int a = r.nextInt((1200 - 1100) + 1) + 1100;
            int b = r.nextInt(100);
            String expected = "HEX: " + Integer.toHexString(a+b);
            String result = Dodawanie.dodawanie(Integer.toString(a), Integer.toString(b));
            assertEquals(result, expected);
        }
    }
      
    @Test
    public void testDodawanieCyfry() {
        System.out.println("dodawanie Cyfr");

        String a = "Trzy";
        String b = "Jeden";

        String expResult = "4";
        String result = Dodawanie.dodawanie(a, b);
        assertEquals(result, expResult);
    }
    
    @Test
    public void testDodawanieTrzechCyfr() {
        System.out.println("dodawanie trzech liczb naraz");

        String a = "4;5;6";
        String b = "1;2;3";

        String expResult = "5;7;9";
        String result = Dodawanie.dodawanie(a, b);
        assertEquals(result, expResult);
    }
}


