public class UniversityYearComp implements UniComparator{
    @Override
    public int compare(University university1, University university2) {
        return Integer.compare(university1.getYearOfFoundation(),university2.getYearOfFoundation());
    }
}
