package se.lu.ics;

import se.lu.ics.models.Consultant;
import se.lu.ics.models.Department;
import se.lu.ics.models.Employee;
import se.lu.ics.models.RegularEmployee;
import se.lu.ics.models.WorkRecord;

public class App {
    public static void main(String[] args) throws Exception {
        
        /*
         * Instantiation of objects
         */

         // Will result in a compile error because Employee is abstract
         // Employee employee1 = new Employee("e1", "John Doe");

         RegularEmployee employee1 = new RegularEmployee("E1", "Joe", "manager", 30000);
         Consultant employee2 = new Consultant("E2", "Bob", 500);
         Consultant employee3 = new Consultant("E3", "Sam", 600);

        /*
         * Testing One-to-many unary association "manage"
         */
        employee1.addSubordinate(employee2);
        employee2.setManager(employee1);

        employee1.addSubordinate(employee3);
        employee3.setManager(employee1);

        System.out.println("Testing one-to-many unary association");
        System.out.println("Employee " + employee1.getName() + " manages:");
        for(Employee subordinate : employee1.getSubordinates()) {
            System.out.println(subordinate.getName());
        }

        System.out.println();

        /*
         * Testing One-to-many binary association "supervise"
         */
        Department department1 = new Department("IT Department", 100000);
        department1.addSupervisor(employee1);
        employee1.setSuperviseDepartment(department1);

        department1.addSupervisor(employee3);
        employee3.setSuperviseDepartment(department1);

        System.out.println("Testing one-to-many binary association");
        System.out.println("Department " + department1.getName() + " has supervisors:");
        for(Employee supervisor : department1.getSupervisors()) {
            System.out.println(supervisor.getName());
        }

        System.out.println();

        /*
         * Testing Many-to-many binary association "mentor"
         */
        Department department2 = new Department("HR Department", 500000);

        department1.addMentor(employee1);
        employee1.addMentorDepartment(department1);

        department1.addMentor(employee2);
        employee2.addMentorDepartment(department1);

        department2.addMentor(employee1);
        employee1.addMentorDepartment(department2);

        System.out.println("Testing many-to-many binary association");
        System.out.println("Employee " + employee1.getName() + " is mentor at departments:");
        for(Department mentorDepartment : employee1.getMentorDepartments()) {
            System.out.println(mentorDepartment.getName());
        }

        System.out.println();

        System.out.println("Department " + department1.getName() + " has mentors:");
        for(Employee mentor : department1.getMentors()) {
            System.out.println(mentor.getName());
        }

        System.out.println();

        /*
         * Testing Many-to-many binary association "work"
         * with association class WorkRecord
         */

        WorkRecord workRecord1 = new WorkRecord(employee1, department1, 10);
        WorkRecord workRecord2 = new WorkRecord(employee1, department2, 20);
        WorkRecord workRecord3 = new WorkRecord(employee3, department1, 30);
        WorkRecord workRecord4 = new WorkRecord(employee2, department2, 40);

        employee1.addWorkRecord(workRecord1);
        employee1.addWorkRecord(workRecord2);
        employee3.addWorkRecord(workRecord3);
        employee2.addWorkRecord(workRecord4);

        department1.addWorkRecord(workRecord1);
        department1.addWorkRecord(workRecord3);
        department2.addWorkRecord(workRecord2);
        department2.addWorkRecord(workRecord4);

        System.out.println("Testing many-to-many binary association with association class");
        System.out.println("Employee " + employee1.getName() + " has worked for departments:");
        for(WorkRecord workRecord : employee1.getWorkRecords()) {
            System.out.println(workRecord.getDepartment().getName() + " for " + workRecord.getHours() + " hours");
        }

        System.out.println();

        System.out.println("Department " + department1.getName() + " has had employees:");
        for(WorkRecord workRecord : department1.getWorkRecords()) {
            System.out.println(workRecord.getEmployee().getName() + " for " + workRecord.getHours() + " hours");
        }

        System.out.println();

        /*
         * Testing polymorphism, i.e. the fact that we can use the same method name to calculate payment
         * for different types of employees (RegularEmployee and Consultant) and get different results
         * depending on the type of employee we are calculating payment for.
         */

        System.out.println("Testing polymorphism");
        System.out.println("Employee " + employee1.getName() + " has a payment of " + employee1.calculatePayment());
        System.out.println("Employee " + employee2.getName() + " has a payment of " + employee2.calculatePayment());
        System.out.println("Employee " + employee3.getName() + " has a payment of " + employee3.calculatePayment());

        System.out.println();

        System.out.println("Done!");
    }
}
