package com.company;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadFile {
    BufferedReader in;

    public void openFile(String file) {
        if(fileExist(file)) {
        try {
            in = new BufferedReader(new FileReader(file));
        } catch (IOException e) {
            e.printStackTrace();
        }
    } else {
        System.out.println("Filen kan ikke åbnes");
    }
}


    public int[] readInts() throws IOException {
       String text = "";
       //String line = in.readLine();
        //while(line != null) {
        text = text + in.readLine();
       //}
       //System.out.println(text);
        return null;
    }

    public void closeFile() {

        try {
            in.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public boolean fileExist(String file) {
        Path filePath = Paths.get(file);
        return Files.exists(filePath);
    }
}
