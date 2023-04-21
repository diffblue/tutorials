package sealed;

public sealed class Bear permits Kodiak, Koala {
    private int N;

    Bear(int n) {
        N = n;
    }

    public int getIt() {
        return N;
    }
}