package codingdojo;


import org.junit.jupiter.api.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;

public class SeatFinderTest {

    @Test
    public void suggestSeatsInMiddle() {
        //given
        Theater theater = TheaterFactory.newTheater(Map.of(
                "A", Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                "B", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8),
                "C", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                "D", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9),
                "E", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                "F", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10),
                "G", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
        ));
        List<Seat> booked = Stream.of("A2", "A3", "A4", "A5", "A6").map(Seat::new).collect(Collectors.toList());
        SeatFinder seatFinder = new SeatFinder(theater, booked);

        //when
        List<Seat> suggestedSeats = seatFinder.suggest(2);

        //then
        List<Seat> expectedSuggestedSeats = Stream.of("B4", "B5").map(Seat::new).collect(Collectors.toList());
        assertThat(suggestedSeats).isEqualTo(expectedSuggestedSeats);
    }

}