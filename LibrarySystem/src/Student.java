/**
 *student class for library System.
 * @author hmjaneway
 */
public class Student {
    private String firstname;
    private String lastname;
    private String major;

     /**
     *default constructor for student class.
     */
    public Student (){
        firstname = "";
        lastname = "";
        major = "";


    }
     /**
     *Overloaded constructor.
     * @param firstname is the first name of the student.
     * @param Lastname is the Last Name of the student.
     * @param Major is the major of the student.
     */
    public Student (String firstname,String lastname,String major){
        this.firstname = firstname;
        this.lastname = lastname;
        this.major = major;
    
    }
     /**
     *Returns the fist name of the student.
     * @return fistname.
     */
    public String getFirstname() {
        return firstname;
    }
    /**
     *Sets the Students first name.
     * @param Firstname new first name to be entered.
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
     /**
     *Returns the last name of the student.
     * @return lastname.
     */
    public String getLastname() {
        return lastname;
    }
    /**
     *Sets the Students Last name.
     * @param lasttname new last name to be entered.
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

     /**
     *Returns the major of the student.
     * @return major.
     */
    public String getMajor() {
        return major;
    }
    /**
     *Sets the Student's major
     * @param major new major to be entered.
     */
    public void setMajor(String major) {
        this.major = major;
    }
    
}
       