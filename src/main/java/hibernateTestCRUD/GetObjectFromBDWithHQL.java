package hibernateTestCRUD;

import hibernateTestCRUD.entity.Employees;
import org.hibernate.Session;

import java.util.List;

public class GetObjectFromBDWithHQL {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        List<Employees> emps = session.createQuery("from Employees").getResultList();
        List<Employees> emps = session.createQuery("from Employees where name = 'Oleg'").getResultList();

        for (Employees e: emps) {
            System.out.println(e);
        }

        session.getTransaction().commit();

        session.close();
        HibernateUtil.shutdown();
    }
}
