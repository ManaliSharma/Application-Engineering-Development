/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.RequestRehabRole;
import Business.Role.Role;
import Business.WorkQueue.RequestRehabTestRequest;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class RequestRehabOrganisation extends Organisation {
    
    private ArrayList<RequestRehabTestRequest> requestrehabrestrequest;
    
    public RequestRehabOrganisation() {
        super(Organisation.Type.RequestRehab.getValue());
        this.requestrehabrestrequest=new ArrayList<>();
    }

    public ArrayList<RequestRehabTestRequest> getRequestrehabrestrequest() {
        return requestrehabrestrequest;
    }

    public void setRequestrehabrestrequest(ArrayList<RequestRehabTestRequest> requestrehabrestrequest) {
        this.requestrehabrestrequest = requestrehabrestrequest;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RequestRehabRole());
        return roles;
    }
    
}
