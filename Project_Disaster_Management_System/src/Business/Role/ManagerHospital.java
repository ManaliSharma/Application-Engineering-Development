/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.AvailabiltyHospitalOrganisation;
import Business.Organisation.HospitalOrganisation;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.AvailabityWorkArea.ManagerForHospitalWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author manalisharma
 */
public class ManagerHospital extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Disaster business, EnterpriseDirectory enterprisedirectory) {
          return new ManagerForHospitalWorkArea(userProcessContainer, account, organisation, business);
    }    
}
