/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espe.Bookify.model;

import javax.swing.JTextField;

/**
 *
 * @author Juan Quimbiulco, DCCO-ESPE, CODEX++
 */
public abstract class Bills {
    
    private String customerNames;
    private String dateOfReturn;
    private float    price;
    private float    total;

    /**
     * @return the customerNames
     */
    public String getCustomerNames() {
        return customerNames;
    }

    /**
     * @param customerNames the customerNames to set
     */
    public void setCustomerNames(String customerNames) {
        this.customerNames = customerNames;
    }

    /**
     * @return the dateOfReturn
     */
    public String getDateOfReturn() {
        return dateOfReturn;
    }

    /**
     * @param dateOfReturn the dateOfReturn to set
     */
    public void setDateOfReturn(String dateOfReturn) {
        this.dateOfReturn = dateOfReturn;
    }

    /**
     * @return the price
     */
    public float getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(float price) {
        this.price = price;
    }

    /**
     * @return the total
     */
    public float getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(float total) {
        this.total = total;
    }

    public Bills(String customerNames, String dateOfReturn, float price, float total) {
        this.customerNames = customerNames;
        this.dateOfReturn = dateOfReturn;
        this.price = price;
        this.total = total;
    }

    public Bills() {
    }

    @Override
    public String toString() {
        return "Bills{" + "customerNames=" + customerNames + ", dateOfReturn=" + dateOfReturn + ", price=" + price + ", total=" + total + '}';
    }
    
   public void total(JTextField txtField){
       total = (float) (price*0.12+price); 
       txtField.setText("$"+total);
   } 
}
