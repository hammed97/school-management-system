package org.example.school.entities;

import org.example.school.enums.Gender;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Students extends User{
    public static List<Students> studentsList = new ArrayList<>();
    private int studentId;
    private long guardianPhoneNumber;
    private LocalDate yearOfAdmission;
    private String courseDescription;
    private String courseUnit;

    public Students() {
    }

    public Students(String firstName, String lastName, int age, String address, BigDecimal DOB, String email, long phoneNumber, Gender gender, String nextOfKin) {
        super(firstName, lastName, age, address, DOB, email, phoneNumber, gender, nextOfKin);
    }

    public Students(String firstName, String lastName, int age, String address, BigDecimal DOB, String email, long phoneNumber, Gender gender, String nextOfKin, int studentId, long guardianPhoneNumber, LocalDate yearOfAdmission, String courseDescription, String courseUnit) {
        super(firstName, lastName, age, address, DOB, email, phoneNumber, gender, nextOfKin);
        this.studentId = studentId;
        this.guardianPhoneNumber = guardianPhoneNumber;
        this.yearOfAdmission = yearOfAdmission;
        this.courseDescription = courseDescription;
        this.courseUnit = courseUnit;
    }

    public static List<Courses> listOfCoursesTakes = new ArrayList<>();

    public void listOfCourse () {
    }

    @Override
    public String toString() {
        return "Students{" +
                "studentId=" + studentId +
                ", guardianPhoneNumber=" + guardianPhoneNumber +
                ", yearOfAdmission=" + yearOfAdmission +
                ", courseDescription='" + courseDescription + '\'' +
                ", courseUnit='" + courseUnit + '\'' +
                '}';
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public long getGuardianPhoneNumber() {
        return guardianPhoneNumber;
    }

    public void setGuardianPhoneNumber(long guardianPhoneNumber) {
        this.guardianPhoneNumber = guardianPhoneNumber;
    }

    public LocalDate getYearOfAdmission() {
        return yearOfAdmission;
    }

    public void setYearOfAdmission(LocalDate yearOfAdmission) {
        this.yearOfAdmission = yearOfAdmission;
    }

    public String getCourseDescription() {
        return courseDescription;
    }

    public void setCourseDescription(String courseDescription) {
        this.courseDescription = courseDescription;
    }

    public String getCourseUnit() {
        return courseUnit;
    }

    public void setCourseUnit(String courseUnit) {
        this.courseUnit = courseUnit;
    }


    }
