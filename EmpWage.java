package com.bridglabz;

public class EmpWage {

    public static void main(String[] args) {
        int is_Full_Time = 1;
        int EPM_RATE_PER_HOUR = 20;
        int empHrs = 0;
        int empWage = 0;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == is_Full_Time)
            empHrs = 8;
        else
            empHrs = 0;
        empWage = empHrs * EPM_RATE_PER_HOUR;
        System.out.println("Emp Wage: "+empWage);
    }
}
