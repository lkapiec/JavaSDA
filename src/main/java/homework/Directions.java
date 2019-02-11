package homework;

public enum Directions {
    NORTH("połnoc",12),
    EAST("fzhut", 12),
    SOUTH("południe",13),
    WEST("zachód",12);

    private String translation;
    private int additionalInfo;

    public int getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(int additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    private Directions(String opis, int wartosc)
    {
        this.translation = opis;
    }

    public String getTranslation()
    {
        return this.translation;
    }
}
