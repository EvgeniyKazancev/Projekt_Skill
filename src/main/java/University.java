import com.google.gson.annotations.SerializedName;

import javax.xml.bind.annotation.*;
import java.io.Serializable;
import java.util.Comparator;

@XmlAccessorType(XmlAccessType.FIELD)


public class University implements Serializable {

    @XmlElement(name = "universityID")
    private String id;

    @XmlElement(name = "universityName")
    private String fullName;
    @XmlTransient
    private String shortName;
    @XmlTransient
    private int yearOfFoundation;

    @XmlElement(name = "universityProfile")
    private StudyProfile mainProfile;


    enum StudyProfile {
        MEDICINE("Медицина"),
        MATHEMATICS("Математика"),
        MECHANICS("Механика"),
        PHYSICS("Физика"),
        PSYCHOLOGY("Психология"),
        HISTORY("История"),
        LINGUISTICS("Язык");

        StudyProfile(String prof) {
        }
    }


    public University(String id, String fullName, String shortName, int yearOfFoundation, StudyProfile mainProfile) {
        this.id = id;
        this.fullName = fullName;
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

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
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

    public StudyProfile getMainProfile() {
        return mainProfile;
    }

    public void setMainProfile(StudyProfile mainProfile) {
        this.mainProfile = mainProfile;
    }

    @Override
    public String toString() {
        return "University{" +
                "id='" + id + '\'' +
                ", fullName='" + fullName + '\'' +
                ", shortName='" + shortName + '\'' +
                ", yearOfFoundation=" + yearOfFoundation +
                ", mainProfile=" + mainProfile +
                '}';
    }

}
