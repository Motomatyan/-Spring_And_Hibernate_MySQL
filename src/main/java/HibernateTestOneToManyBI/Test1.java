package HibernateTestOneToManyBI;

import HibernateTestOneToManyBI.entity.Departments;
import HibernateTestOneToManyBI.entity.Employees3;
import org.hibernate.Session;

public class Test1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
////        Employees3 employees3 = new Employees3("Sasha","Skvortsova",800);
//        Employees3 emp = new Employees3("Andrey","Frolov", 600);
//        Departments departments = session.get(Departments.class,2);
//
////        Departments departments = new Departments("IT", 1200, 300);
////
////        departments.addEmployeeToDepartment(employees3);
//        departments.addEmployeeToDepartment(emp);
//        session.save(departments);
        //Получение список работников через департамент ********************************
        session.beginTransaction();
        System.out.println("Get Department");
        Departments departments = session.get(Departments.class,2);

        System.out.println("Show Department");
        System.out.println(departments);
        System.out.println("Show Employees");
        System.out.println(departments.getEmps());
// Получение департаменат через работника ******************************
//        Employees3 employees3 = session.get(Employees3.class,1);
//        System.out.println(employees3);
//        System.out.println(employees3.getDepartments());
//Удаление сотрудника **********************************************************
//        session.beginTransaction();
//        Employees3 employees3 =session.get(Employees3.class,2);
//        session.delete(employees3);
//*******



        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
