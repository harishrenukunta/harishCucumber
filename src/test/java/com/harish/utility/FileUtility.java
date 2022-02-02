package com.harish.utility;

import lombok.extern.slf4j.Slf4j;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Slf4j
public class FileUtility {

    public static void printData(String name, InputStream ins) throws IOException {
        String line;
        log.info("-----------------------------Printing Input Stream---------------------");
        BufferedReader in = new BufferedReader(new InputStreamReader(ins));
        while( (line = in.readLine()) != null){
            log.info(name + " " + line);
        }
    }

    public static void writeDataToFilePath(String filePath, String data) throws IOException {
        Path fPath = Paths.get(filePath);

        if(fPath.toFile().exists()){
            Files.createFile(fPath);
        }

        try(FileOutputStream outStream = new FileOutputStream(filePath)){
            byte[] contentBytes = data.getBytes();
            outStream.write(contentBytes);
        }catch(IOException e){
            log.error(e.toString());
        }
    }

    private FileUtility(){
        throw new IllegalStateException("FileUtility class");
    }

}
