package car_dealership;

public class Dealership {
    public static void main(String[] args) {
//        Customer cust1 = new Customer("Tom", "123 Anything St", 12000);

        Customer cust1 = new Customer();
        cust1.setName("Tom");
        cust1.setAddress("123 Anything St");
        cust1.setCashOnHand(5000);

        Vehicle vehicle = new Vehicle();
        vehicle.setMake("Lamborghini");
        vehicle.setModel("Urus");
        vehicle.setPrice(2000);

        Vehicle car = new Vehicle();
        car.setMake("BMW");
        car.setModel("M3");
        car.setPrice(1000);

        Employee emp = new Employee();

        cust1.purchaseCar(vehicle, emp, false);
    }
}
