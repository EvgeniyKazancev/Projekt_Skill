public class StudentCurrentCourseComp implements StdComparator{
    @Override
    public int compare(Student student1, Student student2) {
        return Integer.compare(student1.getCurrentCourseNumber(),student2.getCurrentCourseNumber());
    }
}
