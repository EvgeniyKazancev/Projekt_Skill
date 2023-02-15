import org.apache.commons.lang3.StringUtils;

public class StudentFullNameComp implements StdComparator{
    @Override
    public int compare(Student student1, Student student2) {
        return StringUtils.compare(student1.getFullName(),student2.getFullName());
    }
}
