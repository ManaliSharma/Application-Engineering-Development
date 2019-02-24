
package Business.Role;

import Business.Disaster;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation;
import UserInterface.AdminstrativeRole.AdminWorkAreaJPanel;
import javax.swing.JPanel;

public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Disaster business, EnterpriseDirectory enterprisedirectory) {
       return new AdminWorkAreaJPanel(userProcessContainer, enterprise, organisation);
    } 
}

    

    
    

