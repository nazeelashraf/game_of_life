package util;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BufferedReaderSingleton {
    private static BufferedReader reader = null;

    public static BufferedReader getReader() {
        if(reader == null) {
            reader = new BufferedReader(new InputStreamReader(System.in));
        }

        return reader;
    }
}
