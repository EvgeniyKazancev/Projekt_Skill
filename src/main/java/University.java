public class University {
    String id;
    String fulName;
    String shortName;
    int yearOfFoundation;
    StudyProfile mainProfile;
    enum StudyProfile {
        MEDICINE("Медицина"),
        MATHEMATICS("Математика"),
        MECHANICS("Механика"),
        PHYSICS("Физика"),
        PSYCHOLOGY("Психология"),
        HISTORY("История");
        StudyProfile(String значение) {
        }
    }
    public University(String id, String fulName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fulName = fulName;
        this.shortName = shortName;
        this.yearOfFoundation = yearOfFoundation;
        this.mainProfile = mainProfile;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFulName() {
        return fulName;
    }

    public void setFulName(String fulName) {
        this.fulName = fulName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public int getYearOfFoundation() {
        return yearOfFoundation;
    }

    public void setYearOfFoundation(int yearOfFoundation) {
        this.yearOfFoundation = yearOfFoundation;
    }

}
