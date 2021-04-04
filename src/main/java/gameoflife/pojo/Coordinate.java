package gameoflife.pojo;

import gameoflife.GameOfLifeConstants;

import java.util.Objects;

public class Coordinate implements ICoordinate {
    private Integer x;
    private Integer y;

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public int getX() {
        return this.x;
    }

    @Override
    public int getY() {
        return this.y;
    }

    @Override
    public void add(int val) {
        this.x += val;
        this.y += val;
    }

    @Override
    public String toString() {
        return String.join(GameOfLifeConstants.SPLIT_PARAM, x.toString(), y.toString());
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coordinate that = (Coordinate) o;
        return Objects.equals(x, that.x) && Objects.equals(y, that.y);
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y);
    }
}
