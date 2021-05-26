package entireprogram;

public class CountMachine {

    public CountMachine() {}

    public static int mainLoopProgram() {

        /*  LOCALS     */
        char [] cellsShape = {'+', '-', '+', '|', ' ', '|', '+', '-', '+'};
        Display screenDisplay = new Display();
        RectangleCell [] rectangleCellsCollection = new RectangleCell[1];
        Digit digit = new Digit(10);


        /*  INITIALIZATIONS     */
        rectangleCellsCollection[0] = new RectangleCell(cellsShape, 4, 4);


        /*  DISPLAY     */
        screenDisplay.addSprite(rectangleCellsCollection[0].getRectSprite());

        screenDisplay.writeConsoleOutput();

        return 0;
    }
}
