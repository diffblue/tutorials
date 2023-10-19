package after;

import org.junit.jupiter.api.AfterEach;

public class StringUtilityDiffblueBase {
    @AfterEach
    public void resetCache() {
        StringUtility.cache = null;
    }
}
