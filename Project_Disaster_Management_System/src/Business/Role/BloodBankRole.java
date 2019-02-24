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
import Business.UserAccount.UserAccount;
import UserInterface.BloodBank.ManageBloodBankJPanel;

import javax.swing.JPanel;

/**
 *
 * @author rusha
 */
public class BloodBankRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organisation organisation, Enterprise enterprise, Disaster business, EnterpriseDirectory enterpriseDirectory) {
         return new ManageBloodBankJPanel(userProcessContainer, account, organisation, business);
    
    }
    
}
