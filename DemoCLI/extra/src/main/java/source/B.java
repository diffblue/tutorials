package source;

public class B extends A {
    int b = 4;
    @Override
    int method(double x) {
        return (int) (a * b * x);
    }
}
