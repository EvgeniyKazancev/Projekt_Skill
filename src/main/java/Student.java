import com.google.gson.annotations.SerializedName;

public class Student  {
    @SerializedName("Id")
   private String universityId;
    @SerializedName("Имя")
   private String fullName;
    @SerializedName("Курс")
   private int currentCourseNumber;
    @SerializedName("Средни балл")
   private float avgExamScore;

    public Student(String universityId, String fullName, int currentCourseNumber, float avgExamScore) {
        this.universityId = universityId;
        this.fullName = fullName;
        this.currentCourseNumber = currentCourseNumber;
        this.avgExamScore = avgExamScore;
    }

    public String getUniversityId() {
        return universityId;
    }

    public void setUniversityId(String universityId) {
        this.universityId = universityId;
    }
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }


    public int getCurrentCourseNumber() {
        return currentCourseNumber;
    }

    public void setCurrentCourseNumber(int currentCourseNumber) {
        this.currentCourseNumber = currentCourseNumber;
    }

    public float getAvgExamScore() {
        return avgExamScore;
    }

    public void setAvgExamScore(float avgExamScore) {
        this.avgExamScore = avgExamScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "fullName='" + fullName + '\'' +
                ", universityId='" + universityId + '\'' +
                ", currentCourseNumber=" + currentCourseNumber +
                ", avgExamScore=" + avgExamScore +
                '}';
    }



}
