package mta.edu.vn.annotations;

import java.util.Date;

public class Student {
    @ExcelColumn(index = 1, title = "#", description = "Student's id")
    private Long id;

    @ExcelColumn(index = 2, title = "#", description = "Ten")
    private String name;

    @ExcelColumn(index = 3, title = "#", description = "Tuoi")
    private int age;

    @ExcelColumn(index = 4, title = "#", description = "Ngay Sinh")
    private Date birthday;
}
