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
public class Item {
int itemId;
    int totalvalue=0;

    public Item(int itemId, int productId, int quantity, int salesprice) {
        this.productId = productId;
       this.salesPrice = salesprice;
       this.quantity = quantity;
       this.itemId=itemId;    
    }
    
    public int getTotalvalue() {
        return totalvalue;
    }

    public void setTotalvalue(int totalvalue) {
        this.totalvalue = totalvalue;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }
    int productId;
    int salesPrice;
    int quantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getSalesPrice() {
        return salesPrice;
    }

    public void setSalesPrice(int salesPrice) {
        this.salesPrice = salesPrice;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    
    @Override
    public String toString() {
        return "Item{" + "productId = " + productId + ", quantity= " +quantity +", SalesPrice = " +salesPrice + ", totalvalue = " +totalvalue + '}';
    }
}
