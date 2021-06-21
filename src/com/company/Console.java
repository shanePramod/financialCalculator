package com.company;

import java.util.Scanner;

public class Console {
    private final static MyGymManager manager = new MyGymManager() {
        @Override
        public boolean deleteMember(DefaultMember member) {
            return false;
        }

        @Override
        public void sort() {

        }
    };
    private static int count = 0;
    public static void main(String[] args){
        System.out.println("1-Insert");
        System.out.println("2-Delete");
        System.out.println("3-Print");

        int choice = 0;
        switch (choice){
            case 1:
                insertMember();
                break;
            case 2:
                deleteMember();
                break;
            case 3:
                manager.printListOfMember();
                break;
            default:
                System.out.println("Invalid Input");
        }
    }
    private static void deleteMember(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Membership Number");
        String membershipNumber = input.next();
        boolean result = manager.deleteMember(membershipNumber);
        if (result){
                count--;
        }
    }

    private static void insertMember(){
            Scanner input = new Scanner(System.in);
            if (count<100){
                input = new Scanner(System.in);
                System.out.println("Enter the membership number: ");
                String membershipNumber = input.next();
                System.out.println("Enter the name: ");
                String name = input.next();
                System.out.println("Enter the start membership date: ");
                String startMembershipDate = input.next();
                System.out.println("D-Default Member\nS-Student Member\nO-Over 60 Member)\nEnter the member type: ");
                String membershipType = input.next();
                DefaultMember member = null;


                switch (membershipType){
                    case "D":
                        member = new DefaultMember(membershipNumber,name,startMembershipDate);
                        break;
                    case "S":
                        member = new StudentMember(membershipNumber,name,startMembershipDate);
                        break;
                    case "O":
                        int age = input.nextInt();
                        member = new Over60Member(membershipNumber, name,startMembershipDate,age );
                        break;
                    default:
                        System.out.println("Invalid");

                }
                manager.addMember(member);
                count++;
            }else {
                System.out.println("Free slots are not available");
            }


    }
}
