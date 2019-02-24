/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;

/**
 *
 * @author harshalneelkamal
 */
public class Product {
    private int productid;
    private int maxprice;
    private int total;

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public Product(int productId, int maxprice, int minprice, int targetprice) {
        this.productid=productId;
        this.maxprice=maxprice;
        this.minprice=minprice;
        this.targetprice=targetprice;
    
    
    
    
    
    }

    public int getProductid() {
        return productid;
    }

    public void setProductid(int productid) {
        this.productid = productid;
    }

    public int getMaxprice() {
        return maxprice;
    }

    public void setMaxprice(int maxprice) {
        this.maxprice = maxprice;
    }

    public int getMinprice() {
        return minprice;
    }

    public void setMinprice(int minprice) {
        this.minprice = minprice;
    }

    public int getTargetprice() {
        return targetprice;
    }

    public void setTargetprice(int targetprice) {
        this.targetprice = targetprice;
    }
    private int minprice;
    private int targetprice;
 
     @Override
    public String toString() {
        return "Product{" + "productId = " + productid + ", maxprice = "+maxprice +", minprice = "+ minprice + ", targetprice = " +targetprice+", total="+total+ '}';
    }
    
}
