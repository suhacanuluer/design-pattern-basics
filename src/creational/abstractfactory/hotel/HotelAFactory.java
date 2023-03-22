package creational.abstractfactory.hotel;

public class HotelAFactory implements HotelFactory {
    @Override
    public Reservation createReservation() {
        System.out.println("Hotel A Reservation");
        return new Reservation();
    }

    @Override
    public Payment createPayment() {
        System.out.println("Hotel A Payment");
        return new Payment();
    }

    @Override
    public Room createRoom() {
        System.out.println("Hotel A Room");
        return new Room();
    }

    @Override
    public Customer createCustomer() {
        System.out.println("Hotel A Customer");
        return new Customer();
    }
}
