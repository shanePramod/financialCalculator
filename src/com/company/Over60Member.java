package com.company;

public class Over60Member extends  DefaultMember{
    private int age;

    public Over60Member(String membershipNumber, String name, String startMembershipDate, Integer age){
        super(membershipNumber, name, startMembershipDate);
        setAge(age);
    }
    public Integer getAge(){
        return age;
    }
    public void setAge(int age){
        if (age >=60){
            this.age = age;
        } else{
            throw new IllegalArgumentException("Invalid age for a 'Over 60 Member'");

        }
    }

}