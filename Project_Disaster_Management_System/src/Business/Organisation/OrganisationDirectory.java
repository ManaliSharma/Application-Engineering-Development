/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation.Type;
import java.util.ArrayList;
/**
 *
 * @author rusha
 */
public class OrganisationDirectory {
    
    
    private ArrayList<Organisation> organisationList;

    public OrganisationDirectory() {
        organisationList = new ArrayList();
    }

    public ArrayList<Organisation> getOrganisationList() {
        return organisationList;
    }
    
    public Organisation createOrganisation(Type type){
        
        Organisation organisation = null;
        if (type.getValue().equals(Type.Hospital.getValue())){
            organisation = new HospitalOrganisation();
            organisationList.add(organisation);
        }
        else if (type.getValue().equals(Type.AvailabiltyOrgHospital.getValue())){
            organisation = new AvailabiltyHospitalOrganisation();
            organisationList.add(organisation);
        }
        
         else if (type.getValue().equals(Type.BloodBank.getValue())){
            organisation = new BloodBankOrganisation();
            organisationList.add(organisation);
        }
         else if (type.getValue().equals(Type.Police.getValue())){
            organisation = new PoliceOrganisation();
            organisationList.add(organisation);
        }
        else if (type.getValue().equals(Type.RequestRehab.getValue())){
            organisation = new RequestRehabOrganisation();
            organisationList.add(organisation);
        }
        
         else if (type.getValue().equals(Type.RequestReport.getValue())){
            organisation = new RequestReportOrganisation();
            organisationList.add(organisation);
        }
        
        else if (type.getValue().equals(Type.Fire.getValue())){
            organisation = new FireOrganisation();
            organisationList.add(organisation);
        }
        
         else if (type.getValue().equals(Type.AvailabiltyOrgFire.getValue())){
            organisation = new RequestAvailibilityFireOrganisation();
            organisationList.add(organisation);
        }
        
         else if (type.getValue().equals(Type.FireRehabRequest.getValue())){
            organisation = new FireRehabRequestOrganisation();
            organisationList.add(organisation);
        }
        return organisation;
    }
}
