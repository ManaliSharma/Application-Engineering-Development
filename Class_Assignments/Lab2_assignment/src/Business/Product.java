/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author 123
 */
public class Product {
    private String name;
    private String price;
    private String availNum;
    private String description;
    public Supplier supplierObject=new Supplier();
    
    
    

    public Supplier getSupplierObject() {
        return supplierObject;
    }

    public void setSupplierObject(Supplier supplierObject) {
        this.supplierObject = supplierObject;
    }
    
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

    public String getAvailNum() {
        return availNum;
    }

    public void setAvailNum(String availNum) {
        this.availNum = availNum;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    
    
}
