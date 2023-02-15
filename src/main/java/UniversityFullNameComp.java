import org.apache.commons.lang3.StringUtils;

public class UniversityFullNameComp implements UniComparator{
    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getFulName(),university2.getFulName());
    }
}
