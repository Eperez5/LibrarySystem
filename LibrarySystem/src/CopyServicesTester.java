
import java.util.Scanner;

public class CopyServicesTester {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value1;
        AccountBalance acc1 = new AccountBalance();
        do {
            System.out.println("Select an Option:");
            System.out.println("1. Print Service");
            System.out.println("2. Account Summary");
            System.out.println("3. Exit");
            value1 = in.next();
            switch (value1) {
                case "1":
                    System.out.println("How many bw pages?");
                    int bw = in.nextInt();
                    System.out.println("How many color pages?");
                    int color = in.nextInt();
                    PaperServices print = new PaperServices(bw, color);
                    System.out.println(print.paperPrinter());
                    break;
                case "2":
                    String value2;
                    do {
                        System.out.println("Select an Option:");
                        System.out.println("1. View Account Balance");
                        System.out.println("2. Pay Balance");
                        System.out.println("3. Back");
                        value2 = in.next();
                        switch (value2) {
                            case "1":
                                System.out.println("How many days overdue?");
                                int daysPastDue = in.nextInt();
                                acc1.setDaysPastDue(daysPastDue);
                                System.out.println("Current Balance: " +acc1.getOverDueBookBalance());
                                break;
                            case "2":
                                System.out.println("Enter Payment Amount: ");
                                double payment = in.nextInt();
                                System.out.println("Balance Remaining: " + acc1.payBalance(payment));
                                System.out.println("Change: "+ acc1.giveChange());
                                break;
                            case "3":
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                    } while (!value2.equals("3"));
                    break;
                case "3":
                    System.out.println("erp");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
            
        } while (!value1.equals("3"));
    }
}
