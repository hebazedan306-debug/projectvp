package edu.zuj.vp.sem2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileTestchild {

    public static String readFile(String fileName) throws IOException {

        FileReader reader = new FileReader(fileName);
        BufferedReader bReader = new BufferedReader(reader);

        String line;
        String result = "";

        while ((line = bReader.readLine()) != null) {
            result += line + "\n";
        }
        bReader.close();

        return result;
    }

    public static void writeToFile(String fileName, String contents)
            throws IOException {

        FileWriter fw = new FileWriter(fileName, true);

        fw.append(contents);

        fw.close();
    }
}
