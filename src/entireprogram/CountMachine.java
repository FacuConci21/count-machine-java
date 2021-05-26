package entireprogram;

public class CountMachine {

    public CountMachine() {}

    public static int mainLoopProgram() {

        Sprite mySprite = new Sprite(10, 5);

        Sprite[] spritesList = {
                new Sprite(10, 5),
                new Sprite(20, 16),
                new Sprite(34, 2),
        };

        Display screenDisplay = new Display();

        //screenDisplay.addSprite(mySprite);
        Display.addSpriteSuccessive(spritesList, screenDisplay);

        screenDisplay.writeConsoleOutput();

        return 0;
    }
}
