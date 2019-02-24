/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.ManagerHospital;
import Business.Role.Role;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class AvailabiltyHospitalOrganisation extends Organisation {

     private ArrayList<HospitalAvailabilityWorkTestRequest> availablityqueue;

    public ArrayList<HospitalAvailabilityWorkTestRequest> getAvailablityqueue() {
        return availablityqueue;
    }

    public void setAvailablityqueue(ArrayList<HospitalAvailabilityWorkTestRequest> availablityqueue) {
        this.availablityqueue = availablityqueue;
    }
    public AvailabiltyHospitalOrganisation() {
        super(Organisation.Type.AvailabiltyOrgHospital.getValue());
        this.availablityqueue=new ArrayList<>();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new ManagerHospital());
        return roles;
    }
     
   
   
    
}
