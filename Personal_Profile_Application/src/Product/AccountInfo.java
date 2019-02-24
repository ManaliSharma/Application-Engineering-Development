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
public class AccountInfo {
    private String BankName;
    private String BankAccountNumber;
    private String BankRountingNumber;
    private String AccountBalance;
    private String AccountType;

    public String getBankName() {
        return BankName;
    }

    public void setBankName(String BankName) {
        this.BankName = BankName;
    }

    public String getBankAccountNumber() {
        return BankAccountNumber;
    }

    public void setBankAccountNumber(String BankAccountNumber) {
        this.BankAccountNumber = BankAccountNumber;
    }

    public String getBankRountingNumber() {
        return BankRountingNumber;
    }

    public void setBankRountingNumber(String BankRountingNumber) {
        this.BankRountingNumber = BankRountingNumber;
    }

    public String getAccountBalance() {
        return AccountBalance;
    }

    public void setAccountBalance(String AccountBalance) {
        this.AccountBalance = AccountBalance;
    }

    public String getAccountType() {
        return AccountType;
    }

    public void setAccountType(String AccountType) {
        this.AccountType = AccountType;
    }
    
}
