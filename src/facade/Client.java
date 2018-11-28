package facade;

public class Client {
    public static void main(String[] args) {
        TripFacade tripFacade = new TripFacade(new Flight(), new Hotel(), new Excursion());
        tripFacade.orderAllInclusiveTour();
    }
}
