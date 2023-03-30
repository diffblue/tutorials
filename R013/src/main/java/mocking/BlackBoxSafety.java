package mocking;

public class BlackBoxSafety {
    public static boolean isSafe(BlackBox blackBox) {
        if (blackBox.getSafetyLevel().equals("SAFE")) {
            return true;
        }
        return false;
    }
}
