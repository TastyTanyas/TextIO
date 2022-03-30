package com.company;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;


public class WriteFile {
    BufferedWriter out;
    public void openFile(String file) {
        //opens file?
        try {
            out = new BufferedWriter(new FileWriter(file));

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void writeInts(int[] ints) {
        //skriv et array af heltal til den fil som er angivet/åbnet med openFile
        String text = "";
        for(int i = 0; i < ints.length; i++) {
            if(i < ints.length) {
                text = text + ints[i] + " ";
            } else {
                text = text + ints[i];
            }
        }

        try {
            out.append(text+ "\n");
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

    public void closeFile(){
        // lukker filen som blev åbnet med openfile
        try {
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
