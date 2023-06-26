package Hibernate;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
    private static final SessionFactory SESSION_FACTORY=buildSessionFactory();
    private static SessionFactory buildSessionFactory() {
        try {
                return new Configuration().configure().buildSessionFactory();
        }catch (Exception e){
            System.out.println("error");
            return null;
        }

    }
    public static SessionFactory getSessionFactory(){
        return SESSION_FACTORY;
    }
    public static void shutdown(){
        getSessionFactory().close();
    }
}
