package codingdojo;

import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class SeatFinder {

    private Theater theater;
    private List<Seat> booked;

    public SeatFinder(Theater theater) {
        this(theater, new ArrayList<>());
    }

    public SeatFinder(Theater theater, List<Seat> booked) {
        this.theater = theater;
        this.booked = booked;
    }

    public List<Seat> suggest(int partySize) {
        List<Seat> seats = theater.getAvailableSeats();
        return seats;
    }
}