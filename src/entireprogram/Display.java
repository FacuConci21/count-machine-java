package entireprogram;

public class Display {

    /*  ATTRIBUTES  */
    private final int screenBuffWidth = 50;
    private final int screenBuffHeight = 20;
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

    public void writeConsoleOutput() {
        for (int i = 0; i < this.screenBuffHeight ; i++) {
            for (int j = 0; j < this.screenBuffWidth; j++) {
                System.out.print(this.screenBuffer[(this.screenBuffWidth*i) + j]);
            }
            System.out.print('\n');
        }
    }


}
