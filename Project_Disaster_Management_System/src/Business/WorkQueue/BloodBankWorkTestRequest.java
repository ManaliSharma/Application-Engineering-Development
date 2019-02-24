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
public class BloodBankWorkTestRequest extends WorkRequest{
 
    private String Availabilty1;
    private int BloodTypeA;
    private int BloodTypeANeg;
    private int BloodTypeAB;
    private int BloodTypeABNeg;
    private int BloodTypeB;
    private int BloodTypeBNeg;
    private int BloodTypeO;
    private int BloodTypeONeg;
    private static int BAcount=70;
    private static int BBcount=50;
    private static int BOcount=80;
    private static int BANcount=55;
    private static int BBNcount=45;
    private static int BABcount=56;
    private static int BABNcount=43;
    private static int BONcount=72;

    public BloodBankWorkTestRequest(){
        BloodTypeA=BAcount;
        BloodTypeANeg=BANcount;
        BloodTypeAB=BABcount;
        BloodTypeABNeg=BABNcount;
        BloodTypeB=BBcount;
        BloodTypeBNeg=BBNcount;
        BloodTypeO=BOcount;
        BloodTypeONeg=BONcount;
        BAcount--;
        BBcount--;
        BBNcount--;
        BABcount--;
        BABNcount--;
        BANcount--;
        BONcount--;
        BOcount--;
        
    
    
    
    
    
    }
    public int getBloodTypeA() {
        return BloodTypeA;
    }

    public int getBloodTypeANeg() {
        return BloodTypeANeg;
    }

    public int getBloodTypeAB() {
        return BloodTypeAB;
    }

    public int getBloodTypeABNeg() {
        return BloodTypeABNeg;
    }

    public int getBloodTypeB() {
        return BloodTypeB;
    }

    public int getBloodTypeBNeg() {
        return BloodTypeBNeg;
    }

    public int getBloodTypeO() {
        return BloodTypeO;
    }

    public int getBloodTypeONeg() {
        return BloodTypeONeg;
    }
    
   
    public String getAvailabilty1() {
        return Availabilty1;
    }

    public void setAvailabilty1(String Availabilty1) {
        this.Availabilty1 = Availabilty1;
    }

    
}
