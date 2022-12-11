package com.study.springboot20221peng.IocAndi;
//implements 구현

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component //beans로 등록
public class StudentServiceImpl implements StudentService{


    public void printStudentInfo(Student student) {
        System.out.println("학번 : " + student.getStudentId());
        System.out.println("이름 : "  + student.getStudentName());
    }
}
