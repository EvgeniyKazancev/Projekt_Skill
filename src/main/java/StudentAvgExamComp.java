
import java.util.Collections;
import java.util.Comparator;

public class StudentAvgExamComp implements StdComparator{
    @Override
    public int compare(Student student1, Student student2) {
        return Float.compare(student2.getAvgExamScore(), student1.getAvgExamScore());
    }




}
