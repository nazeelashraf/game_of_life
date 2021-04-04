package gameoflife.pojo;

import java.util.List;

public interface IGrid<T extends Object> {
    T getValueAtCoordinate(Coordinate coordinate);
    void setValueAtCoordinate(Coordinate coordinate, T object);
    void setValueAtCoordinates(List<Coordinate> coordinates, T object);
    List<Coordinate> getCoordinatesWithValue(T object);
    Integer getNumberOfRows();
    Integer getNumberOfColumns();
    void printGrid();
}
