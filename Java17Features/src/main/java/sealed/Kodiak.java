package sealed;

public non-sealed class Kodiak extends Bear {
    private int K;

    Kodiak(int n) {
        super(n);
        K = n;
    }

    @Override
    public int getIt() {
        return K;
    }
}