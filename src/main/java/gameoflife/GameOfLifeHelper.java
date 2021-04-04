package gameoflife;

import gameoflife.pojo.Coordinate;
import util.BufferedReaderSingleton;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GameOfLifeHelper {

    public List<Coordinate> getCoordinateFromInputStream() throws IOException, NumberFormatException {
        BufferedReader reader = BufferedReaderSingleton.getReader();
        System.out.print("Enter the number of alive cells: ");

        Integer aliveCells = Integer.parseInt(reader.readLine());
        List<Coordinate> coordinates = new ArrayList<>();

        for(int i=0; i<aliveCells; i++) {
            System.out.printf("Enter the coordinates for cell %d: ", i+1);
            String[] line = reader.readLine().split(GameOfLifeConstants.SPLIT_PARAM);
            coordinates.add(new Coordinate(Integer.parseInt(line[0]), Integer.parseInt(line[1])));
        }

        return coordinates;
    }

}
