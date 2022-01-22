package ec.edu.ups.batexpw.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.batexpw.model.Persona;


@Stateless
public class PersonaDao {
	@PersistenceContext
	private EntityManager em;
	
	public void insert(Persona op) {
		em.persist(op);
	}
	

	public void upgrade(Persona op) {

		em.merge(op);

	}
	
	public Persona read(String cedula) {

		Persona op = em.find(Persona.class, cedula);
		return op;

	}

	
	
	
	public List<Persona> getList(){
		List<Persona> listado = new ArrayList<Persona>();
		
		String jpql="SELECT op FROM Usuario op";
		Query query = em.createQuery(jpql, Persona.class);
		listado = query.getResultList();
		
		
		return listado;
	}
}
