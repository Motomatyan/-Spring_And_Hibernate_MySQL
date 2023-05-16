package hibernateTestCRUD;

import hibernateTestCRUD.entity.Employees;
import org.hibernate.Session;

public class GetObjectFromBDWithId {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Employees emp = new Employees("Oleg", "Ivanov", "HR", 300);
        session.save(emp);
//        session.getTransaction().commit();

        int myId = 4;
//        session = HibernateUtil.getSessionFactory().openSession();
//        session.beginTransaction();
        Employees employees = session.get(Employees.class,myId);
        session.getTransaction().commit();
        System.out.println(employees);

        session.close();
        HibernateUtil.shutdown();




    }
}
