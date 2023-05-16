package HibernateTestOneToOne;

import HibernateTestOneToOne.entity.Details;
import org.hibernate.Session;

public class Test1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

// Дбавлене нового сотрудника в базу
//        Employees2 employees2 = new Employees2("Olenka","Skirda","IT", 500);
//        Details details = new Details("Moskva","42347239","ola@ma");
//        employees2.setEmpDetails(details);
//        session.beginTransaction();
//
//        session.save(employees2);
//
        //Добавление сотрудника в базу
//        Employees2 employees2 = new Employees2("Mishenka","Simakov","Engineer", 1000);
//        Details details = new Details("Moskva","42347298039","mi@ma");
//        employees2.setEmpDetails(details);
//        session.beginTransaction();
//
//        session.save(employees2);
//

////        Уддаление сотрудника
//        session.beginTransaction();
//        Employees2 employees2 = session.get(Employees2.class,2);
//        session.delete(employees2);

//        Добавление сотрудника при Bi-directional связи
//
//        Employees2 employees2 = new Employees2("Alyuona", "Kuznetsova", "Baby-sitter", 200);
//        Details details = new Details("Barnaul", "8953743", "alyuonka@");
//
//        employees2.setEmpDetails(details);
//        details.setEmployees2(employees2);

        // Получение сотрудника на основе id деталей

//        Details details = session.get(Details.class,3);
//        System.out.println(details.getEmployees2());

        // Удаление сотрудника через детали
//        Details details = session.get(Details.class,4);
//        session.delete(details);

        //  Удаление только деталей без работника
        Details details = session.get(Details.class,4);
        details.getEmployees2().setEmpDetails(null);
        session.delete(details);

        session.beginTransaction();





        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();
    }
}
