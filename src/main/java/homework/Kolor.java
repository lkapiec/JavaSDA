package homework;

public enum Kolor {
    CZERWONY(false,"red"),
    ZIELONY(true,"green"),
    NIEBIESKI(true,"blue"); // srednik zawsze konczy

    private boolean ladny;
    private String opis;

    private Kolor(boolean czyLadny, String opis)
    {
        ladny = czyLadny;
        this.opis = opis;
    }

    public boolean isLadny()
    {
        return ladny;
    }

    public String Opis()
    {
        return this.opis;
    }
}
