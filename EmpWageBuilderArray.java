package com.bridglabz;

public class EmpWageBuilderArray {

        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;

        private int numOfCompany = 0;
        private CompanyEmpWage[] companyEmpWageArray;

        public EmpWageBuilderArray() {
            companyEmpWageArray = new CompanyEmpWage[5];
        }

        private void addCompanyEmpWage(String company, int empRatePerHour, int numOfWorkingDays, int maxHoursPerMonth) {
            companyEmpWageArray[numOfCompany] = new CompanyEmpWage(company, empRatePerHour, numOfWorkingDays, maxHoursPerMonth);
            numOfCompany++;
        }

        private void computeEmpWage() {
            for (int i = 0; i < numOfCompany; i++) {
                companyEmpWageArray[i].setTotalEmpWage(this.computeEmpWage(companyEmpWageArray[i]));
                System.out.println(companyEmpWageArray[i]);
            }
        }

        private int computeEmpWage(CompanyEmpWage companyEmpWage) {
            int empHrs = 0, totalEmpHrs = 0, totalWorkingDays = 0;
            while (totalEmpHrs <= companyEmpWage.maxHoursPerMonth && totalWorkingDays < companyEmpWage.numOfWorkingDays) {
                totalWorkingDays++;
                int empCheck = (int) Math.floor(Math.random() * 10) % 3;
                switch (empCheck) {
                    case (IS_PART_TIME):
                        empHrs = 8;
                        break;
                    case (IS_FULL_TIME):
                        empHrs = 4;
                        break;
                    default:
                        empHrs = 0;

                }
                totalEmpHrs = totalEmpHrs + empHrs;
                System.out.println("Total Emp days : " + totalWorkingDays + "  Emp Hr : " + empHrs);
            }
            return totalEmpHrs * companyEmpWage.empRatePerHour;
        }

        public static void main(String[] args) {
            System.out.println("Welcome to employee wage");
            com.bridglabz.EmpWageBuilderArray empWageBuilder = new com.bridglabz.EmpWageBuilderArray();
            empWageBuilder.addCompanyEmpWage("TATA", 20, 20, 20);
            empWageBuilder.addCompanyEmpWage("Reliance", 22, 4, 20);
            empWageBuilder.computeEmpWage();
        }
    }

