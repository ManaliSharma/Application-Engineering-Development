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
public class SalesPerson {
    private int salesid;
     List <Item> items;

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public SalesPerson(int salesId) {
        this.salesid=salesId;
        this.items = new ArrayList<>();
    
    }

    public int getSalesid() {
        return salesid;
    }

    public void setSalesid(int salesid) {
        this.salesid = salesid;
    }
    public int getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(int totalSales) {
        this.totalSales = totalSales;
    }
    int totalSales=0;
    
     @Override
    public String toString() {
        return "SalesPerson{"+ "id = " + salesid + ", total Sales="+ totalSales + '}';
        
    }
    
}
