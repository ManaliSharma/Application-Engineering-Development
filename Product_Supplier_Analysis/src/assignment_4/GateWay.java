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
import assignment_4.entities.SalesPerson;
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
            generateCustomer(row);
            generateSalesPerson(row);
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
     
    private void  generateCustomer(String[] row){
        int customerId = Integer.parseInt(row[5]);
        int itemId=Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesprice = Integer.parseInt(row[6]);
        Item i=new Item(itemId,productId,quantity,salesprice);
        i.setTotalvalue(quantity*salesprice);
      
        Map<Integer,Customer> customers = DataStore.getInstance().getCustomer();
        if(customers.containsKey(customerId)){
        
            customers.get(customerId).getItems().add(i);
        
        }
        
        else{
                Customer c = new Customer(customerId);
                c.getItems().add(i);
                customers.put(customerId,c);
        }
        int totalSpent = 0;
        for(Item items: customers.get(customerId).getItems()){
            totalSpent = totalSpent + items.getTotalvalue();
        }
        customers.get(customerId).setTotal(totalSpent);
        
    }

    
    private void generateOrder(String[] row){
        int orderId = Integer.parseInt(row[0]);
        int customerId = Integer.parseInt(row[5]);
        int salesId = Integer.parseInt(row[4]);
        int itemId = Integer.parseInt(row[1]);
        
        Order o = new Order(orderId,customerId, salesId, itemId);
        DataStore.getInstance().getOrders().put(orderId,o);
        
        
       
   
}
    private Item generateItem(String[] row){
        int salesId = Integer.parseInt(row[4]);
        int itemId=Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesprice = Integer.parseInt(row[6]);
       
        int orderId = Integer.parseInt(row[0]);
        Item i=new Item(itemId,productId,quantity,salesprice);
        DataStore.getInstance().getItems().put(itemId, i);
        
        Map<Integer,Item> items=DataStore.getInstance().getItems();
        int k=items.get(itemId).getTotalvalue();
        items.get(itemId).setTotalvalue(i.getSalesPrice()*i.getQuantity());
        
        return i;
    
    }
    
    private void  generateSalesPerson(String[] row){
        int salesId = Integer.parseInt(row[4]);
        int itemId=Integer.parseInt(row[1]);
        int productId = Integer.parseInt(row[2]);
        int quantity = Integer.parseInt(row[3]);
        int salesprice = Integer.parseInt(row[6]);
        Item i=new Item(itemId,productId,quantity,salesprice);
        i.setTotalvalue(quantity*salesprice);
      
        Map<Integer,SalesPerson> salesperson = DataStore.getInstance().getSalesperson();
        if(salesperson.containsKey(salesId)){
        
            salesperson.get(salesId).getItems().add(i);
        
        }
        
        else{
               SalesPerson s=new SalesPerson(salesId);
                s.getItems().add(i);
                salesperson.put(salesId,s);
        }
        int totalSales = 0;
        for(Item items: salesperson.get(salesId).getItems()){
            totalSales = totalSales + items.getTotalvalue();
        }
        salesperson.get(salesId).setTotalSales(totalSales);
    
    }
    
    private void runAnalysis(){
        
         helper.popularproduct();
         helper.BestCustomer();
         helper.Revenue();
         //helper.BestSalesperson();
    
    } 

    
}
