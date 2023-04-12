
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import java.util.function.Supplier;
import java.util.logging.*;


public class XLSXParser {
    private static final Logger logger = (Logger) Logger.getLogger(XLSXParser.class.getName());


    public List<Student> studentRead() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/resources/universityInfo.xlsx");

        logger.log(Level.INFO,"Файл считан ");




         XSSFWorkbook workbook = new XSSFWorkbook(fis);
         XSSFSheet sheet = workbook.getSheetAt(0);
         Iterator<Row> itr = sheet.iterator();
         List<Student> studentList = new ArrayList<>();
         itr.next();
         while (itr.hasNext()) {
             Row row = itr.next();
             Cell cell = row.getCell(0);
             String universityId = cell.getStringCellValue();
             cell = row.getCell(1);
             String fullName = cell.getStringCellValue();
             cell = row.getCell(2);
             int currentCourseNumber = (int) cell.getNumericCellValue();
             cell = row.getCell(3);
             float avgExamScore = (float) cell.getNumericCellValue();
             Student student = new Student(universityId, fullName, currentCourseNumber, avgExamScore);
             studentList.add(student);

         }


        fis.close();
        logger.info("Список студентов создан");
        return studentList;

    }

    public List<University> universityRead() throws IOException {

        FileInputStream fis = new FileInputStream("src/main/resources/universityInfo.xlsx");
        logger.info("Файл считан");
       // logger.log(Level.SEVERE,"Error" ,new IOException());
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(1);
        Iterator<Row> itr = sheet.iterator();
        List<University> universityList = new ArrayList<>();
        itr.next();
        while (itr.hasNext()) {
            Row row = itr.next(); // получили ряд
            Cell cell = row.getCell(0);
            String universityId = cell.getStringCellValue();
            cell = row.getCell(1);
            String fullName = cell.getStringCellValue();
            cell = row.getCell(2);
            String shortName = cell.getStringCellValue();
            cell = row.getCell(3);
            int years = (int) cell.getNumericCellValue();
            cell = row.getCell(4);
            String profil = cell.getStringCellValue();
            University university = new University(universityId, fullName, shortName, years, University.StudyProfile.valueOf(profil));
            universityList.add(university);

        }
        fis.close();
        logger.info("Список университетов создан");
        return universityList;
    }


}
