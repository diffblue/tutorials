package before;

import org.junit.jupiter.api.BeforeEach;

public class RelayDiffblueBase {
    @BeforeEach
    public void enableTesting() {
        Relay.open();
    }
}