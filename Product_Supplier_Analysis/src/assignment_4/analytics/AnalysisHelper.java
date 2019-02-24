/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment_4.analytics;

import assignment_4.entities.Customer;
import assignment_4.entities.Item;
import assignment_4.entities.Order;
import assignment_4.entities.Product;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 *
 * @author manalisharma
 */
public class AnalysisHelper {

     public void popularproduct(){
         Map<Integer, Product> products=DataStore.getInstance().getProducts();
       List<Product> productList =new ArrayList<>(products.values());
       
       for(int i=0;i <productList.size();i++){
            
            productList.get(i).setTotal(productList.get(i).getTargetprice()-productList.get(i).getMinprice());
     
        }
      
       Collections.sort(productList, new Comparator<Product>() {

            @Override
            public int compare(Product o1, Product o2) {
                //so as to get descending list
                return o2.getTotal() - o1.getTotal();
            }
        });
       System.out.println("\n");
       System.out.println("Top 3 most popular products sorted from high to low\n");
       for(int i=0 ;i<productList.size()  &&i<3 ;i++){
         
           System.out.println(productList.get(i));
       
        }
       
           System.out.println("\n");

      }
	  
     public void BestCustomer(){
         Map<Integer, Customer> customers=DataStore.getInstance().getCustomer();
     
      List<Customer> customerList =new ArrayList<>(customers.values());
      Collections.sort(customerList, new Comparator<Customer>() {

            @Override
            public int compare(Customer o1, Customer o2) {
                //so as to get descending list
                return o2.getTotal() - o1.getTotal();
            }
        });
      
       System.out.println("Top 3 customers sorted from high to low\n");
       for(int i=0 ;i<customerList.size()  &&i<3 ;i++){
           
            System.out.println(customerList.get(i));
           
       }
         System.out.println("\n");

          }
            
     public void Revenue(){
      
         Map<Integer, Order> orders=DataStore.getInstance().getOrders();
     Map<Integer, Item> items=DataStore.getInstance().getItems();
      
     List<Item> itemList=new ArrayList<>(items.values());
     int revenue=0;
        for(Order o:orders.values()){
          
          for(Item i: items.values()){
              
              if(o.getOrderId()==i.getItemId()){
              revenue=revenue+i.getQuantity()*i.getSalesPrice();
              
              }
          }
      }
         
        System.out.println("The Total Revenue is "+revenue);  
        System.out.println("\n");
      
      
    }
     
     public void BestSalesperson(){
         
        

    }
}