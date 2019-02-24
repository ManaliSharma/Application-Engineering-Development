/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;
import java.util.ArrayList;


/**
 *
 * @author manalisharma
 */



public class VitalSignHistory {
    
    
    
    public VitalSignHistory(){

        vitalSignHistory=new ArrayList<VitalSign>();
    }
    
    private ArrayList<VitalSign> vitalSignHistory;
   

   

    

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> vitalSignHistory) {
        this.vitalSignHistory = vitalSignHistory;
    }
    
    public VitalSign addVital(){
        
        VitalSign vs=new VitalSign(); //create new object   
        vitalSignHistory.add(vs);    //adding object in array list as in adding items from vitaslsign class attributes
        return vs;
                
    }
    
    public void deleteVital(VitalSign v){
    
        vitalSignHistory.remove(v); //remove object from table
    
    }
    
    public ArrayList<VitalSign> getAbnormallist(double maxBP,double minBP){
    
        ArrayList<VitalSign> abnlist=new ArrayList<>();
        
        for (VitalSign vs : vitalSignHistory) {
            if(vs.getBloodPressure()>maxBP || vs.getBloodPressure()<minBP){
                abnlist.add(vs);
                
            }
        }
         return abnlist;
         
         
    }
}
    
    
    

