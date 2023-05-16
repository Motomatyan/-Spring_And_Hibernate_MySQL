package HibernateTestOneToManyUni;

import HibernateTestOneToManyUni.entity.Department;
import HibernateTestOneToManyUni.entity.Employees_3;
import org.hibernate.Session;

public class Test1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        Department departments = new Department("HR", 1500,500);
        Employees_3 employees3 = new Employees_3("Oksana", "Radost",600);
        Employees_3 emp = new Employees_3("Ksenia", "Xolod", 700);

        departments.addEmployeeToDepartment(employees3);
        departments.addEmployeeToDepartment(emp);

        session.beginTransaction();
        session.save(departments);




        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
