/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import java.util.Date;

/**
 *
 * @author harshalneelkamal
 */
public class Customer extends User implements Comparable<Customer> {
    private String Username;
    private String pwd;
    private String role;

   
      public Customer(String password, String userName, String role) {
        
        
        super(password, userName, "CUSTOMER");
        role="CUSTOMER";
        
        this.Username=userName;
        this.pwd=password;
        this.role=role;
        
    }

    
    @Override
    public boolean verify(String password) {
    if(password.equals(getPassword()))
            return true;
        return false;    
    
    
    
    }

    @Override
    public int compareTo(Customer o) {
     return o.getUserName().compareTo(this.getUserName());
       
    
    
    }
    
}
