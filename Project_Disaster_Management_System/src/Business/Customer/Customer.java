package Business.Customer;

import Business.WorkQueue.CustomerToPoliceRequest;
import java.util.ArrayList;

public class Customer {
    
    private String Name;
    private String email;
    private String Type;
    private String emergencyType;
    private String BlueDesc;
    private int Donation;

    public int getDonation() {
        return Donation;
    }

    public void setDonation(int Donation) {
        this.Donation = Donation;
    }
    
    
    private ArrayList<CustomerToPoliceRequest> ctprcqueue;

    public ArrayList<CustomerToPoliceRequest> getCtprcqueue() {
        return ctprcqueue;
    }

    public void setCtprcqueue(ArrayList<CustomerToPoliceRequest> ctprcqueue) {
        this.ctprcqueue = ctprcqueue;
    }
   
    public String getType() {
        return Type;
    }

    public void setType(String Type) {
        this.Type = Type;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    private String Description;
    private String location;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmergencyType() {
        return emergencyType;
    }

    public void setEmergencyType(String emergencyType) {
        this.emergencyType = emergencyType;
    }

    public String getBlueDesc() {
        return BlueDesc;
    }

    public void setBlueDesc(String BlueDesc) {
        this.BlueDesc = BlueDesc;
    }
    
    
    private String Street;
    private String PhoneNumber;
 
    
    public Customer(){
    this.ctprcqueue=new ArrayList<>();

    }
    

    
    @Override
    public String toString()
    
    {
        return Name;
    
    }
}
