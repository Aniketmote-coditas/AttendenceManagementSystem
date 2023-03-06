package Attendance_Management_system;

public class NotEligibleException extends Exception{
    NotEligibleException(){
        System.out.println("----NotEligibleException----");
        System.out.println("----YOUR ATTENDANCE IS LESS THAN 75\nYOUR ARE NOT ELIGIBLE FOR EXAM-----");
    }
}
