/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Abstract.User;
import Business.Users.Customer;
import Business.Users.Supplier;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class SupplierDirectory {
    
    private List<User> supplierList;
    private String username;
    private String password;
    private String role;
    
    public SupplierDirectory(){
        supplierList = new ArrayList<>();
    }

    public List<User> getSupplierList() {
        return supplierList;
    }

    public void setSupplierList(List<User> supplierList) {
        this.supplierList = supplierList;
    }
    public Supplier addSupplierDirectory(){
       
      Supplier supplier=new Supplier(username,password,role);
      supplierList.add(supplier);
      return supplier;

        
        
    }
    
}
