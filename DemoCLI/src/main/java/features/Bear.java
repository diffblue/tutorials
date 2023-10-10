package features;

public sealed class Bear permits Koala {
    private int N;

    protected Bear(int n) {
        N = n;
    }

    public int getIt() {
        return N;
    }
}