/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sig.model;

/**
 *
 * @author abdel
 */
import java.util.Date;
import java.util.ArrayList;
public class InvoiceHeader {
     /**
     * Invoice Header Instances
     */
    private int invoiceNum;
    private String customerName;
    private Date date;
    private ArrayList<InvoiceLine>invoiceLines;
    /**
     * constructor
     */
    
    public InvoiceHeader(int invoiceNum, Date date, String customerName, ArrayList<InvoiceLine> invoiceLines) {
        this.invoiceNum = invoiceNum;
        this.date = date;
        this.customerName = customerName;
        this.invoiceLines = invoiceLines;
    }
    /**
     * getter and setter methods
     * @param invoiceNum
    */
    public void setInvoiceNum(int invoiceNum) {
        this.invoiceNum = invoiceNum;
    }


    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setInvoiceLines(ArrayList<InvoiceLine> invoiceLines) {
        this.invoiceLines = invoiceLines;
    }

    public int getInvoiceNum() {
        return invoiceNum;
    }

    public Date getDate() {
        return date;
    }

    public String getCustomerName() {
        return customerName;
    }

    public ArrayList<InvoiceLine> getInvoiceLines() {
        return invoiceLines;
    }


}
