import org.apache.commons.lang3.StringUtils;

public class UniversityShortNameComp implements UniComparator{
    @Override
    public int compare(University university1, University university2) {
        return StringUtils.compare(university1.getShortName(),university2.getShortName());
    }
}
