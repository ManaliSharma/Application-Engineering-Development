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
public class Airliner {
    private String Name;
    private double Capacity;
    private int Seatnum;

    public int getSeatnum() {
        return Seatnum;
    }

    public void setSeatnum(int Seatnum) {
        this.Seatnum = Seatnum;
    }
    private FlightDirectory flightDirectory ;
    

    
  
 
    public Airliner(){
    this.flightDirectory =new FlightDirectory();
    
    
    }
    public FlightDirectory getFlightDirectory() {
        return flightDirectory;
    }

    public void setFlightDirectory(FlightDirectory flightDirectory) {
        this.flightDirectory = flightDirectory;
    }
    public double getCapacity() {
        return Capacity;
    }

    public void setCapacity(double Capacity) {
        this.Capacity = Capacity;
    }

    /*public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }*/
    private int availseat;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   

    public int getAvailseat() {
        return availseat;
    }

    public void setAvailseat(int availseat) {
        this.availseat = availseat;
    }

   @Override
    public String toString() {
        return Name;
    }
    
    
    }
