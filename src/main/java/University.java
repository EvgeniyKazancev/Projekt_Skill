import com.google.gson.annotations.SerializedName;

import java.util.Comparator;

public class University   {
    @SerializedName("ID")
  private String id;
    @SerializedName("��������")
   private String fullName;
    @SerializedName("�������� ��������")
    private String shortName;
    @SerializedName("���")
   private int yearOfFoundation;
    @SerializedName("���������")
    private StudyProfile mainProfile;



    enum StudyProfile {
        MEDICINE("��������"),
        MATHEMATICS("����������"),
        MECHANICS("��������"),
        PHYSICS("������"),
        PSYCHOLOGY("����������"),
        HISTORY("�������"),
        LINGUISTICS ("����");
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

    public String getFulName() {
        return fullName;
    }

    public void setFulName(String fulName) {
        this.fullName = fulName;
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
