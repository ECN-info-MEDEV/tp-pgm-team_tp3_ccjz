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

/**
 *
 * @author 23031
 */
public class ImagePGMTest {
    
    public ImagePGMTest() {
    }

    @org.junit.jupiter.api.BeforeAll
    public static void setUpClass() throws Exception {
    }

    @org.junit.jupiter.api.AfterAll
    public static void tearDownClass() throws Exception {
    }
    

    /**
     * Test of getHeight method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testGetHeight() {
        System.out.println("getHeight");
        ImagePGM instance = new ImagePGM();
        int expResult = 0;
        int result = instance.getHeight();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setHeight method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testSetHeight() {
        System.out.println("setHeight");
        int height = 0;
        ImagePGM instance = new ImagePGM();
        instance.setHeight(height);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getWidth method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testGetWidth() {
        System.out.println("getWidth");
        ImagePGM instance = new ImagePGM();
        int expResult = 0;
        int result = instance.getWidth();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
     * Test of getMaxValue method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testGetMaxValue() {
        System.out.println("getMaxValue");
        ImagePGM instance = new ImagePGM();
        int expResult = 0;
        int result = instance.getMaxValue();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaxValue method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testSetMaxValue() {
        System.out.println("setMaxValue");
        int maxValue = 0;
        ImagePGM instance = new ImagePGM();
        instance.setMaxValue(maxValue);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getValue method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testGetValue() {
        System.out.println("getValue");
        ImagePGM instance = new ImagePGM();
        int[][] expResult = null;
        int[][] result = instance.getValue();
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setValue method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testSetValue() {
        System.out.println("setValue");
        int[][] value = null;
        ImagePGM instance = new ImagePGM();
        instance.setValue(value);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getComment method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testGetComment() {
        System.out.println("getComment");
        ImagePGM instance = new ImagePGM();
        String expResult = "";
        String result = instance.getComment();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setComment method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testSetComment() {
        System.out.println("setComment");
        String comment = "";
        ImagePGM instance = new ImagePGM();
        instance.setComment(comment);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of printHist method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testPrintHist() {
        System.out.println("printHist");
        ImagePGM instance = new ImagePGM();
        instance.printHist();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of to_binary method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testTo_binary() {
        System.out.println("to_binary");
        ImagePGM instance = new ImagePGM();
        instance.to_binary();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of difference method, of class ImagePGM.
     */
    @org.junit.jupiter.api.Test
    public void testDifference() {
        System.out.println("difference");
        ImagePGM im = null;
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
