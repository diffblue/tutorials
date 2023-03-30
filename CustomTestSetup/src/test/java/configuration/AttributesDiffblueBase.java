package configuration;

import org.junit.jupiter.api.BeforeAll;
import org.mockito.Mockito;

public class AttributesDiffblueBase {
    @BeforeAll
    static void setup() {
        Service.service = Mockito.mock(Service.class);
    }
}
