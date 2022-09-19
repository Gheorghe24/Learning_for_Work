package car_dealership;

public class Customer {
    private String name, address;
    private double cashOnHand;

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public double getCashOnHand() {
        return cashOnHand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        address += "Dealership City: ";
        this.address = address;
    }

    public void setCashOnHand(double cashOnHand) {
        cashOnHand+=500; //just a bonus of 500 bucks
        this.cashOnHand = cashOnHand;
    }

    public Customer(String name, String address, double cashOnHand) {
        this.name = name;
        this.address = address;
        this.cashOnHand = cashOnHand;
    }

    public Customer() {
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
        emp.handleCustomer(this, finance, vehicle);
    }
}
