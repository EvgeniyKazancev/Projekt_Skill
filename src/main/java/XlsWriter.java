import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.SheetBuilder;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class XlsWriter {


    public void writeXls(List<Statistics> stat, String fileName) throws IOException {
        try
                (Workbook wb = new XSSFWorkbook()) {


            Sheet sheet = wb.createSheet("Statistics");


            CellStyle headerStyle = wb.createCellStyle();
            Font font = wb.createFont();
            font.setBold(true);
            font.setFontHeightInPoints((short) 14);
            headerStyle.setFont(font);

            Row headerRow = sheet.createRow(0);

            headerRow.createCell(0).setCellValue("������� ����");
            headerRow.getCell(0).setCellStyle(headerStyle);
            headerRow.createCell(1).setCellValue("���������� ��������� �� �������");
            headerRow.getCell(1).setCellStyle(headerStyle);
            headerRow.createCell(2).setCellValue("������� ��������");
            headerRow.getCell(2).setCellStyle(headerStyle);
            headerRow.createCell(3).setCellValue("���������� ������������� �� �������");
            headerRow.getCell(3).setCellStyle(headerStyle);
            headerRow.createCell(4).setCellValue("�������� �������������");
            headerRow.getCell(4).setCellStyle(headerStyle);

            int rowNum = 1;


            for (Statistics statistics : stat) {

                Row row = sheet.createRow(rowNum++);
                row.createCell(0).setCellValue(statistics.getAverScoreExam());
                row.createCell(1).setCellValue(statistics.getNumberOfStudByProfile());
                row.createCell(2).setCellValue(statistics.getTrainingProfNum().toString());
                row.createCell(3).setCellValue(statistics.getNumberOfUniversityProf());
                row.createCell(4).setCellValue(statistics.getNameUniversity());
            }

            //�������� � ������ �����
            try
                    (FileOutputStream fos = new FileOutputStream(fileName)) {
                wb.write(fos);


            }
        }
    }
}