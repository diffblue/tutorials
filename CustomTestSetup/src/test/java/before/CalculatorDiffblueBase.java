package before;

import org.junit.jupiter.api.BeforeAll;

public class CalculatorDiffblueBase {
    @BeforeAll
    public static void enableTheFeaturesBeforeTesting() {
        Calculator.licenseAllFeatures();
    }
}
