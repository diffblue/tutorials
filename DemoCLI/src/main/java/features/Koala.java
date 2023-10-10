package features;

public final class Koala extends Bear {
    private int M;

    Koala(int n) {
        super(n);
        M = n;
    }

    @Override
    public int getIt() {
        return M;
    }
}
