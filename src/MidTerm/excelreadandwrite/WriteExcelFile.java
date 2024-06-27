package MidTerm.excelreadandwrite;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class WriteExcelFile {
    // Absolute Path
    //public static String filePath = "D:/SOFTWARE ENGINEERING/PROJECTS/IdeaProjects/PNT/LearnJava_QE_Summer2020/DataTest/QE_WINTER2022.xlsx";
    // Relative Path
    public static String filePath = "../LearnJava_QE_Summer2020/DataTest/QE_WINTER2022.xlsx";

    public static void main(String[] args) {
        Object [][]  stDetails = {};
        Object [][] stInfo = {
                {"Sl","firstName","lastName","Address"},
                {"101","Junaid","Khalid","Manhattan,NY"},
                {"102","Jack","Cohen","Bronx,NY"},
                {"103","James","William","Queens,NY"},
                {"104","Akbar","Muneer","LongIsland,NY"},
                {"105","Mohammed","Hashem","Jamaica,NY"}
        };

        WriteExcelFile.writeExcel(filePath,"stInformation",stInfo);

    }

    public static void writeExcel(String filePath, String sheetName, Object [][] data){
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet(sheetName);
        int rowNum = 0;
        System.out.println("Excel File Created");
        for (Object [] dt : data){
            Row row= sheet.createRow(rowNum++);
            int colNum =0;
            for (Object field : dt){
                Cell cell =row.createCell(colNum++);
                if (field instanceof String){
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer){
                    cell.setCellValue((Integer)field);
                }
            }
        }
        try{
            FileOutputStream out = new FileOutputStream(filePath);
            workbook.write(out);
            workbook.close();
        } catch (FileNotFoundException fn){
            System.out.println("File not found Exception");
        } catch (IOException e) {
            System.out.println("Done");
        }


    }






}
