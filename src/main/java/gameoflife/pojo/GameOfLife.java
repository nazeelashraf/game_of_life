package gameoflife.pojo;

public class GameOfLife implements IGameOfLife {

    private IGrid<Boolean> grid;

    public GameOfLife(IGrid grid) {
        this.grid = grid;
    }

    @Override
    public IGrid<Boolean> getNextGenerationTick() {
        IGrid<Boolean> newGrid = new Grid<Boolean>(this.grid.getNumberOfRows(), this.grid.getNumberOfColumns(), Boolean.FALSE);
        int m = newGrid.getNumberOfRows();
        int n = newGrid.getNumberOfColumns();
        for(int i=0; i < m; i++) {
            for(int j=0; j < n; j++) {
                newGrid.setValueAtCoordinate(new Coordinate(i, j), this.isAlive(m, n, i, j));
            }
        }
        return newGrid;
    }

    private boolean isAlive(int m, int n, int x, int y) {
        Coordinate coordinate = new Coordinate(x, y);
        boolean isAlive = this.grid.getValueAtCoordinate(coordinate);
        int startX = x > 0 ? x - 1 : x,
                startY = y > 0 ? y - 1 : y,
                endX = x < m-1 ? x + 1 : x,
                endY = y < n-1 ? y + 1 : y,
                count = isAlive ? -1 : 0;

        for(int i = startX; i <= endX; i++) {
            for(int j = startY; j <= endY; j++) {
                if(Boolean.TRUE.equals(this.grid.getValueAtCoordinate(new Coordinate(i, j)))) {
                    count++;
                }
            }
        }

        if(!isAlive) return count == 3;

        return (count==3 || count==2);
    }

    public void printState() {
        this.grid.printGrid();
    }

}
