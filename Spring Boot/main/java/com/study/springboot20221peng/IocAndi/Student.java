package com.study.springboot20221peng.IocAndi;

import lombok.Builder;
import lombok.Data;



@Builder
@Data
public class Student implements StudentService{
    private int studentId;
    private String studentName;



    @Override
    public void printStudentInfo(Student student) {
        System.out.println("학번 : " + student.studentId);
        System.out.println("이름 : " + student.studentName);
    }


}
