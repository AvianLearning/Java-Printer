public class Printer {

    private int sheetsLeft;
    private int tonerVolume;

    public Printer (int sheetsLeft, int tonerVolume) {
        this.sheetsLeft = sheetsLeft;
        this.tonerVolume = tonerVolume;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public int getTonerVolume() {
        return tonerVolume;
    }

    public void print(int pages, int copies) {
        int sheetsNeeded = pages * copies;
        if (sheetsNeeded <= this.sheetsLeft && this.tonerVolume >= sheetsNeeded) {
           this.sheetsLeft -= sheetsNeeded;
           this.tonerVolume -= sheetsNeeded;
        }
    }

}
