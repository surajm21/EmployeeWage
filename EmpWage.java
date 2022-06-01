package com.bridglabz;

public class EmpWage {
    static final int FULL_TIME = 2;
    static final int PART_TIME = 1;
    private final String company;
    private final int wagePerHour;
    private final int numOfWorkingDays;
    private final int maxHours;
    private int totalWage;

    public EmpWage(String company, int wagePerHour, int numOfWorkingDays, int maxHours) {
        this.company = company;
        this.wagePerHour = wagePerHour;
        this.numOfWorkingDays = numOfWorkingDays;
        this.maxHours = maxHours;
    }
    public void computeEmpWage() {
        int empHrs = 0, totalEmpHrs = 0,totalWorkingDays = 0;
        while (numOfWorkingDays > totalWorkingDays && maxHours > totalEmpHrs) {
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            switch (empCheck) {
                case (PART_TIME):
                    empHrs = 4;
                    break;
                case (FULL_TIME):
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    totalWorkingDays++;
            }
            totalEmpHrs = totalEmpHrs  + empHrs;
            System.out.println("Total Emp days : " + totalWorkingDays + "  Emp Hr : " + empHrs);
        }
        totalWage = totalEmpHrs * wagePerHour;
    }
    @Override
    public String toString(){
        return "Total Emp wage for company : " + company + " is : " + totalWage;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to employee wage");
        EmpWage tata =new EmpWage("TATA",20,21,100);
        tata.computeEmpWage();
        System.out.println(tata);
    }
}