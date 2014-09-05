package Dao;

import javax.persistence.EntityManager;

import br.senai.sc.ti20013.pw.introducaojpa.entity.Banda;

public class BandaDao {
	
	private EntityManager entityManager;
	
	public BandaDao(EntityManager entityManager){
		
		this.entityManager=entityManager;
	}
	
	public void salvar(Banda banda){
		entityManager.persist(banda);
	}
	
	public Banda buscaPorId(Long id) {
		// TODO Auto-generated method stub
		return entityManager.find(Banda.class,id);
		
		
	}

}
