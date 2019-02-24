/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.FireRehabRequestRole;
import Business.Role.Role;
import Business.WorkQueue.FireRehabRequest;
import java.util.ArrayList;

/**
 *
 * @author janiv
 */
public class FireRehabRequestOrganisation extends Organisation{

     private ArrayList<FireRehabRequest> fireRehabRequest;

    public ArrayList<FireRehabRequest> getFireRehabRequest() {
        return fireRehabRequest;
    }

    public void setFireRehabRequest(ArrayList<FireRehabRequest> fireRehabRequest) {
        this.fireRehabRequest = fireRehabRequest;
    }
     
     

    public FireRehabRequestOrganisation() {
        super(Organisation.Type.FireRehabRequest.getValue());
        this.fireRehabRequest= new ArrayList<>();
    }

    @Override
    
       public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FireRehabRequestRole());
        return roles; 
    }   
    
}
