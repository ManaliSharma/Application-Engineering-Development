/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author manalisharma
 */
public class TravelAgency {
    
    private AirlinerDirectory airDir ;

    public AirlinerDirectory getAirDir() {
        return airDir;
    }

    public void setAirDir(AirlinerDirectory airDir) {
        this.airDir = airDir;
    }

    
    

    
  
 
    public TravelAgency(){
    this.airDir =new AirlinerDirectory();
    
    
    }
    
    
}
