package logic;
import ui.Common;
import java.util.HashMap;
import java.util.Map;

public class Board implements Common {
    private Map<Integer, String> map;

    public Board(HashMap<Integer, String> map) {
        this.map = map; }

    public void getWinner() {
        boolean winnerSet = false;
        // check any possible win combination
        if (checkLine(new int[]{0, 4, 8})) {
            shows[0].set(true); winnerSet = true; }
        if (checkLine(new int[]{2, 4, 6})) {
            shows[1].set(true); winnerSet = true; }
        if (checkLine(new int[]{0, 1, 2})) {
            shows[2].set(true); winnerSet = true; }
        if (checkLine(new int[]{3, 4, 5})) {
            shows[3].set(true); winnerSet = true; }
        if (checkLine(new int[]{6, 7, 8})) {
            shows[4].set(true); winnerSet = true; }
        if (checkLine(new int[]{0, 3, 6})) {
            shows[5].set(true); winnerSet = true; }
        if (checkLine(new int[]{1, 4, 7})) {
            shows[6].set(true); winnerSet = true; }
        if (checkLine(new int[]{2, 5, 8})) {
            shows[7].set(true); winnerSet = true; }
        if (winnerSet)
            gameEnd.set(true);
    }

    public boolean checkLine(int[] indices) {
        boolean flag = false;
        String S1, S2, S3;
        try {
            // fetch the symbols in the map
            S1  = map.get(indices[0]);
            S2  = map.get(indices[1]);
            S3  = map.get(indices[2]);
            // only if all strings are valid
            if (!S1.isEmpty() && !S2.isEmpty() && !S3.isEmpty())
                if ( S1 == S2 && S1 == S3 )
                    flag = true;
        }
        catch (NullPointerException ex) { }
        return flag;
    }
}