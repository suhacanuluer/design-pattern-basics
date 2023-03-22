package creational.abstractfactory.hotel;

public class HotelCFactory implements HotelFactory {
    @Override
    public Reservation createReservation() {
        System.out.println("Hotel C Reservation");
        return new Reservation();
    }

    @Override
    public Payment createPayment() {
        System.out.println("Hotel C Payment");
        return new Payment();
    }

    @Override
    public Room createRoom() {
        System.out.println("Hotel C Room");
        return new Room();
    }

    @Override
    public Customer createCustomer() {
        System.out.println("Hotel C Customer");
        return new Customer();
    }
}
