package Business.WorkQueue;

public class FireToHospitalRequest extends WorkRequest{
    String AvailableNumberHospitalH;

    public String getAvailableNumberHospitalH() {
        return AvailableNumberHospitalH;
    }

    public void setAvailableNumberHospitalH(String AvailableNumberHospitalH) {
        this.AvailableNumberHospitalH = AvailableNumberHospitalH;
    }
}
