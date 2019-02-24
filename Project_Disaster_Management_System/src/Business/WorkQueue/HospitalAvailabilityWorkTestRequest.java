/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author raunak
 */
public class HospitalAvailabilityWorkTestRequest extends WorkRequest{
    
    private String Availabilty;
    private int Doctor;
    private int Beds;

    public int getDoctor() {
        return Doctor;
    }

    public int getBeds() {
        return Beds;
    }

    public int getVans() {
        return Vans;
    }
    private int Vans;
    private static int count=50;
    private static int count1=100;
    private static int count2=20;
    

    public HospitalAvailabilityWorkTestRequest(){
        Doctor=count;
        Beds=count1;
        Vans=count2;
        count--;
        count1--;
        count2--;
    
    
    }
    public String getAvailabilty() {
        return Availabilty;
    }

    public void setAvailabilty(String Availabilty) {
        this.Availabilty = Availabilty;
    }

   
    
    
}
