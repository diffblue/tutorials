package org.mocking;

import java.util.Random;

public class Generator {

    public String makeString() {
        Random r = new Random();
        final StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 2; ++i) {
            if (r.nextBoolean()) {
                builder.append('_');
            } else {
                char c = (char) ('a' + (r.nextInt(26)));
                builder.append(c);
            }
        }
        return builder.toString();
    }
}