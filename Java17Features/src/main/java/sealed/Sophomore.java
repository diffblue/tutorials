package sealed;

public non-sealed class Sophomore extends Staff {
    private final int K;

    // hiding
    static int operate(int a, int b) {
        return a - b;
    }

    private Sophomore(int K) {
        super(K);
        this.K = K;
    }
}