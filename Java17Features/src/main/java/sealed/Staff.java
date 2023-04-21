package sealed;

public sealed class Staff permits Student, Sophomore {
    private int N;
    private char a, b;

    static int operate (int a, int b) {
        return a * b;
    }

    Staff(int N) {
        this.N = N;
    }

    Staff(char a, char b) {
        this.a = a;
        this.b = b;
    }


    String getWord() {
        String s1 = String.valueOf(a);
        String s2 = String.valueOf(b);
        return s1 + s2;
    }
}