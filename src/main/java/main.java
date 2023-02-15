import java.io.IOException;
import java.util.stream.Collectors;

public class main {


    public static void main(String[] args) throws IOException {
        XLSXParser xlsxParser = new XLSXParser();
        StdComparator stdComparator =
                UtilityClass.getMyStudent(EnumCompareStudent.STUDENT_AVG);
        xlsxParser.studentRead().stream()
                .sorted(stdComparator)
                .collect(Collectors.toList())
                .forEach(System.out::println);
        UniComparator uniComparator =
                UtilityClass.getMyUniversity(EnumCompareUniversity.UNIVERSITY_YEAR);
        xlsxParser.universityRead().stream()
                .sorted(uniComparator)
                .collect(Collectors.toList())
                .forEach(System.out::println);


    }
    /** XLSXParser xlsxParser = new XLSXParser();
     xlsxParser.studentRead().forEach(System.out::println);
     xlsxParser.universityRead().forEach(System.out::println);
     */

}
