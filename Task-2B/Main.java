public class Main {
    public static void main(String[] args) {
        // Get the singleton instance for user authentication
        UserAuthentication auth = UserAuthentication.getInstance();
        // Create vehicle and payment factories
        VehicleFactory vehicleFactory = new CarFactory(); // Change as needed
        PaymentFactory paymentFactory = new CreditCardFactory(); // Change as needed

        // Log in
        auth.login();

        // Request a vehicle
        Vehicle vehicle = vehicleFactory.createVehicle();
        vehicle.drive();

        // Make a payment
        PaymentMethod payment = paymentFactory.createPaymentMethod();
        payment.pay();

        // Log out
        auth.logout();
    }
}
