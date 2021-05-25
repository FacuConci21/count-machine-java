package entireprogram;

public class Display {

    private final int screenBuffWidth = 50;
    private final int screenBuffHeight = 20;
    private char[] screenBuffer;

    public Display() {
        this.screenBuffer = new char[this.screenBuffWidth*this.screenBuffHeight];
        for (int i = 0; i < (this.screenBuffWidth*this.screenBuffHeight); i++) {
            this.screenBuffer[i] = ' ';
        }
    }

    public void draw() {
        for (int i = 0; i < this.screenBuffHeight ; i++) {
            for (int j = 0; j < this.screenBuffWidth; j++) {
                System.out.print(this.screenBuffer[(this.screenBuffWidth*i) + j]);
            }
            System.out.print('\n');
        }
    }
}
