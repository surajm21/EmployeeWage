package com.bridglabz;

public class EmpWage {
    static final int FULL_TIME = 2;
    static final int IS_PART_TIME = 1;
    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHours;

    public EmpWage(String company, int wagePerHour, int numOfWorkingDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHours = maxHours;
    }
    public int computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0, totalWage = 0, totalWorkingDays = 0;
        while (numOfWorkingDays > totalWorkingDays && maxHours > totalEmpHrs) {
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
            totalEmpHrs = totalEmpHrs + empHrs;
            totalWorkingDays++;
        }
        System.out.println("Total Emp days : " + totalWorkingDays);
        totalWage = totalEmpHrs * wagePerHour;
        return  totalEmpHrs + totalWage;
    }

    public static void main(String[] args) {
        EmpWage tata =new EmpWage("TATA",20,21,100);
        System.out.println("Total Emp Hours of " + tata.company +" is " +tata.computeEmpWage());
        System.out.println("Total Emp wage for  " + tata.company +" is " +tata.computeEmpWage() );
        EmpWage honda =new EmpWage("Honda",10,30,150);
        System.out.println("Total Emp Hours of " + honda.company +" is " +honda.computeEmpWage());
        System.out.println("Total Emp wage for  " + honda.company +" is " +honda.computeEmpWage() );
    }
}