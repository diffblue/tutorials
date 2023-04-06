package strings;

public class Member {
    private String name;
    private String club;
    private long L;

    public Member(String name, String club) {
        this.name = name;
        this.club = club;
    }

    public String getName() {
        return name;
    }

    public void setName(String name, long L) {
        this.name = name;
        this.L = L;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}