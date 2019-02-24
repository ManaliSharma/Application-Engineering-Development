/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organisation;

import Business.Role.PoliceRole;
import Business.Role.Role;
import Business.WorkQueue.CustomerToPoliceRequest;
import Business.WorkQueue.FireToPoliceRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import Business.WorkQueue.RequestRehabTestRequest;
import Business.WorkQueue.RequestReportTestRequest;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class PoliceOrganisation extends Organisation{

  public PoliceOrganisation() {
        super(Organisation.Type.Police.getValue());
        this.requestrehabworktestrequest=new ArrayList<>();
        this.requestreportworktestrequest=new ArrayList<>();
        this.pthpqueue=new ArrayList<>();
        this.ftpqueue=new ArrayList<>();
        this.ctprqueue=new ArrayList<>();
    }
    
  private ArrayList <RequestRehabTestRequest> requestrehabworktestrequest;
  private ArrayList <RequestReportTestRequest> requestreportworktestrequest; 
  private ArrayList<PoliceToHospitalRequest> pthpqueue;
  private ArrayList<FireToPoliceRequest> ftpqueue;
  private ArrayList<CustomerToPoliceRequest> ctprqueue;

    public ArrayList<RequestRehabTestRequest> getRequestrehabworktestrequest() {
        return requestrehabworktestrequest;
    }

    public void setRequestrehabworktestrequest(ArrayList<RequestRehabTestRequest> requestrehabworktestrequest) {
        this.requestrehabworktestrequest = requestrehabworktestrequest;
    }

    public ArrayList<RequestReportTestRequest> getRequestreportworktestrequest() {
        return requestreportworktestrequest;
    }

    public void setRequestreportworktestrequest(ArrayList<RequestReportTestRequest> requestreportworktestrequest) {
        this.requestreportworktestrequest = requestreportworktestrequest;
    }

    public ArrayList<PoliceToHospitalRequest> getPthpqueue() {
        return pthpqueue;
    }

    public void setPthpqueue(ArrayList<PoliceToHospitalRequest> pthpqueue) {
        this.pthpqueue = pthpqueue;
    }

    public ArrayList<FireToPoliceRequest> getFtpqueue() {
        return ftpqueue;
    }

    public void setFtpqueue(ArrayList<FireToPoliceRequest> ftpqueue) {
        this.ftpqueue = ftpqueue;
    }

    public ArrayList<CustomerToPoliceRequest> getCtprqueue() {
        return ctprqueue;
    }

    public void setCtprqueue(ArrayList<CustomerToPoliceRequest> ctprqueue) {
        this.ctprqueue = ctprqueue;
    }

  
  
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new PoliceRole());
        return roles;
    }

}
