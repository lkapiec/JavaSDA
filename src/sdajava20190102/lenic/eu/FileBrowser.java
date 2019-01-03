package sdajava20190102.lenic.eu;

import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class FileBrowser  {
    public static void main(String...arg)
    {
        System.out.println("==FileBrowser==");

        File dir = new File("/");

        ArrayList<Files> files = new ArrayList<Files>();

        File[] fileList = dir.listFiles();


        // colecting info
        for(File f : fileList)
        {
            //Files plik;

            //plik.canExecute = f.canExecute();

            //System.out.println(f.getName());
            files.add(new Files(f.getName(),f.isDirectory(), f.isFile(), f.isHidden(), f.canExecute(), f.canRead(),f.canWrite(), f.lastModified(), f.length()));
        }

        // display structure

//        for(int index = 0; index < files.size(); index++)
 //       {
 //           System.out.println(files.get(index));
 //       }

        Comparator<Files> DIR_FIRST = new Comparator<Files>() {
            @Override
            public int compare(Files files, Files t1) {
                return files.isDirectory ? -1 : files.isFile ? 1 : 0;
            }
        };


        Comparator<Files> FILES_FIRST = new Comparator<Files>() {
            @Override
            public int compare(Files files, Files t1) {
                return files.isDirectory ? 1 : files.isFile ? -1 : 0;
            }
        };

        /* sort by type - directory first */
        Collections.sort(files, new Comparator<Files>() {
            @Override
            public int compare(Files files, Files t1) {
                return files.isDirectory ? -1 : files.isFile ? 1 : 0;
            }
        });


       // Collections.sort(files, Files.);

        for(Files item : files)
        {
            System.out.println(item);
        }


    }
}
