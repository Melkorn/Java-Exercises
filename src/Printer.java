public class Printer {
    private int tonerLevel = 100;
    private int pagesPrinted = 0;
    private boolean duplexPrinter = true;

    public Printer(int tonerLevel, int pagesPrinted, boolean duplexPrinter) {
        if(tonerLevel >= 0 && tonerLevel <=100)this.tonerLevel = tonerLevel;

        if(pagesPrinted >= 0)this.pagesPrinted = pagesPrinted;
        this.duplexPrinter = duplexPrinter;
    }

    public int getTonerLevel() {
        return this.tonerLevel;
    }

    public int getPagesPrinted() {
        return this.pagesPrinted;
    }

    public boolean isDuplexPrinter() {
        return this.duplexPrinter;
    }

    public void fillTheToner(){
        if(this.tonerLevel < 100) this.tonerLevel = 100;
        else System.out.println("Toner if full");
    }

    public void printPage(int pages){
        if(pages > 0) {
            if(this.duplexPrinter == false) {
                this.pagesPrinted = +pages;
                this.tonerLevel = pages/2;
                System.out.println(pages + " new pages printed");
            }
            else {
                this.pagesPrinted = this.pagesPrinted + pages/2;
                this.tonerLevel = this.tonerLevel - pages/2;
                System.out.println(pages/2 + " new pages printed");
            }
        }
        else System.out.println("nothing to print");

    }
}


// Create a class and demonstate proper encapsulation techniques
// the class will be called Printer
// It will simulate a real Computer Printer
// It should have fields for the toner Level, number of pages printed, and
// also whether its a duplex printer (capable of printing on both sides of the paper).
// Add methods to fill up the toner (up to a maximum of 100%), another method to
// simulate printing a page (which should increase the number of pages printed).
// Decide on the scope, whether to use constructors, and anything else you think is needed.