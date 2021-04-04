package gameoflife;

import gameoflife.pojo.Coordinate;
import util.ETestCaseFile;
import util.FileLoader;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameOfLifeTestHelper {

    public List<Coordinate> getCoordinateFromInputStream(ETestCaseFile file) throws IOException, NumberFormatException {
        BufferedReader reader = FileLoader.getInputBufferForFile(file.toString());
        List<Coordinate> coordinates = new ArrayList<>();

        String line;

        while((line = reader.readLine()) != null){
            String[] lineSplit = line.split(GameOfLifeConstants.SPLIT_PARAM);
            coordinates.add(new Coordinate(Integer.parseInt(lineSplit[0]), Integer.parseInt(lineSplit[1])));
        }

        return coordinates;
    }

}
