/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Product;

/**
 *
 * @author manalisharma
 */
public class License {
    private String LicenseNumber;
    private String DateOFIssue;
    private String DateOFExpiration;
    private String BloodType;
    private String picture;    

    public String getLicenseNumber() {
        return LicenseNumber;
    }

    public void setLicenseNumber(String LicenseNumber) {
        this.LicenseNumber = LicenseNumber;
    }

    public String getDateOFIssue() {
        return DateOFIssue;
    }

    public void setDateOFIssue(String DateOFIssue) {
        this.DateOFIssue = DateOFIssue;
    }

    public String getDateOFExpiration() {
        return DateOFExpiration;
    }

    public void setDateOFExpiration(String DateOFExpiration) {
        this.DateOFExpiration = DateOFExpiration;
    }

    public String getBloodType() {
        return BloodType;
    }

    public void setBloodType(String BloodType) {
        this.BloodType = BloodType;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }
    
}
