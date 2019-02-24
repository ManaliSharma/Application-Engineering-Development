package Business.Role;

import Business.Disaster;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseDirectory;
import Business.Organisation.Organisation;
import Business.UserAccount.UserAccount;
import UserInterface.SystemAdminWorkAreas.SystemAdminWorkAreaJPanel;
import javax.swing.JPanel;

public class SysAdmin extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Disaster business, EnterpriseDirectory enterprisedirectory) {
        return new SystemAdminWorkAreaJPanel(userProcessContainer, business);
    }
}
