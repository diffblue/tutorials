package timing;

import java.time.Duration;
import java.time.temporal.TemporalAmount;

public class Channel {
    public Duration command( TemporalAmount ta ) {
        return Duration.from(ta);
    }
}