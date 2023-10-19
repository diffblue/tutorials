package utilities;

interface I {
    Integer doubleIt(Integer i);
    int level = 5;
    default double getTemperature(int i) {
        return i * level;
    }
}