/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import java.util.HashMap;
import java.util.Map;
import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import assignment_4.entities.SalesPerson;




/**
 *
 * @author manalisharma
 */
public class DataStore {
    private static DataStore dataStore;
    
    private Map<Integer, Customer> customer;
    private Map<Integer, Item> items;
    private Map<Integer, Order> orders;
    private Map<Integer, Product> products;
    private Map<Integer, SalesPerson> salesperson;
    
 
    public static DataStore getInstance(){
        if(dataStore == null)
            dataStore = new DataStore();
        return dataStore;
    }

    
    
    
    
    public static DataStore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(DataStore dataStore) {
        DataStore.dataStore = dataStore;
    }

    public Map<Integer, Customer> getCustomer() {
        return customer;
    }

    public void setCustomer(Map<Integer, Customer> customer) {
        this.customer = customer;
    }

    public Map<Integer, Item> getItems() {
        return items;
    }

    public void setItems(Map<Integer, Item> items) {
        this.items = items;
    }

    public Map<Integer, Order> getOrders() {
        return orders;
    }

    public void setOrders(Map<Integer, Order> orders) {
        this.orders = orders;
    }

    public Map<Integer, Product> getProducts() {
        return products;
    }

    public void setProducts(Map<Integer, Product> products) {
        this.products = products;
    }

    public Map<Integer, SalesPerson> getSalesperson() {
        return salesperson;
    }

    public void setSalesperson(Map<Integer, SalesPerson> salesperson) {
        this.salesperson = salesperson;
    }
   
    
    private DataStore(){
        customer = new HashMap<>();
        items = new HashMap<>();
        orders = new HashMap<>();
        products = new HashMap<>();
        salesperson = new HashMap<>();
    }
    
}
