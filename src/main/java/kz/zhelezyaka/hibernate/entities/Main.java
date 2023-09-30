package kz.zhelezyaka.hibernate.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .buildSessionFactory();
        try {
            Session session = factory.getCurrentSession();
            Employee employee1 = new Employee(1L, "Vladimir", "Glinskikh", "IT");
            Employee employee2 = new Employee(2L, "Svetlana", "Svetina", "MANAGER");
            session.beginTransaction();
            session.save(employee1);
            session.save(employee2);
            session.getTransaction().commit();
        } finally {
            factory.close();
        }
    }
}