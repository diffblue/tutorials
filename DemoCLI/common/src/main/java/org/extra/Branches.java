package org.extra;

public class Branches {
    private String S, T;

    public void setSString(String str) {
        S = str;
    }

    public void setTString(String str) {
        T = str;
    }

    public int getItCovered() {
        if(S == null) {
            return 1;
        } else {
            if(T == null) {
                return 2;
            } else {
                return 3;
            }
        }
    }
}
