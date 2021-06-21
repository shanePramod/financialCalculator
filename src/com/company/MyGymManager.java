package com.company;

import java.util.ArrayList;
import java.util.List;

public abstract class MyGymManager implements GymManager {
    private List<DefaultMember> memberList = new ArrayList<DefaultMember>();

    public MyGymManager() {
        super();
    }

    @Override
    public void addMember(DefaultMember member) {
        System.out.println("No.of occupied lots : "+memberList.size());
        System.out.println("No.of free slots : "+(100-memberList.size()));
        if (memberList.size() < 100){
            memberList.add(member);

        }else {
            System.out.println("No free slots available");
        }

    }

    public boolean deleteMember(String membershipNumber) {
        boolean Fal = false;
        for (DefaultMember member : memberList) {
            if (member.getMembershipNumber().equals(membershipNumber)) {
                Fal = true;
                memberList.remove(member);
                System.out.println(membershipNumber+" member was removed successfully"+" ");
                System.out.println("No.of occupied lots : "+memberList.size());
                System.out.println("No.of free slots : "+(100-memberList.size()));
                if(member instanceof StudentMember){
                    System.out.println("Membership type: Student Member");
                }else if (member instanceof Over60Member){
                    System.out.println("Membership type: Over 60 Member");
                }else{
                    System.out.println("Membership type: Default Member");
                }
                break;
            }
        }
        if(!Fal){
            System.out.println("Wrong Number");
        }
        return Fal;
    }

    @Override
    public void printListOfMember() {
        for(DefaultMember member: memberList) {
            System.out.print("Membership Number: " + member.getMembershipNumber() + " ");
            if (member instanceof StudentMember) {
                System.out.print("Membership type: Student Member ");
            } else if (member instanceof Over60Member) {
                System.out.print("Membership type: Over 60 Member ");
            } else {
                System.out.print("Membership type: Default Member ");
            }
            System.out.print("Name is: "+(member.getName() + " "));
            System.out.println("Start membership date " + member.getStartMembershipDate());
        }
        if(memberList.size() == 0){
            System.out.println("Empty List");
        }
    }

    @Override
    public void save() {
        if(memberList.size()!= 0){

        }else{
            System.out.println("Can't be empty");
        }

    }

    @Override
    public List<DefaultMember> getMemberList() {
        return this.memberList;
    }

    @Override
    public DefaultMember getMemberByMembershipNumber(String membershipNumber) {
        return null;
    }

    @Override
    public DefaultMember[] getMemberByName(String Name) {
        return new DefaultMember[0];
    }
}
