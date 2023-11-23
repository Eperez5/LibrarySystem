public class StudentTester {
    public static void main(String[] args) {
        Student s1 = new Student ();
        s1.setFirstname("John");
        s1.setLastname("Parker");
        s1.setMajor("Math");
        
        System.out.println("FirstName: " + s1.getFirstname());
        System.out.println("LastName: " + s1.getLastname());
        System.out.println("Major: " + s1.getMajor());   

        System.out.println("");

        Student s2 = new Student("Mary", "Ivers", "Computer Science");
        System.out.println("FirstName: " + s2.getFirstname());
        System.out.println("LastName: " + s2.getLastname());
        System.out.println("Major: " + s2.getMajor());   

    }
}
