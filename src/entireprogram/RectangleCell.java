package entireprogram;

public class RectangleCell {

    /*  ATTRIBUTES  */
    private Sprite rectSprite;

    /*  CONSTRUCTORS    */
    public RectangleCell() {
        this.rectSprite = new Sprite();
    }

    public RectangleCell(int initialX, int initialY) {
        this.rectSprite = new Sprite(initialX, initialY);
    }

    public RectangleCell(char [] spriteMap) {
        this.rectSprite = new Sprite(spriteMap);
    }

    public RectangleCell(char [] spriteMap, int initialX, int initialY) {
        this.rectSprite = new Sprite(spriteMap, initialX, initialY);
    }

    /*  PUBLIC METHODS     */
    public Sprite getRectSprite() {
        return this.rectSprite;
    }
}
