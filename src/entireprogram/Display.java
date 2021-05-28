package entireprogram;

import java.io.IOException;

public class Display {

    /*  ATTRIBUTES  */
    private final int screenBuffWidth = 50;
    private final int screenBuffHeight = 10;
    private final char[] screenBuffer;

    /*  CONSTRUCTORS    */
    public Display() {
        this.screenBuffer = new char[this.screenBuffWidth*this.screenBuffHeight];
        for (int i = 0; i < (this.screenBuffWidth*this.screenBuffHeight); i++) {
            this.screenBuffer[i] = ' ';
        }
    }

    /*  PUBLIC STATICS METHODS     */
    public static void addSpriteSuccessive(Sprite [] spritesList, Display outerScreenDisplay) {
        for (int i = 0; i < spritesList.length; i++) {
            outerScreenDisplay.addSprite(spritesList[i]);
        }
    }

    /*  PUBLIC METHODS     */
    public void addSprite(Sprite sprite) {
        int     spriteInitialX = sprite.getInitialCoordX(),
                spriteInitialY = sprite.getInitialCoordY(),
                spriteIndex = 0,
                spriteBeginIndex;

        for (int i = 0; i < sprite.getSqrtMapLength() ; i++) {

            spriteBeginIndex = (this.screenBuffWidth*(spriteInitialY+i)) + spriteInitialX;

            for (int j = 0; j < sprite.getSqrtMapLength(); j++) {
                this.screenBuffer[spriteBeginIndex + j] = sprite.getMap()[spriteIndex];
                spriteIndex++;
            }
        }
    }

    public void clearScreenConsole()  {

        /* ESTE FUE MI ULTIMO INTENTO
            System.out.print("\033[H\033[2J");
            System.out.flush();
        */

        /* ESTE FUE MI SEGUNDO INTENTO
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            Nota: con este metodo hay que controlar la excepcion que tira start().
        */

        /*  ESTE FUE MI PRIMER INTENTO.
        ProcessBuilder clearScreenProcess = new ProcessBuilder();
            clearScreenProcess.command("cmd.exe", "/c","cls");
            clearScreenProcess.inheritIO();
            clearScreenProcess.start();
            clearScreenProcess.wait();
        try {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        */
    }
    public void writeConsoleOutput() {
        for (int i = 0; i < this.screenBuffHeight ; i++) {
            for (int j = 0; j < this.screenBuffWidth; j++) {
                System.out.print(this.screenBuffer[(this.screenBuffWidth*i) + j]);
            }
            System.out.print('\n');
        }
    }


}
