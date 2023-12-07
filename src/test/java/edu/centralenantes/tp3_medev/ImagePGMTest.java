/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.tp3_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import edu.centralenantes.tp3_medev.ImagePGM;
import edu.centralenantes.tp3_medev.TP3_MEDEV;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
/**
 *
 * @author 23031
 */
public class ImagePGMTest {
    
    private static TP3_MEDEV processor;
    private static String inputFilePath ;
    private static String inputFilePath0 ;
    
    public ImagePGMTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
        processor = new TP3_MEDEV();
        inputFilePath = "C:/Users/chloe/Documents/ImagesTestPGM/ImagesTestPGM/test2.pgm";
        inputFilePath0= "C:/Users/chloe/Documents/ImagesTestPGM/ImagesTestPGM/test.pgm";
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }

    /**
     * Test of setWidth method, of class ImagePGM.
     */
    @Test
    public void testSetWidth() {
        System.out.println("setWidth");
        int width = 20;
        ImagePGM instance = new ImagePGM();
        instance.setWidth(width);
        int test=instance.getWidth();    
        assertEquals(width, test);

    }

    /**
     * Test of printHist method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testPrintHist() {
        System.out.println("printHist");
        ImagePGM instance = new ImagePGM();
        processor.readImage(inputFilePath, instance);
        instance.printHist();
        String res = null;
        PrintStream originalOut = System.out;
        try {
            ByteArrayOutputStream os = new ByteArrayOutputStream(100);
            PrintStream capture = new PrintStream(os);
            // From this point on, everything printed to System.out will get captured
            System.setOut(capture);
            instance.printHist();
            capture.flush();
            res = os.toString();
        } finally {
            System.setOut(originalOut);
        }
        String ref = "\nThe histogram of the PGM image is :\n" +
"Value 0 has frequency 9";
        assertTrue(res.equals(ref));
    }
 

    /**
     * Test of to_binary method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testTo_binary() {
        System.out.println("to_binary");
        ImagePGM instance = new ImagePGM();
        processor.readImage(inputFilePath0, instance);
        int[][] ref={{0,1,1}, {0,1,0}, {0,0,0}};
        instance.to_binary();
        int[][] val=instance.getValue();
        assertArrayEquals(ref,val);
    }

    /**
     * Test of difference method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testDifference() {
        System.out.println("difference");
        ImagePGM instance = new ImagePGM();
        ImagePGM expResult = null;
        ImagePGM result = instance.difference(im);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of resize method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testResize() {
        System.out.println("resize");
        int factor = 0;
        ImagePGM instance = new ImagePGM();
        instance.resize(factor);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    private void assertEquals(int i, int test) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
