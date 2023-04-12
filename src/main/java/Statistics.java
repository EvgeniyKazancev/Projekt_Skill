import javax.xml.bind.annotation.*;
import java.beans.Transient;
import java.io.Serializable;
import java.util.List;
@XmlAccessorType(XmlAccessType.FIELD)
public class Statistics implements Serializable {

    @XmlElement(name = "averageScore")
    private float averScoreExam ;
    @XmlTransient
    private int numberOfStudByProfile;

    @XmlElement(name = "universityProfile")
    private University.StudyProfile trainingProfNum;
    @XmlTransient
    private int numberOfUniversityProf;
    @XmlTransient
    private String nameUniversity;

    public Statistics(float averScoreExam, int numberOfStudByProfile, University.StudyProfile trainingProfNum, int numberOfUniversityProf, String nameUniversity) {
        this.averScoreExam = averScoreExam;
        this.numberOfStudByProfile = numberOfStudByProfile;
        this.trainingProfNum = trainingProfNum;
        this.numberOfUniversityProf = numberOfUniversityProf;
        this.nameUniversity = nameUniversity;
    }

    public float getAverScoreExam() {
        return averScoreExam;
    }

    public void setAverScoreExam(float averScoreExam) {
        this.averScoreExam = averScoreExam;
    }

    public int getNumberOfStudByProfile() {
        return numberOfStudByProfile;
    }

    public void setNumberOfStudByProfile(int numberOfStudByProfile) {
        this.numberOfStudByProfile = numberOfStudByProfile;
    }

    public University.StudyProfile getTrainingProfNum() {
        return trainingProfNum;
    }

    public void setTrainingProfNum(University.StudyProfile trainingProfNum) {
        this.trainingProfNum = trainingProfNum;
    }

    public void setNameUniversity(String nameUniversity) {
        this.nameUniversity = nameUniversity;
    }



    public int getNumberOfUniversityProf() {
        return numberOfUniversityProf;
    }

    public void setNumberOfUniversityProf(int numberOfUniversityProf) {
        this.numberOfUniversityProf = numberOfUniversityProf;
    }

    public String getNameUniversity() {
        return nameUniversity;
    }
}
