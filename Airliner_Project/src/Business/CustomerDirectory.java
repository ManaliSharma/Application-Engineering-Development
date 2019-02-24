/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author manalisharma
 */
public class CustomerDirectory {
     private ArrayList<Customer> customerDirectory;
     
     
     public CustomerDirectory(){
         this.customerDirectory = new ArrayList<Customer>();
         
    
    }

    public ArrayList<Customer> getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(ArrayList<Customer> customerDirectory) {
        this.customerDirectory = customerDirectory;
    }
   
   
     
      public Customer addCustomer(){
       
        
        
        Customer newCustomer = new Customer();
        customerDirectory.add(newCustomer);
        return newCustomer;
    }
    
    public void deleteCustomer(Customer product){
        customerDirectory.remove(product);
    }
    
    public Customer searchCustomer(String name){
        for(Customer aip : this.customerDirectory){
            if(aip.getName().equalsIgnoreCase(name)){
                return aip;
            }
        }
        return null;
    }
}
