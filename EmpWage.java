package com.bridglabz;

public class EmpWage {
    static final int IS_FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    static final int EPM_RATE_PER_HOUR = 20;
    static final int NUM_OF_WORKING_DAYS = 2;
    static final int MAX_HOUR_IN_MONTH = 10;

    public static void main(String[] args) {
        int empHrs = 0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 20;

        while (totalEmpHrs <= MAX_HOUR_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;

            switch (empCheck) {

                case 1:
                    System.out.println("Employee is full time present");
                    empHrs = 8;
                    break;

                case 2:
                    System.out.println("Employee is part time present.");
                    empHrs = 4;
                    break;

                default:
                    System.out.println("Employee is Absent");
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            System.out.println("Days: " + totalWorkingDays + "empHr:" + totalEmpHrs);
        }
        int totalEmpWage = totalEmpHrs * EPM_RATE_PER_HOUR;
        System.out.println("total EmpWage: " + totalEmpHrs);
    }

}
