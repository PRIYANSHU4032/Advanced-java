package com.states.Hiberper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/*
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	Ironman im = new Ironman();
    	im.setFeat("Destroyer");
    	im.setSid(100);
    	im.setSuit("Odinson");
    		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
    		EntityManager em = emf.createEntityManager();
    		em.getTransaction().begin();
    		
    		em.persist(im);
    		//im = em.find(Ironman.class, 51);
    		em.getTransaction().commit();
    		System.out.println(im);
        
        }
        
        
        
        
    }

