package facade;

public class TripFacade {
    private Flight flight;
    private Hotel hotel;
    private Excursion excursion;

    public TripFacade(Flight flight, Hotel hotel, Excursion excursion) {
        this.flight = flight;
        this.hotel = hotel;
        this.excursion = excursion;
    }

    public void orderAllInclusiveTour() {
        flight.bookFlight();
        flight.buyFlight();
        hotel.bookRoom();
        excursion.getEntertainmentPlacesTour();
        excursion.getHistoricalPlacesTour();
        excursion.getSightseeingTour();
    }
}
