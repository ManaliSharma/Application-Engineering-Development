/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.BloodBankRole;

import Business.Role.Role;
import Business.WorkQueue.BloodBankWorkTestRequest;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class BloodBankOrganisation extends Organisation {
    private ArrayList<BloodBankWorkTestRequest> bloodTestRequestQueue;

    public ArrayList<BloodBankWorkTestRequest> getBloodTestRequestQueue() {
        return bloodTestRequestQueue;
    }

    public void setBloodTestRequestQueue(ArrayList<BloodBankWorkTestRequest> bloodTestRequestQueue) {
        this.bloodTestRequestQueue = bloodTestRequestQueue;
    }
     public BloodBankOrganisation() {
        super(Organisation.Type.BloodBank.getValue());
        this.bloodTestRequestQueue=new ArrayList<>();
    }
    @Override
    public ArrayList<Role> getSupportedRole() {
         ArrayList<Role> roles = new ArrayList();
        roles.add(new BloodBankRole());
        return roles;
    
    
    }
    
}
