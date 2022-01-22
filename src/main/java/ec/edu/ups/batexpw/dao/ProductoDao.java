package ec.edu.ups.batexpw.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.batexpw.model.Producto;

@Stateless

public class ProductoDao {
	@PersistenceContext
	private EntityManager em;

	public void insert(Producto op) {

		em.persist(op);
	}
	
	public Producto read(String numero) {

		Producto op = em.find(Producto.class, numero);
		return op;

	}
	
	public void upgrade(Producto op) {
		em.merge(op);
	}

	public List<Producto> getList() {		
		List<Producto> listado = new ArrayList<Producto>();

		String jpql = "SELECT op FROM Cuenta op";
		Query query = em.createQuery(jpql, Producto.class);
		listado = query.getResultList();
		return listado;
	}

}