
import java.util.Scanner;

public class CopyServicesTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value1;
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
                    CopyServices print = new CopyServices(bw, color);
                    System.out.println(print.paperPrinter());
                    break;
                case "2":
                    String value2;
                    do {
                        System.out.println("Select an Option:");
                        System.out.println("1. View Account Balance");
                        System.out.println("2. Pay Balance");
                        System.out.println("3. Exit");
                        value2 = in.next();
                        switch (value2) {
                            case "1":
                                System.out.println("How many days overdue?");
                                int daysPastDue = in.nextInt();
                                AccountBalance acc1 = new AccountBalance(daysPastDue);
                                System.out.println(acc1.getBalance());
                                break;
                            case "2":
                                System.out.println("Bill Paid");
                                break;
                            case "3":
                                System.out.println("Good Bye");
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                    } while (!value2.equals("3"));
                case "3":
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Invalid Option");
            }

        } while (!value1.equals("3"));
    }
}
