package com.company;

public class StudentMember extends DefaultMember {

    private String schoolName;
    private String grade;

    public StudentMember(String membershipNumber, String name, String startMembershipDate){
        super(membershipNumber, startMembershipDate, name);
        this.schoolName = schoolName;
        this.grade = grade;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}