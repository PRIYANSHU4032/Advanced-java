package com.project.Demohiber;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;



public class App 
{
    
	@SuppressWarnings("deprecation")
	public static void main( String[] args )
    {
       Humans priyu = new Humans();
       Laptop lap = new Laptop();
       lap.setLid("170");
       lap.setLname("mac");
       
       Student stu = new Student();
       stu.setSname("Priyanshu");
       stu.setRollno("110");
       stu.setMarks("89");
       stu.getLap().add(lap);
       lap.getStudent().add(stu);
       
      // priyu.setHid(11);
       //priyu.setName("sakshi");
       //priyu.setAddress("muzafferpur");
       //Fullname ename = new Fullname();
      // ename.setFname("Mrs");
      // ename.setMname("Sakshi");
       //ename.setLname("devi");
       //priyu.setAddress("Muzafferpur");
       //priyu.setHid(070);
       //priyu.setHname(ename);
       
       Configuration conn = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
       
       ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
       
       SessionFactory sf = conn.buildSessionFactory(reg);
       
       Session session = sf.openSession();
       
       
       Transaction tx = session.beginTransaction();
       //priyu = (Humans)session.get(Humans.class, 170);
       
       //session.save(stu);
       //session.save(lap);
       Query q1 = session.createQuery("from Humans where hid = 170");
       priyu = (Humans) q1.uniqueResult();
       System.out.println(priyu);
       session.getTransaction().commit();
       
       //tx.commit();
       //System.out.println(priyu);
       session.getTransaction().commit();
       
       
       
    }
}
