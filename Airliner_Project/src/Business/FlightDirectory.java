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
public class FlightDirectory {

   
   private ArrayList<Flight> flight_Directory;
   //private SeatDirectory seatDirectory;

    /*public SeatDirectory getSeatDirectory() {
        return seatDirectory;
    }

    public void setSeatDirectory(SeatDirectory seatDirectory) {
        this.seatDirectory = seatDirectory;
    }*/
   
   
     public FlightDirectory(){
         this.flight_Directory = new ArrayList<Flight>();
          //this.seatDirectory =new SeatDirectory();
    
    }

    public ArrayList<Flight> getFlight_Directory() {
        return flight_Directory;
    }

    public void setFlight_Directory(ArrayList<Flight> flight_Directory) {
        this.flight_Directory = flight_Directory;
    }

    
    
    
    public Flight addFlight(){
       
        
        
        Flight newFlight = new Flight();
        flight_Directory.add(newFlight);
        return newFlight;
    }
    
    public void deleteFlight(Flight product){
        flight_Directory.remove(product);
    }
    
    public Flight searchFlight(String name){
        for(Flight aip : this.flight_Directory){
            if(aip.getName().equalsIgnoreCase(name)){
                return aip;
            }
        }
        return null;
    }
    
    
    
    
    }
    
  