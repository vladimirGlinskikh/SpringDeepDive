package kz.zhelezyaka.hibernate.entities;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        try (SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory()) {
            Session session = factory.getCurrentSession();
            Employee employee = new Employee("Vladimir", "Glinskikh", "IT");
            Employee employee1 = new Employee("Svetlana", "Svetina", "HR");
            Detail detail = new Detail("Almaty", "+77019872341", "vladimir.v.glinskikh@gmail.com");
            Detail detail1 = new Detail("Krasnodar", "+77019874341", "svetlana.svetina@gmail.com");
            employee.setDetail(detail);
            employee1.setDetail(detail1);
            session.beginTransaction();

            session.save(employee);
            session.save(employee1);

            session.getTransaction().commit();
        }
    }
}
