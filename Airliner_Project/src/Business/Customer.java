/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author manalisharma
 */
public class Customer {
    private static int count = 0;
    private String Name;

    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

  

   
    private int customerID;

    public int getCustomerID() {
        return customerID;
    }

    

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }
    
     public Customer() {
        count++;
        customerID = count;
    }
    @Override
    public String toString() {
        return Name;
    }
    
}
