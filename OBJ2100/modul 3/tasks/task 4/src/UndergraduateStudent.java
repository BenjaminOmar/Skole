public class UndergraduateStudent extends Student {

    public UndergraduateStudent(String studentId, String lastName) {
        super(studentId, lastName);
        setAnualTuition();
    }

    @Override
    public void setAnualTuition() {
        this.anualTuition = 4000;
        
    }
    
}
