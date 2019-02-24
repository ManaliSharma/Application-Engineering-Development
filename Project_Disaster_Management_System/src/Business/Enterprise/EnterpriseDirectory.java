/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organisation.OrganisationDirectory;
import java.util.ArrayList;
/**
 *
 * @author rusha
 */
public class EnterpriseDirectory {
    
     private ArrayList<Enterprise> enterpriseList;
   

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }
    public void removeEnterprise(Enterprise enterprise) {
        enterpriseList.remove(enterprise);
    }
    
    //Create enterprise
    public Enterprise createAndAddEnterprise(String name,Enterprise.EnterpriseType type){
        Enterprise enterprise=null;
        if(type==Enterprise.EnterpriseType.Hospital){
           enterprise=new HospitalEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
         
        else if(type==Enterprise.EnterpriseType.Police){
           enterprise=new PoliceEnterprise(name);
            enterpriseList.add(enterprise);
        }
        
        else if(type==Enterprise.EnterpriseType.Fire)
        {
           enterprise=new FireEnterprise(name);
            enterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
