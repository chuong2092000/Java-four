package Test;

import Hibernate.HibernateUtils;
import Model.Cat;
import db.CatDAO;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

public class test {
    public static void main(String[] args) {
        CatDAO  catDAO=new CatDAO();
        for (Cat cat:catDAO.selectAll()
             ) {
            System.out.println(cat.getName()+" "+cat.getDateOfBirth());
        }

    }
}
