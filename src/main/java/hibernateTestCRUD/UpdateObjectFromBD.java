package hibernateTestCRUD;

import org.hibernate.Session;

public class UpdateObjectFromBD {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        session.beginTransaction();

//        Employees emp = session.get(Employees.class,1);
//        emp.setSalary(600);
//        System.out.println(emp);
        session.createQuery("update Employees set salary = 1000" +
                "where name ='Mishenka'").executeUpdate();


        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
