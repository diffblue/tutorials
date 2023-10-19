package other.fieldinputs;

public class Owl {
    public int isOwl(String bird) {
        if (bird.startsWith("ow")) {
            if (bird.endsWith("wl") && bird.length() == 3) {
                return 0;
            }
            return 1;
        }
        return 3;
    }
}