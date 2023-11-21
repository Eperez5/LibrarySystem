
/**
 * This class contains methods to create and manipulate a library account balance.
 *
 * @author Eric Perez
 */
public class AccountBalance {

    private double OVERDUE_FEE = 5;
    private int daysPastDue;
    private double bill;
    private double change;

    /**
     * The default constructor for and empty account.
     */
    public AccountBalance() {

    }

    /**
     * This constructs the account with an overdue book.
     * @param daysPastDue The amount of days passed since a book's due date.
     */
    public AccountBalance(int daysPastDue) {
        this.daysPastDue = daysPastDue;
    }

    /**
     * Sets the amount of days a book is overdue.
     * @param daysPastDue The amount of days a book is overdue.
     */
    public void setDaysPastDue(int daysPastDue) {
        this.daysPastDue = daysPastDue;
    }

    /**
     * Returns the amount due for an overdue book.
     * @return The amount due based on user-defined values.
     */
    public double getOverDueBookBalance() {
        bill = bill + (this.daysPastDue * OVERDUE_FEE);
        return bill;
    }

    /**
     * Accepts payment from user and returns remaining amount due.
     * @param payment The payment amount from the user.
     * @return The remaining amount due.
     */
    public double payBalance(double payment) {
        if (payment < bill) {
            bill = bill - payment;
            return bill;
        } else {
            change = payment - bill;
            return 0;
        }
    }

    /**
     * Returns change returned after user payment.
     * @return The amount of change returned to user.
     */
    public double giveChange() {
        return change;
    }
}
