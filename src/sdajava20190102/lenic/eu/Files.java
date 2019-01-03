package sdajava20190102.lenic.eu;

import java.util.Calendar;
import java.util.Date;

public class Files {

    public String fileName;
    public boolean isDirectory;
    public boolean isFile;
    private boolean isHidden;
    private boolean canExecute;
    private boolean canRead;
    private boolean canWrite;
    public long lastModified;
    private long length;

    public Files(String fileName, boolean isDirectory, boolean isFile, boolean isHidden, boolean canExecute, boolean canRead, boolean canWrite, long lastModified, long size)
    {
        this.fileName = fileName;
        this.isDirectory = isDirectory;
        this.isFile = isFile;
        this.isHidden = isHidden;
        this.canWrite = canWrite;
        this.canRead = canRead;
        this.canExecute = canExecute;
        this.length = size;
        this.lastModified = lastModified;
    }

    public String toString() {
        char unit = '-';
        long size = 0;

        Calendar cal = Calendar.getInstance();
        cal.setTimeInMillis(this.lastModified);

        Date date = new Date(this.lastModified);

        if(this.length >= SizeUnits.UNIT_NONE.getSize()) {
            size = SizeUnits.UNIT_NONE.restDiv(this.length);
            unit = SizeUnits.UNIT_NONE.getUnit();
        } if(this.length >= SizeUnits.UNIT_KILO.getSize()) {
            size = SizeUnits.UNIT_KILO.restDiv(this.length);
            unit = SizeUnits.UNIT_KILO.getUnit();
        } if(this.length >= SizeUnits.UNIT_MEGA.getSize()) {
            size = SizeUnits.UNIT_MEGA.restDiv(this.length);
            unit = SizeUnits.UNIT_MEGA.getUnit();
        } if(this.length >= SizeUnits.UNIT_TERA.getSize()) {
            size = SizeUnits.UNIT_TERA.restDiv(this.length);
            unit = SizeUnits.UNIT_TERA.getUnit();
        }

        return String.format("%-20s %c%c%c%c%c %4d%c %s ", this.fileName,
                (this.isDirectory ? 'd' : (this.isFile ? 'f' : 'p')),
                (this.canRead ? 'r' : '-'),
                (this.canWrite ? 'w' : '-'),
                (this.canExecute ? 'x' : '-'),
                (this.isHidden ? 'h' : '-'),
                size,
                unit,
                date
        );
    }



}
