package sdajava20190102.lenic.eu;

//https://www.vaughns-1-pagers.com/computer/powers-of-2.htm

public enum SizeUnits {
    UNIT_NONE(1<<0, ' '),
    UNIT_KILO(1<<10, 'K'),
    UNIT_MEGA(1<<20, 'M'),
    UNIT_GIGA(1<<30, 'G'),
    UNIT_TERA(1<<40, 'T');

    private char unit;
    private long size;

    private SizeUnits(int size, char unit)
    {
        this.size = size;
        this.unit = unit;
    }

    public char getUnit()
    {
        return this.unit;
    }

    public long getSize()
    {
        return this.size;
    }

    public long restDiv(long value)
    {
        return value / this.size;
    }
}
