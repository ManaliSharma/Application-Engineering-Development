package Business.Customer;

import java.util.ArrayList;

public class CustomerDirectory {
    
    private ArrayList<Customer> cusDir;

    public void setCusDir(ArrayList<Customer> cusDir) {
        this.cusDir = cusDir;
    }

    public ArrayList<Customer> getCusDir() {
        return cusDir;
    }

    

    public CustomerDirectory() {
       this.cusDir = new ArrayList<Customer>();
    }

  
    public Customer addCustomer (){
        Customer customer=new Customer();
        cusDir.add(customer);
        return customer;
    }
}
