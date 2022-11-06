/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class FlowerTest {
    
    public FlowerTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of setFlowerType method, of class Flower.
     */
    @Test
    public void testSetFlowerType() {
        System.out.println("setFlowerType");
        String FlowerType = "";
        Flower instance = null;
        instance.setFlowerType(FlowerType);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setNumOfFlower method, of class Flower.
     */
    @Test
    public void testSetNumOfFlower() {
        System.out.println("setNumOfFlower");
        int numOfFlower = 0;
        Flower instance = null;
        instance.setNumOfFlower(numOfFlower);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPrice method, of class Flower.
     */
    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 0.0;
        Flower instance = null;
        instance.setPrice(price);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getFlowerType method, of class Flower.
     */
    @Test
    public void testGetFlowerType() {
        System.out.println("getFlowerType");
        Flower instance = new Flower ("Blue flower", 3, 150);
        String expResult = "Blue flower";
        String result = instance.getFlowerType();
         assertSame(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of getNumOfFlower method, of class Flower.
     */
    @Test
    public void testGetNumOfFlower() {
        System.out.println("getNumOfFlower");
        Flower instance = null;
        int expResult = 0;
        int result = instance.getNumOfFlower();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPrice method, of class Flower.
     */
    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Flower instance = null;
        double expResult = 0.0;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
