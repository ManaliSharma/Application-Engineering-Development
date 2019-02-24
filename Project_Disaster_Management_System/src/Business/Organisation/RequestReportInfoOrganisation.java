/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.Role;
import java.util.ArrayList;
import Business.WorkQueue.RequestInformationTestRequest;

/**
 *
 * @author janiv
 */
public class RequestReportInfoOrganisation extends Organisation{
    
   

   
   

    public RequestReportInfoOrganisation(String name) {
        super(Organisation.Type.AvailabiltyOrgFire.getValue());
       // this.requestInfoTestRequest=new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
      ArrayList<Role> roles = new ArrayList();
        //roles.add(new ManagerHospital());
        return roles;
    
    
    }
    
}
