package org.features;

public sealed class Bear permits org.features.Koala {
    private int N;

    protected Bear(int n) {
        N = n;
    }

    public int getIt() {
        return N;
    }
}