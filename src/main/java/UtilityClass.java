public class UtilityClass {
private UtilityClass(){
    }
    public static StdComparator getMyStudent(EnumCompareStudent enumCompareStudent){
        switch (enumCompareStudent){
            case STUDENT_ID :
                return new StudentIdComp();
            case STUDENT_FULL_NAME:
                return  new StudentFullNameComp();
            case STUDENT_CURRENT_COURSE:
                return  new StudentCurrentCourseComp();
            case STUDENT_AVG:
                return  new StudentAvgExamComp();
            default:
                return new StudentFullNameComp();
        }
    }
    public static UniComparator getMyUniversity(EnumCompareUniversity enumCompareUniversity){
       switch (enumCompareUniversity){
           case UNIVERSITY_ID :
               return new UniversityIdComp();
           case UNIVERSITY_FULL_NAME:
               return  new UniversityFullNameComp();
           case UNIVERSITY_SHORT_NAME:
               return new UniversityShortNameComp();
           case UNIVERSITY_YEAR:
               return new UniversityYearComp();
           default:
               return new UniversityFullNameComp();
       }

    }
}
