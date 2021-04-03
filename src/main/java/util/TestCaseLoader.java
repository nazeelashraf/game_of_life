package util;

import java.io.*;

public class TestCaseLoader {

    public static final BufferedReader getInputBufferForFile(String fileName) throws FileNotFoundException {
        BufferedReader bufferedReader = null;
        File file = new File(fileName);

        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file)));
        }
        catch (FileNotFoundException e) {

            try {
                bufferedReader = new BufferedReader(new InputStreamReader(
                        TestCaseLoader.class.getClassLoader().getResourceAsStream(fileName))
                );

                if(bufferedReader == null) {
                    System.out.println("The file '"+fileName+"' could not be found.");
                    throw e;
                }
            } catch (SecurityException ex) {
                System.out.println("The file '"+fileName+"' could not be found.");
                throw ex;
            }
        }


        return bufferedReader;
    }
}
