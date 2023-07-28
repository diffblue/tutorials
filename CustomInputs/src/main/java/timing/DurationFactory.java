package timing;

import java.time.Duration;
import java.time.Instant;

public class DurationFactory {
    // factory method
    public static Duration load(String s1, String s2) {
        Instant start = Instant.parse(s1);
        Instant end = Instant.parse(s2);
        Duration duration = Duration.between(start, end);
        return duration;
    }
}