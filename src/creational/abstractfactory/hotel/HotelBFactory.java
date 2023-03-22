package creational.abstractfactory.hotel;

public class HotelBFactory implements HotelFactory {
    @Override
    public Reservation createReservation() {
        System.out.println("Hotel B Reservation");
        return new Reservation();
    }

    @Override
    public Payment createPayment() {
        System.out.println("Hotel B Payment");
        return new Payment();
    }

    @Override
    public Room createRoom() {
        System.out.println("Hotel B Room");
        return new Room();
    }

    @Override
    public Customer createCustomer() {
        System.out.println("Hotel B Customer");
        return new Customer();
    }
}
