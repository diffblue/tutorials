package timing;

import java.time.*;

public class DateFactory {
    public static Clock getSpecificDateForTesting() {
        LocalDate ld = LocalDate.of(1969, Month.APRIL, 25);
        ZoneId zone = ZoneId.of("Africa/Johannesburg");
        Clock clock = Clock.fixed(ld.atStartOfDay().atZone(zone).toInstant(), zone);
        return clock;
    }
}