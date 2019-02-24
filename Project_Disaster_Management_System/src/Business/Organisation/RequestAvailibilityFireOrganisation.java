/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.ManagerFireDepartment;
import Business.Role.Role;
import Business.WorkQueue.FireAvailabilityWorkTestRequest;
import Business.WorkQueue.RequestInformationTestRequest;
import java.util.ArrayList;

/**
 *
 * @author janiv
 */
public class RequestAvailibilityFireOrganisation extends Organisation {
    
    private ArrayList<FireAvailabilityWorkTestRequest> availabiltyfirerequest;

    public ArrayList<FireAvailabilityWorkTestRequest> getAvailabiltyfirerequest() {
        return availabiltyfirerequest;
    }

    public void setAvailabiltyfirerequest(ArrayList<FireAvailabilityWorkTestRequest> availabiltyfirerequest) {
        this.availabiltyfirerequest = availabiltyfirerequest;
    }

    
   

    public RequestAvailibilityFireOrganisation() {
        super(Organisation.Type.AvailabiltyOrgFire.getValue());
        this.availabiltyfirerequest=new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerFireDepartment());
        return roles;
    
    }
    
    
}
