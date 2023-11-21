
/**
 * This class emulates common paper services.
 *
 * @author Eric Perez
 */
public class PaperServices {

    private int bwPages;
    private int colorPages;

    /**
     * The default constructor with user-defined values.
     *
     * @param bwPages The amount of black and white pages to be printed.
     * @param colorPages The amount of color pages to be printed.
     */
    PaperServices(int bwPages, int colorPages) {
        this.bwPages = bwPages;
        this.colorPages = colorPages;
    }

    /**
     * Returns the cost with the based on user-defined print job.
     * @return The total cost of the user's print job.
     */
    public double paperPrinter() {
        double cost = 0;
        cost = cost + (.25 * this.bwPages);
        cost = cost + (.50 * this.colorPages);
        return cost;
    }
}
