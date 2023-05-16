package hibernateTestCRUD;

import org.hibernate.Session;

public class DeleteObjectFromBD {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();
//        Employees emp = session.get(Employees.class,3);
//        session.delete(emp);

        session.createQuery("delete Employees where name = 'Mishenka'").executeUpdate();



        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
