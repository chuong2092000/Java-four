package db;

import Hibernate.HibernateUtils;
import Model.Cat;
import com.mysql.cj.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import java.util.ArrayList;
import java.util.List;

public class CatDAO implements DAO<Cat>{
    @Override
    public List<Cat> selectAll() {
        List<Cat> list=new ArrayList<>();
        SessionFactory sessionFactory=HibernateUtils.getSessionFactory();
        try {
            if(sessionFactory!=null){
                Session session=sessionFactory.openSession();
                session.beginTransaction();
                String hql="from Cat";
                list= session.createQuery(hql,Cat.class).list();
                session.getTransaction().commit();
                return list;
            }
        }catch (Exception e){
            System.out.println(e);
        }
        return null;
    }

    @Override
    public int insert(Cat cat) {
        return 0;
    }

    @Override
    public int update(Cat cat) {
        return 0;
    }

    @Override
    public int delete(Cat cat) {
        return 0;
    }

    @Override
    public Cat selectById(Cat cat) {
        return null;
    }
}
