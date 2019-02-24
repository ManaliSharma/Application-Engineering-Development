/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

/**
 *
 * @author manalisharma
 */
public class Product {
    private String name;
    private String price;
    private int availNum;

    public int getAvailNum() {
        return availNum;
    }

    public void setAvailNum(int availNum) {
        this.availNum = availNum;
    }
    private String description;
    public Supplier supplierObject=new Supplier();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Supplier getSupplierObject() {
        return supplierObject;
    }

    public void setSupplierObject(Supplier supplierObject) {
        this.supplierObject = supplierObject;
    }
    
    
    
    
    
}
