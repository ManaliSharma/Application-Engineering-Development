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

    
    @Override
    public String toString() {
        return "Customer{"+ "id = " + id +  ", total =" +total + '}';
        
    }
   
}
