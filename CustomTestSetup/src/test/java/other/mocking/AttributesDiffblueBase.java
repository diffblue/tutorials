package other.mocking;

import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;
import other.mocking.Service;

public class AttributesDiffblueBase {
    @BeforeAll
    static void setup() {
        Service.service = Mockito.mock(Service.class);
    }
}
