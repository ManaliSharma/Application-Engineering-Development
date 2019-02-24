package Business;

import Business.Employee.Employee;
import Business.Role.SysAdmin;
import Business.UserAccount.UserAccount;

public class ConfigureASystem {
    public static Disaster configure(){
        
        Disaster disaster = Disaster.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account

        Employee employee = disaster.getEmployeeDirectory().createEmployee("MRV");
        UserAccount ua = disaster.getUserAccountDirectory().createUserAccount("s", "s", employee, new SysAdmin());      
        return disaster;
    }
    
}
