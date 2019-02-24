package Business.Organisation;

import Business.Role.FireRole;
import Business.Role.Role;
import Business.WorkQueue.FireAvailabilityWorkTestRequest;
import Business.WorkQueue.FireRehabRequest;
import Business.WorkQueue.FireToHospitalRequest;
import Business.WorkQueue.FireToPoliceRequest;
import Business.WorkQueue.RequestInformationTestRequest;
import Business.WorkQueue.RequestReportTestRequest;
import java.util.ArrayList;

public class FireOrganisation extends Organisation{
    
    private ArrayList<FireAvailabilityWorkTestRequest> fireavailablityqueue;
    private ArrayList <FireRehabRequest> fireRehabqueue; 
    private ArrayList<FireToHospitalRequest> fthpqueue;
    private ArrayList<FireToPoliceRequest> ftppqueue;
    public ArrayList<FireRehabRequest> getFireRehabqueue() {
        return fireRehabqueue;
    }

    public void setFireRehabqueue(ArrayList<FireRehabRequest> fireRehabqueue) {
        this.fireRehabqueue = fireRehabqueue;
    }


    public ArrayList<FireAvailabilityWorkTestRequest> getFireavailablityqueue() {
        return fireavailablityqueue;
    }

    public void setFireavailablityqueue(ArrayList<FireAvailabilityWorkTestRequest> fireavailablityqueue) {
        this.fireavailablityqueue = fireavailablityqueue;
    }

    public ArrayList<FireToHospitalRequest> getFthpqueue() {
        return fthpqueue;
    }

    public void setFthpqueue(ArrayList<FireToHospitalRequest> fthpqueue) {
        this.fthpqueue = fthpqueue;
    }

    public ArrayList<FireToPoliceRequest> getFtppqueue() {
        return ftppqueue;
    }

    public void setFtpqueue(ArrayList<FireToPoliceRequest> ftppqueue) {
        this.ftppqueue = ftppqueue;
    }
 
    public FireOrganisation() {
        super(Organisation.Type.Fire.getValue());
        this.fireavailablityqueue=new ArrayList<>();
        this.fireRehabqueue= new ArrayList<>();
        this.fthpqueue=new ArrayList<>();
        this.ftppqueue=new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new FireRole());
        return roles;
    } 
}
