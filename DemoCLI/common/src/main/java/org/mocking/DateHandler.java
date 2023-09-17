package org.mocking;

import java.util.Date;

public class DateHandler {
    public static long currentTime() {
        return new Date().getTime();
    }
}
