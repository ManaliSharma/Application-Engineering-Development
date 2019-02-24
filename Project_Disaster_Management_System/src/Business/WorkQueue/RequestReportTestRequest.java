/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author rusha
 */
public class RequestReportTestRequest extends WorkRequest {
    private String Availability2;
    private int AvailabilityVans;
    private int PoliceOfficers;
    private static int avavan=45;
    private static int avapol=100;

    public int getAvailabilityVans() {
        return AvailabilityVans;
    }

    public int getPoliceOfficers() {
        return PoliceOfficers;
    }
    

    public RequestReportTestRequest(){
        
        AvailabilityVans=avavan;
        PoliceOfficers=avapol;
        avavan--;
        avapol--;
    
    
    }
    public String getAvailability2() {
        return Availability2;
    }

    public void setAvailability2(String Availability2) {
        this.Availability2 = Availability2;
    }

   
    
    
    
}