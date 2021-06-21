package com.company;
import java.util.List;

public interface GymManager {
    public void addMember(DefaultMember member);
    public boolean deleteMember(DefaultMember member);
    public void printListOfMember();
    public void sort();
    public void save();
    public List<DefaultMember> getMemberList();
    public DefaultMember getMemberByMembershipNumber(String membershipNumber);
    public DefaultMember[] getMemberByName(String Name);

}

