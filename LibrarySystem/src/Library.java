public class Library {
    double BookName;
    double DueDate;
    double LocalDate;
    public Library(double BookName, double DueDate, double LocalDate){
        this.BookName = BookName;
        this.DueDate = DueDate;
        this.LocalDate = LocalDate;
    }
    public void CheckIn(){
        DueDate = LocalDate;
    }
//    if(DueDate.isAfter(LocalDate)){
//        double penilty = 2;
//        System.out.println("Book Name: ");
//        System.out.println("Book check out: ");
//        System.out.println("Book Returned: ");
//        System.out.println("Days Late: ");
//        System.out.println("Penity Fee: ");
//        else{
//                System.out.println("Book Name: ");
//                System.out.println("Book Check out: ");
//                System.out.println("Book Returned");
//                System.out.println("Thank you for returning");
//                }
//    }
    public void CheckOut(){
        System.out.println("Book checked out, due date: ");
    }
}
