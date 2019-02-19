/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_project.Parts_Folder;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Ty
 */
public class PartTest {
    
    public PartTest() {
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


    @Test
    public void testGetPartCount() {
        System.out.println("getPartCount");
        Part instance = new PartImpl();
        int expResult = 5;
        int result = instance.getPartCount();
        assertEquals(expResult, result);
    }

    @Test
    public void testGetPartID() {
        System.out.println("getPartID");
        Part instance = new PartImpl();
        int expResult = 1;
        int result = instance.getPartID();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetPartID() {
        System.out.println("setPartID");
        int partID = 1;
        Part instance = new PartImpl();
        instance.setPartID(partID);
    }

    @Test
    public void testGetName() {
        System.out.println("getName");
        Part instance = new PartImpl();
        String expResult = "Company 123";
        String result = instance.getName();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "Company 1234";
        Part instance = new PartImpl();
        instance.setName(name);

    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        double price = 9.99;
        Part instance = new PartImpl();
        instance.setPrice(price);

    }    
   
    @Test
    public void testGetPrice() {
                System.out.println("getPrice");
        Part instance = new PartImpl();
        double expResult = 9.99;
        double result = instance.getPrice();
        assertEquals(expResult, result, 9.99);

    }

    @Test
    public void testGetInStock() {
        System.out.println("getInStock");
        Part instance = new PartImpl();
        boolean expResult = false;
        boolean result = instance.getInStock();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetInStock() {
        System.out.println("setInStock");
        boolean inStock = false;
        Part instance = new PartImpl();
        instance.setInStock(inStock);  
    }

    @Test
    public void testGetMin() {
        System.out.println("getMin");
        Part instance = new PartImpl();
        int expResult = 4;
        int result = instance.getMin();
        assertEquals(expResult, result);

    }

    @Test
    public void testSetMin() {
        System.out.println("setMin");
        int min = 4;
        Part instance = new PartImpl();
        instance.setMin(min);
    }

    @Test
    public void testGetMax() {
        System.out.println("getMax");
        Part instance = new PartImpl();
        int expResult = 5;
        int result = instance.getMax();
        assertEquals(expResult, result);
    }

    @Test
    public void testSetMax() {
        System.out.println("setMax");
        int max = 5;
        Part instance = new PartImpl();
        instance.setMax(max);
    }
    
    @Test
    public void testtoString() {
        System.out.println("toString");
        String expResult = "To String Works";
        Part instance = new PartImpl();
        String result = instance.toString();
        assertEquals(expResult,result);
    }

    public class PartImpl extends Part {

        public int getPartCount() {
            return 5;
        }

        public int getPartID() {
            return 1;
        }

        public void setPartID(int partID) {
        }

        public String getName() {
            return "Company 123";
        }

        public void setName(String name) {
        }

        public double getPrice() {
            return 9.99;
        }

        public void setPrice(double price) {
        }

        public boolean getInStock() {
            return false;
        }

        public void setInStock(boolean inStock) {
        }

        public int getMin() {
            return 4;
        }

        public void setMin(int min) {
        }

        public int getMax() {
            return 5;
        }

        public void setMax(int max) {
        }

        public String toString() {
            return "To String Works";
        }
    }
    
}
