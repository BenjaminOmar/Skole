public abstract class Student {
    // fields
    private String studentId;
    private String lastName;
    protected double anualTuition;

    // Constructor

    public Student(String studentId, String lastName) {
        this.studentId = studentId;
        this.lastName = lastName;
    }

    // getters and setters
    
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentId() {
        return this.studentId;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public abstract void setAnualTuition();

    public double getAnualTuition() {
        return this.anualTuition;
    }

    public void printInfo() {
        System.out.println("-------------------------------------------------------");
        System.out.println("The students ID is: " + studentId);
        System.out.println("The students last name is: " + lastName);
        System.out.println("The students anual tuition is: " + anualTuition);
        System.out.println("-------------------------------------------------------");
    }
}
