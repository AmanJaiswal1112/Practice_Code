package com.prac.designPattern.structual;

import java.util.ArrayList;
import java.util.List;

public class AdapterDesignPatternClient {
    public static void main(String[] args) {
        StudentDetails studentDetails = new StudentDetails();
        System.out.println(studentDetails.getStudentDetails());
    }
}

interface Student{
    public void getName();
    public void getEmail();
}

class CollegeStudent implements Student{
    private String name;
    private String email;
    public CollegeStudent(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public void getName() {

    }

    @Override
    public void getEmail() {

    }
}

class SchoolStudent {
    private String firstname;
    private String email;
    public SchoolStudent(String firstname, String email) {
        this.firstname= firstname;
        this.email= email;
    }

    public void getFirstName() {

    }

    public void getEmail() {

    }
}

class SchoolStudentAdapter implements Student{
    private SchoolStudent schoolStudent;
    public SchoolStudentAdapter(SchoolStudent schoolStudent){
        this.schoolStudent = schoolStudent;
    }

    @Override
    public void getName() {

    }

    @Override
    public void getEmail() {

    }
}
class StudentDetails{

    public List<Student> getStudentDetails(){
        List<Student> students = new ArrayList<>();

        CollegeStudent collegeStudent= new CollegeStudent("Aman", "aman.jaiswal@gmail.com");
        SchoolStudent schoolStudent = new SchoolStudent("abhi", "abhi@gmail.com");
        students.add(collegeStudent);
        students.add(new SchoolStudentAdapter(schoolStudent));

        return students;
    }
}