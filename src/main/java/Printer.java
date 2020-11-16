public class Printer {

    private int sheetsLeft;

    public Printer (int sheetsLeft) {
        this.sheetsLeft = sheetsLeft;
    }

    public int getSheetsLeft() {
        return sheetsLeft;
    }

    public void print(int pages, int copies) {
        int sheetsNeeded = pages * copies;
        if (sheetsNeeded <= this.sheetsLeft) {
           this.sheetsLeft -= sheetsNeeded;
        }
    }

}
