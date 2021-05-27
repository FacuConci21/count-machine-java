package entireprogram;

public class RectangleCell {

    /*  ATTRIBUTES  */
    private Sprite rectSprite = new Sprite();
    private Digit digit = new Digit();

    /*  PRIVATE METHODS     */
    private void updateRectSprite() {
        this.rectSprite.insertChar(this.digit.getValueAsChar(), (int)(this.rectSprite.getMap().length/2));
    }

    /*  CONSTRUCTORS    */
    public RectangleCell() {}

    public RectangleCell(int initialX, int initialY) {
        this.rectSprite = new Sprite(initialX, initialY);
        this.updateRectSprite();
    }

    public RectangleCell(char [] spriteMap) {
        this.rectSprite = new Sprite(spriteMap);
        this.updateRectSprite();
    }

    public RectangleCell(int digitValue, char [] spriteMap) {
        this.rectSprite = new Sprite(spriteMap);
        this.digit = new Digit(digitValue);
        this.updateRectSprite();
    }

    public RectangleCell(int digitValue, int digitBase, char [] spriteMap) {
        this.rectSprite = new Sprite(spriteMap);
        this.digit = new Digit(digitValue, digitBase);
        this.updateRectSprite();
    }

    public RectangleCell(char [] spriteMap, int initialX, int initialY) {
        this.rectSprite = new Sprite(spriteMap, initialX, initialY);
        this.updateRectSprite();
    }

    public RectangleCell(Digit digit) {
        this.rectSprite = new Sprite();
        this.digit = digit;
        this.updateRectSprite();
    }

    public RectangleCell(int digitValue, int digitBase, int initialX, int initialY) {
        this.rectSprite = new Sprite(initialX, initialY);
        this.digit = new Digit(digitValue, digitBase);
        this.updateRectSprite();
    }

    public RectangleCell(int digitValue, int digitBase, int initialX, int initialY, char [] spriteMap) {
        this.rectSprite = new Sprite(spriteMap, initialX, initialY);
        this.digit = new Digit(digitValue, digitBase);
        this.updateRectSprite();
    }

    /*  PUBLIC METHODS     */
    public Sprite getRectSprite() {
        return this.rectSprite;
    }


}
