/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.Date;

/**
 *
 * @author manalisharma
 */
public class Flight {
    private String Name;
    private double price;
    private int Seat;
    private String FromDestination;
    private CustomerDirectory cusDir;
    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }
    private String startDate;
    private String endDate;
      
       
       
    public Flight(){
    
     this.cusDir =new CustomerDirectory();
    
    }   
//
    

    

    public int getSeat() {
        return Seat;
    }

    public void setSeat(int Seat) {
        this.Seat = Seat;
    }

    public String getFromDestination() {
        return FromDestination;
    }

    public void setFromDestination(String FromDestination) {
        this.FromDestination = FromDestination;
    }
    private String ToDestination;

   

    public String getToDestination() {
        return ToDestination;
    }

    public void setToDestination(String ToDestination) {
        this.ToDestination = ToDestination;
    }

    public String getSchedule() {
        return Schedule;
    }

    public void setSchedule(String Schedule) {
        this.Schedule = Schedule;
    }
    private String Schedule;

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

   

    
    
     @Override
    public String toString() {
        return Name;
    }
}
