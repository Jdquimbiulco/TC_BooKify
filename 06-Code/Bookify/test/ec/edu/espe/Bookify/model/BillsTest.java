/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ec.edu.espe.Bookify.model;

import javax.swing.JTextField;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public class BillsTest {
    
    public BillsTest() {
    }

    @Test
    public void testGetCustomerNames() {
        System.out.println("getCustomerNames");
        Bills instance = new BillsImpl();
        String expResult = "";
        String result = instance.getCustomerNames();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetCustomerNames() {
        System.out.println("setCustomerNames");
        String customerNames = "";
        Bills instance = new BillsImpl();
        instance.setCustomerNames(customerNames);
        
    }

    @Test
    public void testGetDateOfReturn() {
        System.out.println("getDateOfReturn");
        Bills instance = new BillsImpl();
        String expResult = "";
        String result = instance.getDateOfReturn();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testSetDateOfReturn() {
        System.out.println("setDateOfReturn");
        String dateOfReturn = "";
        Bills instance = new BillsImpl();
        instance.setDateOfReturn(dateOfReturn);
        
    }

    @Test
    public void testGetPrice() {
        System.out.println("getPrice");
        Bills instance = new BillsImpl();
        float expResult = 0.0F;
        float result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetPrice() {
        System.out.println("setPrice");
        float price = 0.0F;
        Bills instance = new BillsImpl();
        instance.setPrice(price);
        
    }

    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        Bills instance = new BillsImpl();
        float expResult = 0.0F;
        float result = instance.getTotal();
        assertEquals(expResult, result, 0.0);
        
    }

    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        float total = 0.0F;
        Bills instance = new BillsImpl();
        instance.setTotal(total);
        
    }

    @Test
    public void testToString() {
        System.out.println("toString");
        Bills instance = new BillsImpl();
        String expResult = "";
        String result = instance.toString();
        assertEquals(expResult, result);
        
    }

    @Test
    public void testTotal() {
        System.out.println("total");
        JTextField txtField = null;
        Bills instance = new BillsImpl();
        instance.total(txtField);
        
    }

    public class BillsImpl extends Bills {
    }
    
}
