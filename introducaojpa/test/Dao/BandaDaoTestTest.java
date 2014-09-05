package Dao;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import br.senai.sc.ti20013.pw.introducaojpa.entity.Banda;
import br.senail.sc.ti2013.pw.introducaoja.util.jpaUtil;

public class BandaDaoTestTest {
	
	public static EntityManager entityManager;
	
	private BandaDao dao;
	
	@BeforeClass
	public static void init(){
		jpaUtil.initFactory();
	}
	
	@AfterClass
	public static void finish(){
		jpaUtil.closeFactory();
	}

	
	
	@Before
	public  void begin(){
		entityManager=jpaUtil.getEntityManager();
		entityManager.getTransaction().begin();
		dao=new BandaDao(entityManager);
	}
	
	@After
	public void close(){
		entityManager.getTransaction().commit();
		entityManager.close();
		entityManager=null;
		dao=null;
	}
	
	

	@Test
	public void testSalvar() {
		Banda banda=new Banda();
		banda.setNome("Banda 456+45");
		banda.setHistoria("Historia da banda");
		dao.salvar(banda);
	}
	
	@Test
	public void buscarBandaPorId(){
		
		Banda banda=dao.buscaPorId(1L);
		System.out.println("Nome "+banda.getNome());
		assertNotNull(banda);
	}

}
