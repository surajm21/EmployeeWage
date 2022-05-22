package com.bridglabz;

public class EmpWage {

    public static void main(String[] args) {
        int is_Full_Time = 1;
        double empCheck = Math.floor(Math.random() * 10) % 2;
        if(empCheck == is_Full_Time)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");
    }
}
