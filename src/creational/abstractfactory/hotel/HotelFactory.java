package creational.abstractfactory.hotel;

public interface HotelFactory {
    public Reservation createReservation();
    public Payment createPayment();
    public Room createRoom();
    public Customer createCustomer();
}
