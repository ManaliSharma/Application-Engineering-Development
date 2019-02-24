/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author rusha
 */
public class RequestRehabTestRequest extends WorkRequest {
    private String Availability1;
    private String PhoneNumber;
    private String EmailAddress;
    private String Address;

    public String getAvailability1() {
        return Availability1;
    }

    public void setAvailability1(String Availability) {
        this.Availability1 = Availability;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

    public String getEmailAddress() {
        return EmailAddress;
    }

    public void setEmailAddress(String EmailAddress) {
        this.EmailAddress = EmailAddress;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }
    
}
