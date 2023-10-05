package kz.zhelezyaka.hibernate.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
//            Employee employee1 = new Employee("Vladimir", "Glinskikh", "IT");
//            Employee employee2 = new Employee("Svetlana", "Svetina", "MANAGER");
            session.beginTransaction();

            List<Employee> employees = session.createQuery("from Employee " +
                            "where firstname = 'Svetlana'")
                    .getResultList();
            for (Employee e : employees) {
                System.out.println(e);
            }

            session.getTransaction().commit();

        } finally {
            factory.close();
        }
    }
}
