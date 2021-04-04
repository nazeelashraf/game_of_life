package util;

public enum ETestCaseFile {

    gameOfLifeInput1("GameOfLife_Input1.txt"),
    gameOfLifeInput2("GameOfLife_Input2.txt"),
    gameOfLifeInput3("GameOfLife_Input3.txt"),
    gameOfLifeInput4("GameOfLife_Input4.txt"),

    gameOfLifeOutput1("GameOfLife_Output1.txt"),
    gameOfLifeOutput2("GameOfLife_Output2.txt"),
    gameOfLifeOutput3("GameOfLife_Output3.txt"),
    gameOfLifeOutput4("GameOfLife_Output4.txt")
    ;

    private final String fileName;

    ETestCaseFile(final String fileName) {
        this.fileName = fileName;
    }

    @Override
    public String toString() {
        return fileName;
    }
}
