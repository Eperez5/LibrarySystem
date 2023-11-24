
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class LibrarySystemMain {

    public static void main(String[] args) {

        ArrayList<Book> books = new ArrayList<>();
        AccountBalance acc1 = new AccountBalance();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        ArrayList<Student> s1 = new ArrayList<>();
        s1.add(new Student("Joyce", "Collins", "Math"));
        s1.add(new Student("James", "Johns", "Computer Science"));
        books.add(new Book("Calculus","Isaac Newton","Textbook",true,"n/a"));

        Scanner in = new Scanner(System.in);
        String value1;
        do {
            System.out.println("Welcome to the Library Management System interface!");
            System.out.println();
            System.out.println("-----------------------------------------------------------------");
            System.out.println();
            System.out.println("Select an Option:");
            System.out.println();
            System.out.println("1. Librarian Menu");
            System.out.println("2. Student Menu");
            System.out.println("3. Exit");
            value1 = in.next();
            in.nextLine();
            System.out.println("-----------------------------------------------------------------");
            System.out.println();
            switch (value1) {
                case "1":
                    String value2;
                    do {
                        System.out.println("You have entered the Librarian Menu");
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println();
                        System.out.println("Select an Option:");
                        System.out.println();
                        System.out.println("1. Add Book");
                        System.out.println("2. Modify Book Details");
                        System.out.println("3. Remove Book");
                        System.out.println("4. View All Books");
                        System.out.println("5. Add Student");
                        System.out.println("6. Modify Student");
                        System.out.println("7. Remove Student");
                        System.out.println("8. View All Student");
                        System.out.println("9. Back");
                        value2 = in.next();
                        in.nextLine();
                        switch (value2) {
                            case "1":
                                System.out.println("What is the Book Title?");
                                String title = in.nextLine();
                                System.out.println("What is the Author's Name?");
                                String author = in.nextLine();
                                System.out.println("What is the genre?");
                                String genre = in.nextLine();
                                boolean available = true;
                                String dueDate = "";
                                books.add(new Book(title, author, genre, available, dueDate));
                                break;
                            case "2":
                                System.out.println("Update Which Book?");
                                int value3 = in.nextInt() - 1;
                                in.nextLine();
                                System.out.println("What is the Book Title?");
                                title = in.nextLine();
                                System.out.println("What is the Author's Name?");
                                author = in.nextLine();
                                System.out.println("What is the genre?");
                                genre = in.nextLine();
                                available = true;
                                dueDate = "";
                                books.set(value3, new Book(title, author, genre, available, dueDate));
                                System.out.println("Book Updated");
                                break;
                            case "3":
                                System.out.println("Remove Which Book? ");
                                books.remove(in.nextInt() - 1);
                                break;
                            case "4":
                                for (Book b : books) {
                                    System.out.println(b);
                                }
                                break;
                            case "5":
                                System.out.println("What is the student's First Name?");
                                String firstname = in.nextLine();
                                System.out.println("What is the student's Last Name?");
                                String lastname = in.nextLine();
                                System.out.println("What is the student's major?");
                                String major = in.nextLine();
                                s1.add(new Student(firstname, lastname, major));
                                break;
                            case "6":
                                System.out.println("Update Which Student?");
                                int value4 = in.nextInt() - 1;
                                in.nextLine();
                                System.out.println("What is the student's First Name?");
                                firstname = in.nextLine();
                                System.out.println("What is the Student's Last Name?");
                                lastname = in.nextLine();
                                System.out.println("What is the Student's major?");
                                major = in.nextLine();
                                s1.set(value4, new Student(firstname, lastname, major));
                                System.out.println("Student Updated");
                                break;
                            case "7":
                                System.out.println("Remove Which Student? ");
                                s1.remove(in.nextInt() - 1);
                                break;
                            case "8":
                                for (Student b : s1) {
                                    System.out.println(b);
                                }
                                break;
                            case "9":
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                    } while (!value2.equals("9"));
                    break;
                case "2":
                    String value5;
                    do {
                        System.out.println("You have entered the student's Menu");
                        System.out.println();
                        System.out.println("-----------------------------------------------------------------");
                        System.out.println();
                        System.out.println("Select an Option:");
                        System.out.println();
                        System.out.println("1. Library");
                        System.out.println("2. Paper Service");
                        System.out.println("3. Account Summary");
                        System.out.println("4. Back");
                        value5 = in.next();
                        switch (value5) {
                            case "1":
                                String value6;
                                do {
                                    System.out.println("Select an Option:");
                                    System.out.println();
                                    System.out.println("1. View All Books");
                                    System.out.println("2. Check Out Book");
                                    System.out.println("3. Back");
                                    value6 = in.next();
                                    switch (value6) {
                                        case "1":
                                            for (Book b : books) {
                                                System.out.println(b);
                                            }
                                            break;
                                        case "2":
                                            System.out.println("Which Book to Check Out:");
                                            int value7 = in.nextInt() - 1;
                                            books.get(value7).setDueDate(LocalDate.now().plusDays(10).format(dtf));
                                            books.get(value7).setAvailable(false);
                                            break;
                                        case "3":
                                            break;
                                        default:
                                            System.out.println("Invalid Option");
                                    }
                                } while (!value6.equals("3"));
                                break;

                            case "2":
                                System.out.println("You have entered the Library Printing Service:");
                                System.out.println();
                                System.out.println("-----------------------------------------------------------------");
                                System.out.println("How many bw pages?");
                                int bw = in.nextInt();
                                System.out.println("How many color pages?");
                                int color = in.nextInt();
                                PaperServices print = new PaperServices(bw, color);
                                System.out.println(print.paperPrinter());
                                break;
                            case "3":
                                String value8;
                                do {
                                    System.out.println("You have entered the Account Summary:");
                                    System.out.println();
                                    System.out.println("-----------------------------------------------------------------");
                                    System.out.println("Select an Option:");
                                    System.out.println("1. View Account Balance");
                                    System.out.println("2. Pay Balance");
                                    System.out.println("3. Back");
                                    value8 = in.next();
                                    switch (value8) {
                                        case "1":
                                            System.out.println("How many days overdue?");
                                            int daysPastDue = in.nextInt();
                                            acc1.setDaysPastDue(daysPastDue);
                                            System.out.println("Current Balance: " + acc1.getOverDueBookBalance());
                                            break;
                                        case "2":
                                            System.out.println("Enter Payment Amount: ");
                                            double payment = in.nextInt();
                                            System.out.println("Balance Remaining: " + acc1.payBalance(payment));
                                            System.out.println("Change: " + acc1.giveChange());
                                            break;
                                        case "3":
                                            break;
                                        default:
                                            System.out.println("Invalid Option");
                                    }
                                } while (!value8.equals("3"));
                                break;
                            case "4":
                                break;
                            default:
                                System.out.println("Invalid Option");
                        }
                    } while (!value5.equals("4"));
                    break;
                case "3":
                    System.out.println("Good-Bye");
                    break;
                default:
                    System.out.println("Invalid Option");
            }
        } while (!value1.equals("3"));
    }
}
