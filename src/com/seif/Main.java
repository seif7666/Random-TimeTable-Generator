package com.seif;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Subject> subjects = new ArrayList<>();
        int stop , totalLecs = 0;
        do{
            System.out.print("Enter subject name : ");
            String name = sc.nextLine();
            int number = getInt("Enter total number of lectures for subject "+name+" : ");
            totalLecs += number;
            subjects.add(new Subject(name , number));
            stop = getInt("Press 0 to exit, any other number to continue: ");
        }while(stop != 0);

        int days = getInt("Enter remaining days : ");
        int lecsPerDay = totalLecs/days + 1;

        for (int day = 0 ; day<days ; day++ ){
            System.out.println("Print Day "+(day+1)+" : ");
            for(int lec = 0 ; lec<lecsPerDay ; lec++){
                if (subjects.size() == 0)
                    break;
                int index = new Random().nextInt(subjects.size());
                Subject subject = subjects.get(index);
                System.out.print(subject.getName()+"\t");
                subject.redLecs();
                if(subject.getLectures() == 0) {///Finished
                    subjects.remove(index);
                }
            }
            System.out.println();
        }
    }


    public static int getInt(String message){
        while(true){
            try {
                System.out.print(message);
                return Integer.parseInt(sc.nextLine());
            }catch (Exception e){
                System.out.println("Invalid Input!");
            }
        }
    }
}

//    Enter subject name : Numerical
//        Enter total number of lectures for subject Numerical : 11
//        Press 0 to exit, any other number to continue: 1
//        Enter subject name : Discrete
//        Enter total number of lectures for subject Discrete : 11
//        Press 0 to exit, any other number to continue: 1
//        Enter subject name : Computer Organization
//        Enter total number of lectures for subject Computer Organization : 15
//        Press 0 to exit, any other number to continue: 1
//        Enter subject name : Human Computer Organization
//        Enter total number of lectures for subject Human Computer Organization :