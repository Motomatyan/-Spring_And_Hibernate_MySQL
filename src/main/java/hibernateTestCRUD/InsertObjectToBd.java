package hibernateTestCRUD;

import hibernateTestCRUD.entity.Employees;
import org.hibernate.Session;

public class InsertObjectToBd {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

        Employees emp = new Employees("Mishenka", "Simakov", "Engineer", 300);
            session.save(emp);
            session.getTransaction().commit();

        System.out.println(emp);

        session.close();
        HibernateUtil.shutdown();




    }
}




