package OOP;

public class VipCustomers {
    private String name;
    private double creditLimit;
    private String address;

    public VipCustomers() {
        this("Default Name",100,"Default Address");
    }

    public VipCustomers(String name, String address) {
       this("Default Name",120,"Default Address");
    }

    public VipCustomers(String name, double creditLimit, String address) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.address = address;
    }



    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getAddress() {
        return address;
    }


}
