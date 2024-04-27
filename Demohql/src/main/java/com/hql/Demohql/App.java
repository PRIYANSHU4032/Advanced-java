package com.hql.Demohql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;
import org.hibernate.query.sql.internal.SQLQueryParser;
import org.hibernate.service.ServiceRegistry;

import jakarta.persistence.TypedQuery;

public class App 
{
    public static void main( String[] args )
    {
    	
    	
    	
        Configuration conn = new Configuration().configure().addAnnotatedClass(Deadpool.class);
        ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(conn.getProperties()).build();
        SessionFactory sf = conn.buildSessionFactory(reg);
        
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        //Deadpool dp = new Deadpool();
        //Query q = session.createQuery("from Deadpool where did = '103'");
        //List<Deadpool> dp = q.list();
       // dp = (Deadpool) q.uniqueResult();
        
       // Query q = session.createQuery("select did,name,weapons from Deadpool where did = '103'");
       // Object[] d = (Object[])q.uniqueResult();
        
        //for(Deadpool d : dp) {
       	//System.out.println(d);
       // }
       // for(Object o: d) {
       //	System.out.println(d[0]+" "+d[1]+" "+d[2]);
       // }
       	//Query q = session.createQuery("select did,name,weapons from Deadpool");
       	//List<Object[]> d = (List<Object[]>)q.list();
       	//for(Object[] o : d) {
       	//	System.out.println(o[0]+" "+o[1]+" "+o[2]);
       	//}
        
        
        //Query query = session.createQuery("from Deadpool");
        //query.addEntity(Deadpool.class);
        //List<Deadpool> dp = query.list();
        //for(Deadpool d:dp) {
        //	System.out.println(d);
        //}
        
        String b = "103";
        Query q = session.createQuery("select name from Deadpool where did = :b ");
        q.setParameter("b", b);
        List<String> names = (List<String>) q.list();

        for (String name : names) {
            System.out.println(name);
        }

        
        
     
        
        session.getTransaction().commit();
    }
}

