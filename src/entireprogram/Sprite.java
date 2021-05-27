package entireprogram;

public class Sprite {

    /*  ATTRIBUTES  */
    private int initialCoordX = 0;
    private int initialCoordY = 0;
    private char [] map;
    private int sqrtMapLength;

    /*  CONSTRUCTORS    */
    public Sprite() {
        this.map = new char[9];
        for (int i = 0; i < 9; i++) {
            this.map[i] = 'x';
        }
        sqrtMapLength = (int) Math.sqrt(this.map.length);
    }

    public Sprite(int initialCoordX, int initialCoordY) {
        this.initialCoordX = initialCoordX;
        this.initialCoordY = initialCoordY;

        this.map = new char[9];

        for (int i = 0; i < 9; i++) {
            this.map[i] = 'x';
        }
        sqrtMapLength = (int) Math.sqrt(this.map.length);
    }

    public Sprite(char [] map) {
        this.map = new char[map.length];

        for (int i = 0; i < map.length; i++) {
            this.map[i] = 'x';
        }
        sqrtMapLength = (int) Math.sqrt(this.map.length);
    }

    public Sprite(char [] map, int initialCoordX, int initialCoordY) {
        this.initialCoordX = initialCoordX;
        this.initialCoordY = initialCoordY;

        this.map = new char[map.length];

        for (int i = 0; i < map.length; i++) {
            this.map[i] = map[i];
        }
        sqrtMapLength = (int) Math.sqrt(this.map.length);
    }

    /*  PUBLIC METHODS     */
    public int getInitialCoordX() {
        return this.initialCoordX;
    }

    public int getInitialCoordY() {
        return this.initialCoordY;
    }

    public int getSqrtMapLength() {
        return this.sqrtMapLength;
    }

    public char[] getMap() {
        return this.map;
    }

    public void insertChar(char element, int index) {
        this.map[index] = element;
    }
}
