public class StudentDemo {
    public static void main(String[] args) {
        Student[] studentArray = new Student[3];

        studentArray[0] = new UndergraduateStudent("studentId", "StudentLastname1");
        studentArray[1] = new GraduateStudent("GraduateStudentId", "StudentLastName2");
        studentArray[2] = new StudentAtLarge("StudentAtLargeId", "StudentLastName3");

        for (Student a : studentArray) {
            a.printInfo();
        }

    }
}
