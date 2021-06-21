package com.company;

public class DefaultMember implements Comparable<DefaultMember>{

    private String membershipNumber;
    private String name;
    private String startMembershipDate;

    public DefaultMember(String membershipNumber, String name, String startMembershipDate){
        super();
        this.membershipNumber = membershipNumber;
        this.name = name;
        this.startMembershipDate = startMembershipDate;
    }

    public String getMembershipNumber() {
        return membershipNumber;
    }

    public void setMembershipNumber(String membershipNumber) {
        this.membershipNumber = membershipNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStartMembershipDate() {
        return startMembershipDate;
    }

    public void setStartMembershipDate(String startMembershipDate) {
        this.startMembershipDate = startMembershipDate;
    }



    @Override
    public int compareTo(DefaultMember o){
        return this.name.compareTo(o.getName());
    }
}