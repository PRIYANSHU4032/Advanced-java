package com.jaganath.hello;

import java.util.Collection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;



/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Student stm = new Student();
       // stm.setName("Dipendra");
       // stm.setRollno("109");
        //stm.setCourse("BCA");
        
        Books bk = new Books();
        //bk.setBid("133");
       // bk.setBname("Bussiness");
       // bk.setAuthor("Shivam");
       // bk.setCategory("IT");
       // stm.getBook().add(bk);
        
        Configuration conn = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Books.class);
        
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
        
        SessionFactory sf = conn.buildSessionFactory(reg);
        
        Session session1 = sf.openSession();
        
        
        Transaction tx = session1.beginTransaction();
        
        //session.save(stm);
        //session.save(bk);
        //Student s1 = session.get(Student.class, 109);
       // System.out.println(s1.getName());
        //Collection<Books> book = s1.getBook();
        
        //for(Books b : book) {
        //	System.out.println(b);
        //}
        Query q1 = session1.createQuery("from books where bid = 133");
        bk = (Books)q1.uniqueResult();
        System.out.println(bk);
        session1.getTransaction().commit();
        
       // stm = (Student)session1.get(Student.class, 109);
        //System.out.println(stm.getName());
        
        //Session session2 = sf.openSession();
        
        
        //Transaction txx = session2.beginTransaction();
        
       // stm = (Student)session2.get(Student.class, 109);
       // System.out.println(stm.getName());
        
        
       // session2.getTransaction().commit();
        
    }
}
