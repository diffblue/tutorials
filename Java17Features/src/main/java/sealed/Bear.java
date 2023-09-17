package sealed;

public sealed class Bear permits Kodiak, Koala {
    private int N;

    Bear(int n) {
        N = n;
    }

    Bear() {
        N = 1;
    }

    public int getIt() {
        return N;
    }
}