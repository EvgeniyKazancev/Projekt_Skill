import org.apache.commons.lang3.StringUtils;

public class UniversityIdComp implements UniComparator{
    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getId(),university2.getId());
    }
}
