package before;

public class Calculator {

    private static boolean licensed;


    public static void licenseAllFeatures() {
        licensed = true;
    }

    private static void checkLicence() {
        if (!licensed) {
            throw new IllegalStateException("Not enabled!");
        }
    }

    public static int sum(int a, int b) {
        checkLicence();
        return a + b;
    }
}