package com.test;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by amarchattiwar on 9/15/16.
 */
public class Test6 {

    public static void main(String[] args) throws IOException {
        List<String> folders = new ArrayList<>();
        String diskPath = "/RDNG_VLTPKG2/package";
        String parentFolder = "5772256977a5640dc8cc9b79/REALDV-4720-781/LN67897/Test1/ACH Application";
        // String fileName = "001_ACH Application_LN67897_6423807e-d19a-4e7a-ac79-4205d6998f0e_08-30-16.pdf";

        // folders.add(diskPath + File.separator + parentFolder + File.separator + fileName);
        folders.add(diskPath + File.separator + parentFolder);
        String [] folderArr = parentFolder.split(File.separator);
        for(int i=folderArr.length-1; i>0; i--) {
            // System.out.println(folderArr[i]);
            // System.out.println(diskPath + File.separator + parentFolder.substring(0, parentFolder.indexOf(folderArr[i])));
            folders.add(diskPath + File.separator + parentFolder.substring(0, parentFolder.indexOf(folderArr[i])));
        }
        System.out.println("%%%%%%%%%%%%%%%%%%%%%%%%%%%%%");
        for(String folder: folders) {
            if(Files.isRegularFile(Paths.get(folder)))
            {
                if(Files.deleteIfExists(Paths.get(folder)))
                {
                    System.out.println("Deleted: " + folder);
                }
                else
                {
                    System.out.println("Force deleting file : " + folder);
                }
            }
            else {
                long dirSize = FileUtils.sizeOfDirectory(new File(folder));
                if(dirSize == 0) {
                    FileUtils.deleteDirectory(new File(folder));
                    System.out.println("Deleted: " + folder);
                } else {
                    System.out.println("Not deleting " + folder + ", as it is containing files: " + dirSize);
                }

            }
            System.out.println(folder);
        }


        /*int index = parentFolder.indexOf(File.separator, parentFolder.indexOf(File.separator) + 1);
        String truncatedPath = parentFolder.substring(0,index);
        int index1 = truncatedPath.indexOf(File.separator, truncatedPath.indexOf(File.separator) + 1);
        if(index1 > 0){
            String path = diskPath+File.separator+truncatedPath.substring(0,index1);
            folders.add(path);
            System.out.println("Folder path added for purge:"+path);
        }else{
            String path = diskPath+File.separator+parentFolder+File.separator+fileName;
            folders.add(path);
            System.out.println("File path added for purge:"+path);
        }*/
    }
}
