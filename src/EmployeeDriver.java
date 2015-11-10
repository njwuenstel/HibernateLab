import java.util.List;
import java.util.Date;
import java.util.Iterator;

import entity.Employee;
import persistence.EmployeeDao;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDriver {
    public static void main(String[] args) {
        EmployeeDao dao = new EmployeeDao();
        Employee employee = new Employee("firstName", "lastName", "999-99-9999", "department", "room", "999-9999");
        dao.addEmployee(employee);
    }
}