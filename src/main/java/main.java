import org.apache.logging.log4j.LogManager;

import javax.imageio.IIOException;
import javax.xml.bind.JAXBException;
import javax.xml.bind.MarshalException;
import java.io.IOException;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.logging.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class main {
    private static final Logger logger = Logger.getLogger(main.class.getName());

    public static void main(String[] args) throws IOException, JAXBException {


        XLSXParser xlsxParser = new XLSXParser();


        /**  StdComparator stdComparator =                  // Второе задание
         UtilityClass.getMyStudent(EnumCompareStudent.STUDENT_AVG);
         xlsxParser.studentRead().stream()
         .sorted(stdComparator).toList()
         .forEach(System.out::println);
         UniComparator uniComparator =
         UtilityClass.getMyUniversity(EnumCompareUniversity.UNIVERSITY_YEAR);
         xlsxParser.universityRead().stream()
         .sorted(uniComparator).toList()
         .forEach(System.out::println);*/

        // Третье задание Лучшее решение
        /**    Stream<Student> studentStream = xlsxParser.studentRead().stream();
         Stream<Student> studentStream1 = xlsxParser.studentRead().stream();
         System.out.println("Итог :");
         Stream.concat(studentStream.limit(3).map(JsonUtil::serializeStudent),studentStream1.limit(3).map(JsonUtil::serializeStudent).map(JsonUtil::deserializeStudent))
         .forEach(System.out::println);
         Stream<University> universityStream = xlsxParser.universityRead().stream();
         Stream<University> universityStream1 = xlsxParser.universityRead().stream();
         System.out.println("Итог :");
         Stream.concat(universityStream.limit(3).map(JsonUtil::serializeUniversity),universityStream1.limit(3).map(JsonUtil::serializeUniversity).map(JsonUtil::deserializeUniversity))
         .forEach(System.out::println);*/
        //Мое решение((
        /**  Stream<Student> studentStream1 = xlsxParser.studentRead().stream();
         Stream<Student> studentStream2 = xlsxParser.studentRead().stream();
         Stream.concat(
         studentStream1
         .limit(3)
         .map(object -> {
         String studentSerialize;
         studentSerialize = JsonUtil.serializeStudent(object);
         return studentSerialize;
         }),
         studentStream2
         .limit(3)
         .map(object -> {
         String studentSerialize = null;
         studentSerialize = JsonUtil.serializeStudent(object);
         return studentSerialize;
         })
         .map(studentSerialize -> {
         Student newStudentList;
         newStudentList = JsonUtil.deserializeStudent(studentSerialize);
         return newStudentList;
         }))
         .forEach(System.out::println);
         Stream<University> universityStream1 = xlsxParser.universityRead().stream();
         Stream<University> universityStream2 = xlsxParser.universityRead().stream();
         Stream.concat(
         universityStream1
         .limit(3)
         .map(object -> {
         String universitySerialize;
         universitySerialize = JsonUtil.serializeUniversity(object);
         return universitySerialize;
         }),
         universityStream2
         .limit(3)
         .map(object -> {
         String universitySerialize;
         universitySerialize = JsonUtil.serializeUniversity(object);
         return universitySerialize;
         })
         .map(universitySerialize -> {
         Student newUniversityList;
         newUniversityList = JsonUtil.deserializeStudent(universitySerialize);
         return newUniversityList;
         }))
         .forEach(System.out::println);



         */

        // задние четыре


//        newStat.stream()
//                .collect(Collectors.toList());

//        XlsWriter xlsWriter = new XlsWriter();
//        xlsWriter.writeXls(newStat, "src/main/resources/statistics.xlsx");
        List<Student> studentList = xlsxParser.studentRead();
        List<University> universityList = xlsxParser.universityRead();
        List<Statistics> newStat = UtilProcessing.Process(studentList, universityList);

        ExportStructure exportStructure = new ExportStructure(universityList, studentList, newStat);

        JsonRead jsonRead = new JsonRead();
        jsonRead.jsonReader(exportStructure);

        MarshallingXml mar = new MarshallingXml();
        mar.marshalling(exportStructure);

        logger.log(Level.INFO, "Программа успешно завершена ");


        /**  String studentSerialize = JsonUtil.serializeStudentList(xlsxParser.studentRead());
         System.out.println("Student JSON:\n" + studentSerialize + "\n");
         String universitySerialize = JsonUtil.serializeUniversityList(xlsxParser.universityRead());
         System.out.println("University JSON:\n" + universitySerialize + "\n");

         List<Student> newStudent = JsonUtil.deserializeStudentList(studentSerialize);
         List<University> newUniversity;
         newUniversity = JsonUtil.deserializeUniversityList(universitySerialize);
         System.out.println(newStudent + "\n" + newUniversity);
         System.out.println(xlsxParser.studentRead().size() == newStudent.size() ? "Равны" : "Не равны");
         System.out.println(xlsxParser.universityRead().size() == newUniversity.size() ? "Равны" : "Не равны");



         }
         /** XLSXParser xlsxParser = new XLSXParser();   //Первое задание
         xlsxParser.studentRead().forEach(System.out::println);
         xlsxParser.universityRead().forEach(System.out::println);
         */
    }
}
