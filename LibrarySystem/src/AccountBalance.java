
public class AccountBalance {
    double OVERDUE_FEE = 5;
    int daysPastDue;
    double bill;
    
    public AccountBalance(int daysPastDue){
        this.daysPastDue = daysPastDue;
    }
    
    public double getBalance(){
    bill = this.daysPastDue * OVERDUE_FEE;
    return bill;
    }
}
