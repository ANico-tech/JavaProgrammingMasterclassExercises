package OOP;

public class BankAccount {
    private int accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private int phoneNumber;

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public double getBalance() {
        return this.balance;
    }

    public String getCustomerName() {
        return this.customerName;
    }

    public String getEmail() {
        return this.email;
    }

    public int getPhoneNumber() {
        return this.phoneNumber;
    }

    public void depositFunds(double extraFunds){
        this.balance +=extraFunds;
        System.out.println("New balance value is:" + this.balance);
    }

    public void withdrawFunds(double neededFunds){
        if (this.balance<neededFunds){
            System.out.println("Insufficient funds ");
        }
        else {
            this.balance -=neededFunds;
            System.out.println("New balance value is:" + this.balance);
        }
    }
}
