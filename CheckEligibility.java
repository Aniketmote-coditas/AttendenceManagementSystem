package Attendance_Management_system;

import java.sql.SQLOutput;
import java.util.Scanner;

class CheckEligibility implements Runnable{
    Scanner sc = new Scanner(System.in);
    static int currentPercentage=0;
    static int cutoffPercentage=75;

    static boolean flag1=false;

    @Override
    synchronized public void run() {
        System.out.println("-------ENTER THE CURRENT ATTENDANCE PERCENTAGE-------");
        currentPercentage = sc.nextInt();
        if(currentPercentage>cutoffPercentage){
            flag1=true;
            System.out.println("**********YOU ARE ELIGIBLE FOR FILLING EXAM FORM**********");
        }else{
            flag1=false;
            System.out.println("YOUR ATTENDANCE IS LESS THAN 75 PLEASE ADD REGULARIZATION IF ANY---");
        }
    }
}
