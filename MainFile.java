package Attendance_Management_system;

import java.util.Scanner;

public class MainFile {
      public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        System.out.println("----------WELCOME TO ATTENDANCE MANAGEMENT SYSTEM----------");
        System.out.println("PRESS 1 FOR CHECK ELIGIBILITY FOR EXAM\nPRESS 2 FOR DISPLAY EXAM FORM\nPRESS 3 FOR REGULARIZED THE ATTENDANCE\nPRESS 0 FRO EXIT");
        boolean flag=true;
        while(flag){
            CheckEligibility checkEligibility = new CheckEligibility();
            Thread t1 = new Thread(checkEligibility);


            DisplayExamSchedule displayExamSchedule = new DisplayExamSchedule();
            Thread t2 = new Thread(displayExamSchedule);

            Regularizaztion regularizaztion = new Regularizaztion();
            Thread t3 = new Thread(regularizaztion);

            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    t1.start();
                    t1.join();
                    System.out.println("PRESS 1 FOR CHECK ELIGIBILITY FOR EXAM\nPRESS 2 FOR DISPLAY EXAM FORM\nPRESS 3 FOR REGULARIZED THE ATTENDANCE\nPRESS 0 FRO EXIT");
                    break;
                case 2:
                    t2.start();
                    t2.join();
                    System.out.println("PRESS 1 FOR CHECK ELIGIBILITY FOR EXAM\nPRESS 2 FOR DISPLAY EXAM FORM\nPRESS 3 FOR REGULARIZED THE ATTENDANCE\nPRESS 0 FRO EXIT");
                    break;
                case 3:
                    t3.start();
                    t3.join();
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("PLEASE ENTER FROM ABOVE OPTION");
                    break;
            }
        }
    }
}
