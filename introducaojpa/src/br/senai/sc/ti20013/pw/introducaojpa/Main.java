package br.senai.sc.ti20013.pw.introducaojpa;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.senai.sc.ti20013.pw.introducaojpa.entity.Banda;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("introducaojpa");
EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Scanner scanner = new Scanner(System.in);
		Banda banda;
		
		for(int i = 0;i<3;i++ ){
		banda = new Banda();
		
		System.out.println("Nome da banda");
		banda.setNome(scanner.nextLine());
				
		entityManager.getTransaction().begin();
		entityManager.persist(banda);
		entityManager.getTransaction().commit();
		}
		entityManager.close();
		
		entityManagerFactory.close();

	}

}
