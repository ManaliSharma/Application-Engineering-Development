/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment;

import java.util.Scanner;
import assignment.Product;
import assignment.Supplier;

/**
 *
 * @author manalisharma
 */
public class Assignment2 {

    /**
     * @param args the command line arguments
     */
    
    
    
   
    public static void main(String[] args) {
        // TODO code application logic here
        Product product=new Product();
        Supplier supplier=new Supplier();
        
        int Panel=0;
        
        do{
            System.out.println("Create Panel");
            System.out.println("View Panel");
            System.out.println("Update Panel");
            System.out.println("Exit");
            Scanner x=new Scanner(System.in);
            Panel=x.nextInt();
            
            switch(Panel){
                
                case 1:
                    Scanner Create=new Scanner(System.in);
                    System.out.println("Create Panel");
                    System.out.println();
                   
                    System.out.println("Product Name:");
                    String ProductName=Create.nextLine();
                    product.setName(ProductName);
                    
                    System.out.println("Product Price:");
                    String ProductPrice=Create.nextLine();
                    product.setPrice(ProductPrice);
                    
                    System.out.println("Product AvailNum:");
                    int ProductAvailNum=Create.nextInt();
                    product.setAvailNum(ProductAvailNum);
                    Create.nextLine();
                    System.out.println("Product Description:");
                    String ProductDescription=Create.nextLine();
                    product.setDescription(ProductDescription);
                    
                    System.out.println("Supplier Name:");
                    String SupplierName=Create.nextLine();
                    supplier.setSupplierName(SupplierName);
                    
                    System.out.println("Supplier Price:");
                    int SupplierPrice=Create.nextInt();
                    supplier.setSupplierPrice(SupplierPrice);
                    
                    break;
                
                case 2:
                    System.out.println("View Panel");
                    System.out.println();
                    System.out.println("Product Name:"+product.getName());
                    System.out.println("Product Price:"+product.getPrice());
                    System.out.println("Product AvailNum:"+product.getAvailNum());
                    System.out.println("Product Description"+product.getDescription());
                    System.out.println("Supplier Name:"+supplier.getSupplierName());
                    System.out.println("Supplier Price:"+supplier.getSupplierPrice());
                    
                    break;
                    
                case 3:
                    Scanner Update=new Scanner(System.in);
                    System.out.println("Update Panel");
                    System.out.println();
                    
                    System.out.println("Product Name:");
                    String Productname=Update.nextLine();
                    product.setName(Productname);
                    
                    System.out.println("Product Price:");
                    String Productprice=Update.nextLine();
                    product.setPrice(Productprice);
                    
                    System.out.println("Product AvailNum:");
                    int ProductavailNum=Update.nextInt();
                    product.setAvailNum(ProductavailNum);
                    
                    System.out.println("Product Description:");
                    String Productdescription=Update.nextLine();
                    product.setDescription(Productdescription);
                    
                    System.out.println("Supplier Name:");
                    String Suppliername=Update.nextLine();
                    supplier.setSupplierName(Suppliername);
                    
                    System.out.println("Supplier Price:");
                    int Supplierprice=Update.nextInt();
                    supplier.setSupplierPrice(Supplierprice);
                    
                    break;
                    
                case 4:
                    System.out.println("Exit");
                    
                    break;
                
                default:
                    System.out.println("Application is closed");
                   break;
                    
                    
                    
                    
                    
                    
                    
            }
        }
            
        while(Panel!=4);
       
                
                
                }
        
        }
    

        
        

            
        
        
       
    
                   
        
        
   
    

