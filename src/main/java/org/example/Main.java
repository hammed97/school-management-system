package org.example;

import org.example.school.entities.Applicants;
import org.example.school.entities.Courses;
import org.example.school.serviceImpl.SchoolServiceImpl;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Percentage marks");
        int percentage = scanner.nextInt();

        SchoolServiceImpl schoolService = new SchoolServiceImpl();
        System.out.println(schoolService.expelStudent(percentage));
        Applicants applicants = new Applicants();
        applicants.setAge(14);
        schoolService.admitApplicant(applicants);
        Courses courses = new Courses();
       schoolService.coursesTeacherTaught(courses);
       schoolService.coursesStudentTakes(courses);


    }
}