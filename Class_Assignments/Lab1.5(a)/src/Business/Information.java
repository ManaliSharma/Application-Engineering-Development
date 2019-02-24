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
public class Information {

    /**
     * @param args the command line arguments
     */
    Information info=new Information();
    public static void main(String[] args) {
        // TODO code application logic here
        
        Person person=new Person();
        person.setFirstName("Joe");
        person.setLastName("Smith");
        person.setDateOfBirth("2/2/1986");
        person.setSocialSecurityNumber("22");
        Address HomeAddress=new Address();
        HomeAddress.setStreetLine1("201 Best Street");
        HomeAddress.setStreetLine2("croossover");
        HomeAddress.setCity("Cool-Town");
        HomeAddress.setState("Shanghai");
        HomeAddress.setZipCode("02115");
        HomeAddress.setCountry("China");
    
        person.setHomeAddress(HomeAddress);
    
    
        Address WorkAddress=new Address();
        WorkAddress.setStreetLine1("360 Huntington Ave");
        WorkAddress.setStreetLine2("Snell Engineering");
        WorkAddress.setCity("Boston");
        WorkAddress.setState("MA");
        WorkAddress.setZipCode("02115");
        WorkAddress.setCountry("United States");
        person.setWorkAddress(WorkAddress);
    
    
        Address LocalAddress=new Address();
        LocalAddress.setStreetLine1("100 Main Street");
        LocalAddress.setStreetLine2("");
        LocalAddress.setCity("Natick");
        LocalAddress.setState("MA");
        LocalAddress.setZipCode("01760");
        LocalAddress.setCountry("United States");
        person.setLocalAddress(LocalAddress);
    
        
        
        
        
        
        
        
        System.out.println("Person Information");
        System.out.println("First Name: "+person.getFirstName());
        System.out.println("Last Name: "+person.getLastName());
        System.out.println("Date of Birth: "+person.getDateOfBirth());
        System.out.println("Social Security Number: "+person.getSocialSecurityNumber());
        System.out.println();
        System.out.println("Home Address Information");
        System.out.println("StreetLine1 : "+person.HomeAddress.getStreetLine1());
        System.out.println("StreetLine2 : "+person.HomeAddress.getStreetLine2());
        System.out.println("City : "+person.HomeAddress.getCity());
        System.out.println("State : "+person.HomeAddress.getState());
        System.out.println("Zipcode : "+person.HomeAddress.getZipCode());
        System.out.println("Country : "+person.HomeAddress.getCountry());
        System.out.println();
        System.out.println("Local Address Information");
        System.out.println("StreetLine1 : "+person.LocalAddress.getStreetLine1());
        System.out.println("StreetLine2 : "+person.LocalAddress.getStreetLine2());
        System.out.println("City : "+person.LocalAddress.getCity());
        System.out.println("State : "+person.LocalAddress.getState());
        System.out.println("Zipcode : "+person.LocalAddress.getZipCode());
        System.out.println("Country : "+person.LocalAddress.getCountry());
        System.out.println();
        System.out.println("Work Address Information");
        System.out.println("StreetLine1 : "+person.WorkAddress.getStreetLine1());
        System.out.println("StreetLine2 : "+person.WorkAddress.getStreetLine2());
        System.out.println("City : "+person.WorkAddress.getCity());
        System.out.println("State : "+person.WorkAddress.getState());
        System.out.println("Zipcode : "+person.WorkAddress.getZipCode());
        System.out.println("Country : "+person.WorkAddress.getCountry());
               
        
    }
    
}
