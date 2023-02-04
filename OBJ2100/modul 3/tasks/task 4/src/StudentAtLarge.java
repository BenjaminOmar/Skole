public class StudentAtLarge extends Student {

    public StudentAtLarge(String studentId, String lastName) {
        super(studentId, lastName);
        setAnualTuition();
    }

    @Override
    public void setAnualTuition() {
        this.anualTuition = 2000;
    }
    
}
