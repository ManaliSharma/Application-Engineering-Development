/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Users;

import Business.Abstract.User;
import Business.ProductDirectory;

/**
 *
 * @author harshalneelkamal
 */
public class Supplier extends User implements Comparable<Supplier>{
    
    private ProductDirectory directory;
    private String Username;
    private String pwd;
    private String role;

    
    public Supplier(String password, String userName,String role) {
        super(password, userName, "SUPPLIER");
        directory = new ProductDirectory();
        role="SUPPLIER";
        this.Username=userName;
        this.pwd=password;
        this.role= role;
    }

    public ProductDirectory getDirectory() {
        return directory;
    }

    public void setDirectory(ProductDirectory directory) {
        this.directory = directory;
    }

    @Override
    public int compareTo(Supplier o) {
        return o.getUserName().compareTo(this.getUserName());
    }

    @Override
    public String toString() {
        return getUserName(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean verify(String password){
        if(password.equals(getPassword()))
            return true;
        return false;
    }
    
}
