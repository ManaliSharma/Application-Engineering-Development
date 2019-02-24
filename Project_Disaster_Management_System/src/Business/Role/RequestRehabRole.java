package Business.Role;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.RequestRehab.ManageRehab_JPanel;
import javax.swing.JPanel;

public class RequestRehabRole extends Role{
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Disaster business, EnterpriseDirectory enterprisedirectory) {
         return new ManageRehab_JPanel(userProcessContainer, account, organisation, business);
    }
}
