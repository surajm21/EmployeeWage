package com.bridglabz;

public class EmpWage {

    public static void main(String[] args) {
        int is_Full_Time = 2;
        int is_PART_Time = 1;
        int EPM_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        int Day = 0;
        int workingdays = 20;
        int empCheck = (int) Math.floor(Math.random() * 10) % 3;
        for (Day = 1; Day <= workingdays; Day++){

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
        }
        empWage = empHrs * EPM_RATE_PER_HOUR;
        System.out.println("Emp Wage: "+empWage);
    }
}
