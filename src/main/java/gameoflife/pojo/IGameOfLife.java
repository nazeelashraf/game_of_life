package gameoflife.pojo;

public interface IGameOfLife {
    IGrid<Boolean> getNextGenerationTick();
}
