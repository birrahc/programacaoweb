package br.senail.sc.ti2013.pw.introducaoja.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class jpaUtil {
	
	private static EntityManagerFactory entityManagerFactory;
	
	public static void initFactory(){
		
		if(entityManagerFactory !=null)
			return;
			entityManagerFactory=Persistence.createEntityManagerFactory("introducaojpa");
		}
	
	public static void closeFactory(){
		entityManagerFactory.close();
	}
	
	public static EntityManager getEntityManager(){
		
		return entityManagerFactory.createEntityManager();
	}

}
