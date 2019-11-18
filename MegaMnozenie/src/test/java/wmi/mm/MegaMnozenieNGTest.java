/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wmi.mm;

import java.util.Random;
import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author bikol
 */
public class MegaMnozenieNGTest {

    public MegaMnozenieNGTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of mnozenie method, of class MegaMnozenie.
     */
    @Test
    public void testMnozenie() {
        System.out.println("mnozenie");
        String a = "0";
        String b = "0";
        String expResult = "0";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }
    @Test
    public void testMnozenie2() {
        System.out.println("mnozenie");
        String a = "1";
        String b = "1";
        String expResult = "1";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }
    @Test
    public void testMnozenie3() {
        System.out.println("mnozenie");
        Random r = new Random();
        for(int i=0;i<100;i++){
            int aa = r.nextInt(100);
            int bb = r.nextInt(100);
            String a = Integer.toString(aa);
            String b = Integer.toString(bb);

            String expResult = Integer.toString(aa*bb);
            String result = MegaMnozenie.mnozenie(a, b);
            assertEquals(result, expResult);
        }
    }


    @Test
    public void testMnozenie4() {
        System.out.println("mnozenie");
        String a = "0";
        String b = "string";
        String expResult = "";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMnozenie5() {
        System.out.println("mnozenie");
        String a = "10";
        String b = "string";
        String expResult = "stringstringstringstringstringstringstringstringstringstring";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMnozenieWiekszeNiz100(){
        System.out.println("mnozenie liczb wiekszych niz 100");
        String a = "101";
        String b = "102";
        String expResult = "10302";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMnozenieFloat() {
        System.out.println("mnozenie float");
        String a = "1.5";
        String b = "2.3";
        String expResult = "3.45";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }

    @Test
    public void testMnozenieIntDoPotegi() {
        System.out.println("potega");
        String a = "2^";
        String b = "3";
        String expResult = "8";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }
    @Test
    public void testMnozeniePotegaFloatDoPotegi() {
        System.out.println("potega");
        String a = "2.5^";
        String b = "2";
        String expResult = "6.25";
        String result = MegaMnozenie.mnozenie(a, b);
        assertEquals(result, expResult);
    }
}


