package after;

import org.junit.jupiter.api.AfterAll;
public class StoreDiffblueBase {

    @AfterAll
    static public void resetDatastoreForOtherTests() {
        Store.dataStore = null;
    }
}