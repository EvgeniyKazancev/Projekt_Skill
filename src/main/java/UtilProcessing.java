import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;
import java.util.function.*;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

public class UtilProcessing {
    public static   List<Statistics> Process(List<Student> studentList, List<University> universityList) {

        Stream<University.StudyProfile> studyProfileStream = Stream.of(University.StudyProfile.values());
        Stream<List<University>> listStream = studyProfileStream.map(studyProfile ->
                universityList.stream()
                        .filter(university -> university.getMainProfile().equals(studyProfile))
                        .toList());
        Stream<Statistics> statisticsStream = listStream.filter(universityList1 -> universityList1.size() > 0)

                .map(universityList12 -> {

                    Double avgScore = universityList12.stream()
                            .map(university -> studentList.stream()
                                    .filter(student -> student.getUniversityId().equals(university.getId()))
                                    .toList())
                            .flatMap(studentList1 -> studentList1.stream())
                            .mapToDouble(value -> value.getAvgExamScore())
                            .average()
                            .orElse(Double.NaN);
                    float avgScoreF = avgScore.isNaN() ? 0f : BigDecimal.valueOf(avgScore).setScale(2, RoundingMode.HALF_UP).floatValue();
                    long sumStd = universityList12.stream()
                            .map(university -> studentList.stream()
                                    .filter(student -> student.getUniversityId().equals(university.getId()))
                                    .toList())
                            .mapToLong(value -> value.size())
                            .sum();
                    StringBuilder stringBuilder = new StringBuilder();
                    universityList12.forEach(university -> stringBuilder.append(university.getShortName()).append(", "));

                    return new Statistics(avgScoreF, (int) sumStd, universityList12.get(0).getMainProfile(), universityList12.size(), stringBuilder.toString());
                });


        return statisticsStream.toList();
    }
}