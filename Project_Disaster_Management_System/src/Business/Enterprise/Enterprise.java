/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organisation.Organisation;
import Business.Organisation.OrganisationDirectory;


/**
 *
 * @author rusha
 */
public abstract class Enterprise extends Organisation {

    private EnterpriseType enterpriseType;
    private OrganisationDirectory organisationDirectory;

    public OrganisationDirectory getOrganisationDirectory() {
        return organisationDirectory;
    }
    
    public enum EnterpriseType{
     
        Hospital("Hospital"),
        Fire("Fire"),
        Police("Police");
        
        private String value;
        
        private EnterpriseType(String value){
            this.value=value;
        }
        public String getValue() {
            return value;
        }
        @Override
        public String toString(){
        return value;
    }
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }
    
    public Enterprise(String name,EnterpriseType type){
        super(name);
        this.enterpriseType=type;
        organisationDirectory=new OrganisationDirectory();
    }
    
    
}
