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
public class RequestInformationTestRequest extends WorkRequest {
    private String AvailabilityFireEngine;
    private String FireMan;

    public String getAvailabilityFireEngine() {
        return AvailabilityFireEngine;
    }

    public void setAvailabilityFireEngine(String AvailabilityFireEngine) {
        this.AvailabilityFireEngine = AvailabilityFireEngine;
    }

    public String getFireMan() {
        return FireMan;
    }

    public void setFireMan(String FireMan) {
        this.FireMan = FireMan;
    }
    
    
    
}
