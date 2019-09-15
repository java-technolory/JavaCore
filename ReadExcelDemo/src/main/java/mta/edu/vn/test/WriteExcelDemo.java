package mta.edu.vn.test;

import mta.edu.vn.dao.EmployeeDAO;
import mta.edu.vn.model.Employee;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFFont;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class WriteExcelDemo {

    private static HSSFCellStyle createStyleForTitle(HSSFWorkbook workbook) {

        HSSFFont font = workbook.createFont();
        font.setBold(true);
        HSSFCellStyle style = workbook.createCellStyle();
        style.setFont(font);
        return style;
    }

    public static void main(String[] args) throws IOException {

        HSSFWorkbook workbook = new HSSFWorkbook();
        HSSFSheet sheet = workbook.createSheet("Employee sheet");

        List<Employee> list = EmployeeDAO.listEmployees();

        int rownum = 0;
        Cell cell;
        Row row;

        //
        HSSFCellStyle style = createStyleForTitle(workbook);

        row = sheet.createRow(rownum);

        // EmpNo
        cell = row.createCell(0, CellType.STRING);
        cell.setCellValue("EmpNo");
        cell.setCellStyle(style);

        // EmpName
        cell = row.createCell(1, CellType.STRING);
        cell.setCellValue("EmpName");
        cell.setCellStyle(style);

        // Salary
        cell = row.createCell(2, CellType.STRING);
        cell.setCellValue("Salary");
        cell.setCellStyle(style);

        // Grade
        cell = row.createCell(3, CellType.STRING);
        cell.setCellValue("Grade");
        cell.setCellStyle(style);

        // Bonus
        cell = row.createCell(4, CellType.STRING);
        cell.setCellValue("Bonus");
        cell.setCellStyle(style);

        // Data
        for (Employee emp : list) {
            rownum++;
            row = sheet.createRow(rownum);

            // EmpNo(A)
            cell = row.createCell(0, CellType.STRING);
            cell.setCellValue(emp.getEmpNo());

            // EmpName (B)
            cell = row.createCell(1, CellType.STRING);
            cell.setCellValue(emp.getEmpName());

            // Salary (C)
            cell = row.createCell(2, CellType.STRING);
            cell.setCellValue(emp.getSalary());

            // Grade (D)
            cell = row.createCell(3, CellType.STRING);
            cell.setCellValue(emp.getGrade());

            // Bonus (E)
            cell = row.createCell(4, CellType.STRING);
            cell.setCellValue(emp.getBonus());
        }

        File file = new File("./src/main/resources/employee.xls");
//        file.getParentFile().mkdirs();

        FileOutputStream outFile = new FileOutputStream(file);
        workbook.write(outFile);
        System.err.println("Created file: " + file.getAbsolutePath());
    }

}
