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
 * @author st
 */
public class AdminTest {
    
    public AdminTest() {
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
     * Test of getFlowers method, of class Admin.
     */
    @Test
    public void testGetFlowers() {
        System.out.println("getFlowers");
        Admin.getFlowers();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIndx method, of class Admin.
     */
    @Test
    public void testGetIndx() {
        System.out.println("getIndx");
        int expResult = 0;
        int result = Admin.getIndx();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setFlowers method, of class Admin.
     */
    @Test
    public void testSetFlowers() {
        System.out.println("addFlower");
        Flower f = new Flower("Jory",20,15);
        boolean expResult = true;
        boolean result = Admin.addFlower(f);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of setIndx method, of class Admin.
     */
    @Test
    public void testSetIndx() {
        System.out.println("setIndx");
        int indx = 0;
        Admin.setIndx(indx);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of addFlower method, of class Admin.
     */
    @Test
    public void testAddFlower() {
        System.out.println("addFlower");
        Flower f = new Flower("Jory",20,15);
        // boolean expResult = true;
        boolean result = Admin.addFlower(f);
        assertTrue(result);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Test of deleteFlower method, of class Admin.
     */
    @Test
    public void testDeleteFlower() {
        System.out.println("deleteFlower");
        String FlowerType = "";
        boolean expResult = false;
        boolean result = Admin.deleteFlower(FlowerType);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of checkMessages method, of class Admin.
     */
    @Test
    public void testCheckMessages() {
        System.out.println("checkMessages");
        Admin instance = new Admin();
        instance.checkMessages();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of contactDeliveryMan method, of class Admin.
     */
    @Test
    public void testContactDeliveryMan() {
        System.out.println("contactDeliveryMan");
        Admin instance = new Admin();
        instance.contactDeliveryMan();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of perpareOrder method, of class Admin.
     */
    @Test
    public void testPerpareOrder() {
        System.out.println("perpareOrder");
        Admin instance = new Admin();
        instance.perpareOrder();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of generateReport method, of class Admin.
     */
    @Test
    public void testGenerateReport() {
        System.out.println("generateReport");
        Admin instance = new Admin();
        instance.generateReport();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
