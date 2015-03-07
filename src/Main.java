import DAO.Factory;
import logic.Specialist;
import org.hibernate.HibernateException;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Query;
import org.hibernate.cfg.Configuration;
import org.hibernate.metadata.ClassMetadata;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

import java.sql.SQLException;
import java.util.Map;

/**
 * Created by user on 02.03.2015.
 */
public class Main {

    public static void main(final String[] args) throws SQLException {
        System.out.println("Hello World");


        Specialist specialist = Factory.getInstance().getSpecialistDAO().getObjectByID(1);
        System.out.println(specialist.getName()+ " "  + specialist.getFathersName());

    }
}
