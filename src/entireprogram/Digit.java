package entireprogram;

public class Digit {

    /*  ATTRIBUTES  */
    private int value = 0;
    private int base = 10;

    /*  CONSTRUCTORS    */
    public Digit() {}

    public Digit(int value) {
        this.value = value;
    }

    public Digit(int value, int base) {
        this.value = value;
        this.base = base;
    }

    /*  PUBLIC METHODS     */

    public int getValue() {
        return this.value;
    }

    public char getValueAsChar() {
        if (this.value > 9) return Character.toUpperCase(Integer.toHexString(this.value).charAt(0));

        return Integer.toString(this.value).charAt(0);
    }

    public void setBase(int base) {
        this.base = base;
    }

    public boolean incrementValue() {
        if (this.value == (this.base-1)) {
            this.value = 0;
            return true;
        }
        else {
            this.value++;
            return false;
        }
    }
}
