package org.extra;


import java.util.Arrays;
import java.util.Optional;

public enum Season {
    WINTER("Low"),
    SPRING("Medium"),
    SUMMER("High"),
    FALL("Medium");
    private final String expectedVisitors;

    // implicitly private
    Season(String expectedVisitors) {
        this.expectedVisitors = expectedVisitors;
    }

    public String getValue(Season s) {
        return s.toString();
    }

    public int getOrder(Season s) {
        return s.ordinal();
    }

    public Season getItem(String s) {
        Season item;
        Optional<Season> season = Arrays.stream(Season.values())
                .sequential().filter(v -> v.toString().equalsIgnoreCase(s)).findFirst();
        if(season.isPresent())
            item = season.get();
        else
            item = null;
        return item;
    }

}
