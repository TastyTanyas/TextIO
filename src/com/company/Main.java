package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ReadFile reader = new ReadFile();
        reader.openFile("data.txt");
        int[] ints1 = reader.readInts();
        int[] ints2 = reader.readInts();
        if (ints1 != null)
            for (int i : ints1) {
                System.out.print(i + " ");
            }
        System.out.println();
        if (ints1 != null)
            for (int i : ints2) {
                System.out.print(i + " ");
            }
        System.out.println();
    }
}

