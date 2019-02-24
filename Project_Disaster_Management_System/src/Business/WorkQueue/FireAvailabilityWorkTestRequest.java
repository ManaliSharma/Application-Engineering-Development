/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author janiv
 */
public class FireAvailabilityWorkTestRequest extends WorkRequest {
    private String Availabilty;
    private int Fireman;
    private int FireEngine;
    private static int countman=70;
    private static int counteng=35;

    public FireAvailabilityWorkTestRequest(){
        Fireman=countman;
        FireEngine=counteng;
        countman--;
        counteng--;
                
    
    }
    public int getFireman() {
        return Fireman;
    }

    public int getFireEngine() {
        return FireEngine;
    }
    
    public String getAvailabilty() {
        return Availabilty;
    }

    public void setAvailabilty(String Availabilty) {
        this.Availabilty = Availabilty;
    }


    
    
}
