
import java.util.Scanner;

public class CopyServicesTester {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String value;
        do {
            System.out.println("Select an Option:");
            System.out.println("1. Print Service");
            System.out.println("2. Account Summary");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            value = in.next();
            switch (value) {
                case "1":
                    System.out.println("How many bw pages?");
                    int bw = in.nextInt();
                    System.out.println("How many color pages?");
                    int color = in.nextInt();
                    CopyServices print = new CopyServices(bw, color);
                    System.out.println(print.paperPrinter());
                    break;
                case "2":
                    System.out.println("Account Summary:");
                    break;
                case "3":
                    System.out.println("Contact Deleted");
                    break;
                case "4":
                    System.out.println("Good Bye");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (!value.equals("4"));
    }

}