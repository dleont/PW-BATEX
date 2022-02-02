package ec.edu.ups.batexpw.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.batexpw.model.Categoria;


public class CategoriaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Categoria op) {
		em.persist(op);
	}
	

	public void upgrade(Categoria op) {

		em.merge(op);

	}
	
	public Categoria read(String cedula) {

		Categoria op = em.find(Categoria.class, cedula);
		return op;

	}

	
	
	
	public List<Categoria> getList(){
		List<Categoria> listado = new ArrayList<Categoria>();
		
		String jpql="SELECT op FROM Usuario op";
		Query query = em.createQuery(jpql, Categoria.class);
		listado = query.getResultList();
		
		
		return listado;
	}
}
