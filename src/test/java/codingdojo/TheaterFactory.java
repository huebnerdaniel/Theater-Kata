package codingdojo;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TheaterFactory {

    /**
     * Factory method to create a standard theater with 7 rows of 10 seats each
     */
    public static Theater standardTheater() {
        Map<String, List<Integer>> seats = new HashMap<>();
        seats.put("A", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        seats.put("B", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        seats.put("C", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        seats.put("D", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        seats.put("E", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        seats.put("F", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        seats.put("G", Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));
        return new Theater(seats);
    }

    public static Theater newTheater(Map<String, List<Integer>> seats) {
        return new Theater(seats);
    }
}
