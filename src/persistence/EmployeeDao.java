package persistence;

import entity.Employee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import persistence.SessionFactoryProvider;

/**
 * @author paulawaite
 * @version 1.0 10/21/15.
 */
public class EmployeeDao {

    /* Method to CREATE a userRole in the database */
    public Integer addEmployee(Employee employee) {

        Session session = SessionFactoryProvider.getSessionFactory().openSession();
        Transaction tx = null;
        Integer employeeId = null;
        try {
            tx = session.beginTransaction();
            employeeId = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx!=null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeId;
    }
}