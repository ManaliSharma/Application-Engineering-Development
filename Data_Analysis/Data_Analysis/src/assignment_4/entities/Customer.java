/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.entities;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author harshalneelkamal
 */
public class Customer {
    private int id;
   
    List <Item> items;
    List<Order> orders;
    int totalorder=0;
    int totalitem=0;
    int total=0;

   
    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Customer(int id) {
        
        this.id = id;
     
        this.items = new ArrayList<>();
        this.orders=new ArrayList<>();
      
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

   

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public int getTotalorder() {
        return totalorder;
    }

    public void setTotalorder(int totalorder) {
        this.totalorder = totalorder;
    }

    public int getTotalitem() {
        return totalitem;
    }

    public void setTotalitem(int totalitem) {
        this.totalitem = totalitem;
    }
    
    @Override
    public String toString() {
        return "Customer{" + "id = " + id + ", no. of orders = " +totalorder +", no. of items = " +totalitem + ", total = " +total + '}';
    }
    
}
