package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        run();
    }

    public static void run() {
        HealthPlan basic = new HealthPlan(1, "Basic Health Plan", Plan.BASIC);
        System.out.println(basic);

        String[] healthPlanArray = new String[5];


        Employee employee = new Employee(101, "Kaan Kaya", "kaan.kaya@example.com", "password123", healthPlanArray);
        employee.addHealthPlan(0, basic.getName());
        System.out.println(employee);

        String[] developerNamesArray = new String[5];


        Company company = new Company(50, "companyxx", 100, developerNamesArray);
        company.addEmployee(0, "OlguTaşkıran");
        System.out.println(company);
    }
}