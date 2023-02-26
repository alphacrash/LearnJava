package DateTimeAPI;

import java.time.*;

public class DateTime1722 {
    public static void main(String[] args) {
        // Time Zones
        for (String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }

        // LocalDate
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate: " + localDate);
        LocalDate ad = LocalDate.of(1989, Month.FEBRUARY, 28);
        System.out.println("AD: " + ad);

        // LocalTime
        LocalTime t = LocalTime.now();
        System.out.println("LocalTime: " + t);
        LocalTime tz = LocalTime.now(ZoneId.of("GMT"));
        System.out.println("GMT Time: " + tz);

        // LocalDateTime
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("LocalDateTime: " + localDateTime);

        // Instant
        Instant i = Instant.now();
        System.out.println("Instant: " + i);
    }
}
