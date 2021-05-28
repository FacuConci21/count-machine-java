package entireprogram;

import com.sun.deploy.uitoolkit.ui.ConsoleWindow;

import java.io.Console;

public class CountMachine {

    public CountMachine() {}

    public static int mainLoopProgram() {

        /*  LOCALS     */
        char [] cellsShape = {'+', '-', '+', '|', ' ', '|', '+', '-', '+'};
        boolean rectsCellsCollectionFilled = false;
        Display screenDisplay = new Display();
        RectangleCell [] rectangleCellsCollection = new RectangleCell[8];

        /*  INITIALIZATIONS     */
        //rectangleCellsCollection[0] = new RectangleCell(cellsShape, 4, 4);
        rectangleCellsCollection[0] = new RectangleCell(0,10,4,4, cellsShape);

        /*  FIRST EXECUTION     */
        screenDisplay.addSprite(rectangleCellsCollection[0].getRectSprite());
        screenDisplay.writeConsoleOutput();

        /*  MAIN LOOP       */
        while (!rectsCellsCollectionFilled) {

            rectsCellsCollectionFilled = rectangleCellsCollection[0].incrementDigitValue();

            screenDisplay.addSprite(rectangleCellsCollection[0].getRectSprite());

            /*  DISPLAY     */
            screenDisplay.clearScreenConsole();
            screenDisplay.writeConsoleOutput();

        }

        return 0;
    }
}
