package HibernateTestManyToMany;

import HibernateTestManyToMany.entity.Children;
import HibernateTestManyToMany.entity.Section;
import org.hibernate.Session;

public class Test1 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

//Добавляем детей в секцию ******************************************************
//        Section section1 = new Section("Football");
//        Children child1 = new Children("Olya",6);
//        Children child2 = new Children("Misha",7);
//        Children child3 = new Children("Vika",5);
//
//        section1.addChildToSection(child1);
//        section1.addChildToSection(child2);
//        section1.addChildToSection(child3);
//          session.beginTransaction();
//          session.persist(section1);



// Добавляем секции к детям ******************************************************
//        Section section2 = new Section("Swimming");
//        Section section3 = new Section("Dancing");
//        Section section4 = new Section("Art");
//        Children child1 = new Children("Dasha",4);
//
//        child1.addSectionToChild(section2);
//        child1.addSectionToChild(section3);
//        child1.addSectionToChild(section4);
//
//
//        session.beginTransaction();
//        session.save(child1);


//Получим секцию по id и её детей ************************************************
//        Section section = session.get(Section.class,1);
//        session.beginTransaction();
//        System.out.println(section);
//        System.out.println(section.getChildren());
//
//Получим все секции ребёнка *****************************************************

        Children child = session.get(Children.class,5);
        session.beginTransaction();
        System.out.println(child);
        System.out.println(child.getSections());

        session.getTransaction().commit();
        session.close();
        HibernateUtil.shutdown();

    }
}
