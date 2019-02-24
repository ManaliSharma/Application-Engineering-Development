/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.RequestReportRole;
import Business.Role.Role;

import Business.WorkQueue.RequestReportTestRequest;
//import Business.WorkQueue.RequestReportTestRequest;
import java.util.ArrayList;
/**
 *
 * @author rusha
 */
public class RequestReportOrganisation extends Organisation {
    private ArrayList<RequestReportTestRequest> requestreporttest;

    public ArrayList<RequestReportTestRequest> getRequestreporttest() {
        return requestreporttest;
    }

    public void setRequestreporttest(ArrayList<RequestReportTestRequest> requestreporttest) {
        this.requestreporttest = requestreporttest;
    }

    

   
    public RequestReportOrganisation() {
        super(Organisation.Type.RequestReport.getValue());
        this.requestreporttest=new ArrayList<>();
    }

   

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new RequestReportRole());
        return roles;
    }
}
