package Business.Organisation;

import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.WorkQueue.BloodBankWorkTestRequest;
import Business.WorkQueue.FireToHospitalRequest;
import Business.WorkQueue.HospitalAvailabilityWorkTestRequest;
import Business.WorkQueue.PoliceToHospitalRequest;
import java.util.ArrayList;

/**
 *
 * @author rusha
 */
public class HospitalOrganisation extends Organisation{

    private ArrayList<BloodBankWorkTestRequest> hospitalbloodqueue;
    private ArrayList<HospitalAvailabilityWorkTestRequest> hospitalavailablityqueue;
    private ArrayList<PoliceToHospitalRequest> pthqueue;
    private ArrayList<FireToHospitalRequest> fthqueue;

    public ArrayList<HospitalAvailabilityWorkTestRequest> getHospitalavailablityqueue() {
        return hospitalavailablityqueue;
    }

    public void setHospitalavailablityqueue(ArrayList<HospitalAvailabilityWorkTestRequest> hospitalavailablityqueue) {
        this.hospitalavailablityqueue = hospitalavailablityqueue;
    }

    public ArrayList<BloodBankWorkTestRequest> getHospitalbloodqueue() {
        return hospitalbloodqueue;
    }

    public void setHospitalbloodqueue(ArrayList<BloodBankWorkTestRequest> hospitalbloodqueue) {
        this.hospitalbloodqueue = hospitalbloodqueue;
    }

    public ArrayList<PoliceToHospitalRequest> getPthqueue() {
        return pthqueue;
    }

    public void setPthqueue(ArrayList<PoliceToHospitalRequest> pthqueue) {
        this.pthqueue = pthqueue;
    }

    public ArrayList<FireToHospitalRequest> getFthqueue() {
        return fthqueue;
    }

    public void setFthqueue(ArrayList<FireToHospitalRequest> fthqueue) {
        this.fthqueue = fthqueue;
    }

    public HospitalOrganisation() {
        super(Organisation.Type.Hospital.getValue());
        this.hospitalbloodqueue=new ArrayList<>();
        this.hospitalavailablityqueue=new ArrayList<>();
        this.pthqueue=new ArrayList<>();
        this.fthqueue=new ArrayList<>();
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList();
        roles.add(new DoctorRole());
        return roles;
    }

    
    
    
    
    
    
    
    
    
    
}
