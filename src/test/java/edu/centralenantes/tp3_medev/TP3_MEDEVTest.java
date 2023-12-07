/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package edu.centralenantes.tp3_medev;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 23031
 */
public class TP3_MEDEVTest {
    
    public TP3_MEDEVTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }

    /**
     * Test of writeImage method, of class TP3_MEDEV.
     */
    @Test
    public void testWriteImage() {
        System.out.println("writeImage");
        String filePath = "C:/Users/23031/Documents/tp-pgm-team_tp3_ccjz/write_test.pgm";
        TP3_MEDEV instance = new TP3_MEDEV();
        int[][] testImage = {{2, 2}, {3, 4}}; 
        ImagePGM Image1 = new ImagePGM(2, 2, 4, testImage);
        instance.writeImage(filePath, Image1);
    }

    /**
     * Test of readImage method, of class TP3_MEDEV.
     */
    @Test
    public void testReadImage() {
        System.out.println("readImage");
        String filePath = "C:/Users/23031/Documents/tp-pgm-team_tp3_ccjz/baboon.pgm";
        TP3_MEDEV test1 = new TP3_MEDEV();
        ImagePGM Image=new ImagePGM();
        test1.readImage(filePath,Image);
        int expectedWidth = 50; 
        int expectedHeight = 50; 
        int expectedMaxValue = 255; 
        assertEquals(expectedWidth, Image.getWidth());
        assertEquals(expectedHeight, Image.getHeight());
        assertEquals(expectedMaxValue, Image.getMaxValue());

    }

    /**
     * Test of main method, of class TP3_MEDEV.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        TP3_MEDEV.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}

