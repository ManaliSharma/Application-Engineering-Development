/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation;
import Business.Organisation.PoliceOrganisation;
import Business.UserAccount.UserAccount;
import UserInterface.PoliceRole.PoliceWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author manalisharma
 */
public class PoliceRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Disaster disaster, EnterpriseDirectory enterpriseDirectory) {
        return new PoliceWorkAreaJPanel(userProcessContainer, account,(PoliceOrganisation)organisation,enterprise, disaster, enterpriseDirectory);
    }



   

   
   

    
    
}
