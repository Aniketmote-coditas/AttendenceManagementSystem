package Attendance_Management_system;

public class DisplayExamSchedule extends CheckEligibility implements Runnable{

    @Override
    synchronized public void run() {
        if(flag1){
            System.out.println("-----EXAM SCHEDULE----");
            System.out.println("---------------------------------------------------");
            System.out.println("| MATH  | 1 / 1 / 2023 |");
            System.out.println("---------------------------------------------------");
            System.out.println("| PHY   | 3 / 1 / 2023 |");
            System.out.println("---------------------------------------------------");
            System.out.println("| CHEM  | 5 / 1 / 2023 |");
            System.out.println("---------------------------------------------------");
            System.out.println("| ENG   | 7 / 1 / 2023 |");
            System.out.println("---------------------------------------------------");
            System.out.println("| HINDI | 9 / 1 / 2023 |");
            System.out.println("---------------------------------------------------");
            System.out.println();
        }else try {
                throw new NotEligibleException();
            } catch (NotEligibleException e) {

            }

    }
}
