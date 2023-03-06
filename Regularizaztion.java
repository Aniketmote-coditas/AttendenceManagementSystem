package Attendance_Management_system;

import javax.xml.bind.SchemaOutputResolver;
import java.util.Scanner;

public class Regularizaztion extends CheckEligibility implements Runnable{
    Scanner sc = new Scanner(System.in);
    static int eventPercentage=2;
    static int EmergencyPercentage=4;
    static boolean falg2=true;
    static int homePercentage=3;
    @Override
    public void run() {
        System.out.println("Welcome to regularization");
        while (falg2){
        System.out.println("PRESS 1 TO ADD EVENT ATTENDANCE\nPRESS 2 TO ADD EMERGENCY ATTENDANCE\nPRESS 3 TO ADD HOME VISIT ATTENDANCE\nPRESS 0 TO EXIT");
        int c= sc.nextInt();

        switch (c) {
            case 1:
                System.out.println("How many event attendance");
                int a = sc.nextInt();
                currentPercentage += a * eventPercentage;
                break;
            case 2:
                System.out.println("How many EMERGENCY attendance");
                int B = sc.nextInt();
                currentPercentage += B * EmergencyPercentage;
                break;
            case 3:
                System.out.println("How many Home visit attendance");
                int v = sc.nextInt();
                currentPercentage += v * homePercentage;
                break;
            case 0:
                falg2 = false;
                break;
            default:
                System.out.println("Please select fromm above option");
                break;
            }
        }
        System.out.println("AFTER REGURLIAZATION YOUR CURRENT ATEENDANCE PERCENTAGE IS "+ currentPercentage);
        System.out.println("PLEASE ENTER YOUR THIS ATTENDENCE AND CHECK YOUR ELIGIBILITY");
    }
}
