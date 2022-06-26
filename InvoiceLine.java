/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.model;

/**
 *
 * @author abdel
 */
public class InvoiceLine {
    /**
    *invoice lines instances
     */
    private String itemName;
    private double itemPrice;
    private int count;

    public InvoiceLine(String itemName, double itemPrice, int count, InvoiceHeader invoice) {
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.count = count;
        this.invoice = invoice;
    }
    private InvoiceHeader invoice;
    /**
     * getter and setter methods
     * @return 
    */
    public String getItemName() {
        return itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public int getCount() {
        return count;
    }



    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setItemprice(Double itemprice) {
        this.itemPrice = itemprice;
    }

    public void setCount(int count) {
        this.count = count;
    }


}
