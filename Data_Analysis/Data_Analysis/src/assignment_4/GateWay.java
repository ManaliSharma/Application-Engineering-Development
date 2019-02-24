/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4;

import assignment_4.analytics.AnalysisHelper;
import assignment_4.analytics.DataStore;
import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.io.IOException;
import java.util.Map;

/**
 *
 * @author harshalneelkamal
 */
public class GateWay {
    
    DataReader productReader;
    DataReader orderReader;
    AnalysisHelper helper;
    
    
     public GateWay() throws IOException {
        DataGenerator generator = DataGenerator.getInstance();
        orderReader = new DataReader(generator.getOrderFilePath());
        productReader = new DataReader(generator.getProductCataloguePath());
        helper = new AnalysisHelper();
    }
    
    public static void main(String args[]) throws IOException{
        
        
        GateWay inst = new GateWay();
        inst.readData();
    }
    
     private void readData() throws IOException{
        String[] row;
        while((row = orderReader.getNextRow()) != null ){
            Item item=generateItem(row);
            generateOrder(row);
        }
       
        while((row = productReader.getNextRow()) != null ){
            
           generateProduct(row);
        }
        
       runAnalysis();
    }
        
    private void generateProduct(String[] row){
        int productId = Integer.parseInt(row[0]);
        int maxprice=Integer.parseInt(row[2]);
        int minprice=Integer.parseInt(row[1]);
        int targetprice=Integer.parseInt(row[3]);
        Product p= new Product(productId,maxprice,minprice,targetprice);
        DataStore.getInstance().getProducts().put(productId, p);
    }
    
    private Order generateOrder(String[] row){
        int orderId = Integer.parseInt(row[0]);
        int customerId = Integer.parseInt(row[5]);
        int salesId = Integer.parseInt(row[4]);
        int itemId = Integer.parseInt(row[1]);
        
        Order o = new Order(orderId,customerId, salesId, itemId);
        DataStore.getInstance().getOrders().put(orderId,o);
        Map<Integer,Customer> customers = DataStore.getInstance().getCustomer();
        
        if(customers.containsKey(customerId)){
            customers.get(customerId).getOrders().add(o);
           int x= customers.get(customerId).getTotalorder();
           customers.get(customerId).setTotalorder(++x);
        }
        else{

             Customer c = new Customer(customerId);
             c.setTotalorder(1);
             DataStore.getInstance().getCustomer().put(customerId,c);
             //users.get(commentinguserId).setTotalComments(1);
          }
        return o;
}
    
    private Item generateItem(String[] row){
    
        int itemId=Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesprice = Integer.parseInt(row[6]);
        
        Item i=new Item(itemId,productId,quantity,salesprice);
        DataStore.getInstance().getItems().put(itemId, i);
       
        
        Map<Integer,Order> orders=DataStore.getInstance().getOrders();
        
        if(orders.containsKey(itemId)){
            
            orders.get(itemId).getItem().add(i);
            
        }
        
       
            
            
         return i;           
                    
         
    
    }
    
      private void runAnalysis(){
    
    
          helper.popularproduct();
    
    }
}
    
    
    
    
    
    
    
    
   
        

        
       
       
        
       
    
    
    
    

