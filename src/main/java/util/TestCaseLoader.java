package util;

import java.io.*;

public class TestCaseLoader {



    public static final BufferedReader getInputBufferForFile(String fileName) {
        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(
                    TestCaseLoader.class.getClassLoader().getResourceAsStream(fileName))
            );

        } catch (SecurityException e) {
            e.printStackTrace();
        }

        return bufferedReader;
    }
}
