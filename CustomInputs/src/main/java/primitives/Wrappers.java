package primitives;

public class Wrappers {

    public boolean negate(boolean flag) {
        return !flag;
    }
    public boolean negate(Boolean b) {
        return !b;
    }

    int add(Character a, char b) {
        return a + b;
    }

    int doubleIt(int x) {
        return 2*x;
    }
}













