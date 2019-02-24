/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author manalisharma
 */
public class AirlinerDirectory {
     private ArrayList<Airliner> airlinerDirectory;

    
     public AirlinerDirectory(){
     this.airlinerDirectory= new ArrayList<Airliner>();
}
     

    public ArrayList<Airliner> getAirlinerDirectory() {
        return airlinerDirectory;
    }

    public void setAirlinerDirectory(ArrayList<Airliner> airlinerDirectory) {
        this.airlinerDirectory = airlinerDirectory;
    }
     public Airliner airlineraddDirectory(){
       
        Airliner airliner=new Airliner();
        airlinerDirectory.add(airliner);
        return airliner;
        
        
    }
    
    public void deleteAirliner(Airliner airliner){
       airlinerDirectory.remove(airliner);
    }
    
    public Airliner searchAirliner(String name){
        for(Airliner fi: this.airlinerDirectory){
            if(fi.getName().equalsIgnoreCase(name)){
                return fi;
            }
        }
        return null;
    }
    
    
    

}
