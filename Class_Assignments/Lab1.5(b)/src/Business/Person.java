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
public class Person {
    
    private String FirstName;
    private String LastName;
    private String SocialSecurityNumber;
    private String DateOfBirth;
    Address HomeAddress;
    Address WorkAddress;
    Address LocalAddress;
    
    /*public Person(){ 
    this.setFirstName("Joe");
    this.setLastName("Smith");
    this.setDateOfBirth("2/2/1986");
    this.setSocialSecurityNumber("22");
    
    Address HomeAddress=new Address();
    HomeAddress.setStreetLine1("201 Best Street");
    HomeAddress.setStreetLine2("croossover");
    HomeAddress.setCity("Cool-Town");
    HomeAddress.setState("Shanghai");
    HomeAddress.setZipCode("02115");
    HomeAddress.setCountry("China");
    
    this.setHomeAddress(HomeAddress);
    
    
    Address WorkAddress=new Address();
    WorkAddress.setStreetLine1("360 Huntington Ave");
    WorkAddress.setStreetLine2("Snell Engineering");
    WorkAddress.setCity("Boston");
    WorkAddress.setState("MA");
    WorkAddress.setZipCode("02115");
    WorkAddress.setCountry("United States");
    this.setWorkAddress(WorkAddress);
    
    
    Address LocalAddress=new Address();
    LocalAddress.setStreetLine1("100 Main Street");
    LocalAddress.setStreetLine2("");
    LocalAddress.setCity("Natick");
    LocalAddress.setState("MA");
    LocalAddress.setZipCode("01760");
    LocalAddress.setCountry("United States");
    this.setLocalAddress(LocalAddress);
    }*/
    public Address getLocalAddress() {
        return LocalAddress;
    }

    public void setLocalAddress(Address LocalAddress) {
        this.LocalAddress = LocalAddress;
    }

    public Address getWorkAddress() {
        return WorkAddress;
    }

    public void setWorkAddress(Address WorkAddress) {
        this.WorkAddress = WorkAddress;
    }

    public Address getHomeAddress() {
        return HomeAddress;
    }

    public void setHomeAddress(Address HomeAddress) {
        this.HomeAddress = HomeAddress;
    }

   

    
    
    
    
    
    
    
    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public String getSocialSecurityNumber() {
        return SocialSecurityNumber;
    }

    public void setSocialSecurityNumber(String SocialSecurityNumber) {
        this.SocialSecurityNumber = SocialSecurityNumber;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String DateOfBirth) {
        this.DateOfBirth = DateOfBirth;
    }

    
}
