package gameoflife.pojo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Grid<T extends Object> implements IGrid {

    private List<List<T>> grid;
    private Integer rows;
    private Integer columns;

    public Grid(int rows, int columns, T defaultValue) {
        this.rows = rows;
        this.columns = columns;
        this.grid = new ArrayList<>(rows);
        for(int i = 0; i < rows; i++) {
            this.grid.add(new ArrayList<>(Collections.nCopies(columns, defaultValue)));
        }
    }

    @Override
    public T getValueAtCoordinate(Coordinate coordinate) {
        return this.grid.get(coordinate.getX()).get(coordinate.getY());
    }

    @Override
    public void setValueAtCoordinate(Coordinate coordinate, Object object) {
        this.grid.get(coordinate.getX()).set(coordinate.getY(), (T) object);
    }

    @Override
    public List<Coordinate> getCoordinatesWithValue(Object object) {
        List<Coordinate> coordinates = new ArrayList<>();
        for(int i=0; i < this.rows; i++) {
            for(int j=0; j < this.columns; j++) {
                Coordinate coordinate = new Coordinate(i, j);
                Boolean valueAtCoordinate = (Boolean) this.getValueAtCoordinate(coordinate);
                if(object.equals(valueAtCoordinate)) {
                   coordinates.add(coordinate);
                }
            }
        }
        return coordinates;
    }

    @Override
    public void setValueAtCoordinates(List coordinates, Object object) {
        for(Coordinate coordinate: (List<Coordinate>) coordinates) {
            this.setValueAtCoordinate(coordinate, object);
        }
    }

    @Override
    public Integer getNumberOfRows() {
        return rows;
    }

    @Override
    public Integer getNumberOfColumns() {
        return columns;
    }

    @Override
    public void printGrid() {
        for(List<T> row: this.grid) {
            for (T obj: row) {
                System.out.print((Boolean.TRUE.equals(obj)?'X':' ')+" ");
            }
            System.out.println();
        }

        System.out.println();
    }
}
