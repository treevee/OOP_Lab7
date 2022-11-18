package School;

public enum Seasons {
    WINTER("Winter"),
    SPRING("Spring"),
    SUMMER("Summer"),
    AUTUMN("Autumn");

    private String seasonName;

    Seasons(String seasonName) {
        this.seasonName = seasonName;
    }

    public String getName() {
        return seasonName;
    }
}
