/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disaster;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation;

/**
 *
 * @author rusha
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Hospital("Hospital Department"),
        Police("Police Department"),
        Fire("Fire Department");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organisation organisation, 
            Enterprise enterprise, 
            Disaster business,
            EnterpriseDirectory enterprisedirectory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
    
} 