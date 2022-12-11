package com.study.springboot20221peng.IocAndi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class StudentController {

    @Autowired
    private StudentService studentService; //push

    @Autowired
    private Test1 t1;

    @Autowired
    private Test2 t2;


    @ResponseBody
    @GetMapping("/students")
    public String printStudent(){
        Student student = Student.builder()
                .studentId(2001)
                .studentName("김경민")
                .build();

        t1.print();
        t2.print();

        studentService.printStudentInfo(student);
        return null;
    }


}
