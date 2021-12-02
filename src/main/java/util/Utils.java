package util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class Utils {

    public static <T> ArrayList<T> readInput(String fileName,Class<T> type) throws IOException {
        BufferedReader bufReader = new BufferedReader(new FileReader(fileName));
        ArrayList<T> listOfLines = new ArrayList<>();
        String line = bufReader.readLine();
        while (line != null) {
            if(type == String.class){
                listOfLines.add((T)line);
            }else{
                listOfLines.add((T)((Integer)Integer.parseInt(line)));
            }
            line = bufReader.readLine();
        }
        bufReader.close();
        return listOfLines;
    }
}
