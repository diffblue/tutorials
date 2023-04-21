package sealed;

abstract non-sealed class Student extends Staff {
    private final int M;

    // hiding
    static int operate(int a, int b) {
        return a + b;
    }

    public Student(int M) {
        super(M);
        this.M = M;
    }
}