package serialization;

public class TestableClass {
    String getName(Cheese cheese) {
      return cheese.name;
    }
    int getMaturity(Cheese cheese) {
        return cheese.maturity;
    }
    boolean getAvailability(Cheese cheese) {
        return cheese.availability;
    }
}