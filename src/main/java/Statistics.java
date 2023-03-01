import java.util.Collections;
import java.util.List;

public class Statistics {
    private float averScoreExam ;
    private int numberOfStudByProfile;
    private University.StudyProfile trainingProfNum;
    private int numberOfUniversityProf;
    private List<String> nameUniversity;

    public Statistics(float averScoreExam, int numberOfStudByProfile, University.StudyProfile trainingProfNum, int numberOfUniversityProf, List<String> nameUniversity) {
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

    public void setNameUniversity(List<String> nameUniversity) {
        this.nameUniversity = nameUniversity;
    }



    public int getNumberOfUniversityProf() {
        return numberOfUniversityProf;
    }

    public void setNumberOfUniversityProf(int numberOfUniversityProf) {
        this.numberOfUniversityProf = numberOfUniversityProf;
    }

    public List<String> getNameUniversity() {
        return nameUniversity;
    }
}
