package hibernateTestCRUD;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.File;

public class HibernateUtil {
    private static final SessionFactory sessionFactory = initSessionFactory();

    private static SessionFactory initSessionFactory(){
//        try {
//            StandardServiceRegistry standardRegistry = new StandardServiceRegistryBuilder()
//                    .configure("hibernate.cfg.xml").build();
//            Metadata metadata = new MetadataSources(standardRegistry).getMetadataBuilder().build();
//            return metadata.getSessionFactoryBuilder().build();
//
//        } catch (HibernateException he) {
//            System.out.println("Session Factory creation failure");
//            throw he;
//        }
        try {
            return new Configuration().configure(new File("resources\\hibernate.cfg.xml")).buildSessionFactory();
        }
        catch (Throwable ex) {
            System.err.println("Initial SessionFactory creation failed."+ex);
            throw new ExceptionInInitializerError(ex);
        }
    }

    public static SessionFactory getSessionFactory(){return sessionFactory;}

    public static void shutdown(){
        getSessionFactory().close();
    }
}
