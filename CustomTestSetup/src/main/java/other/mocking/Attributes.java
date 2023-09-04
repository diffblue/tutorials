package other.mocking;

public class Attributes {
    private Service service;

    Attributes () {
        service = Service.service;
        service.warmup();
    }

    int operate(int a, int b) {
        return a + b;
    }
}
