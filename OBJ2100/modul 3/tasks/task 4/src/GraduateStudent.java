public class GraduateStudent extends Student {

    public GraduateStudent(String studentId, String lastName) {
        super(studentId, lastName);
        setAnualTuition();
    }

    @Override
    public void setAnualTuition() {
        this.anualTuition = 6000;
        
    }
    
}
