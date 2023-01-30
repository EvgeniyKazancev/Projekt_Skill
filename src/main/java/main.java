public class main {
    public static void main(String[] args) {

        University university =new University( "1","Ural Politech University","UPI",1930, University.StudyProfile.MEDICINE);
        Student student = new Student( "Evgeniy","1",2,4);
        System.out.println(university);
        System.out.println(student);
    }
}
