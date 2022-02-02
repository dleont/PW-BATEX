package ec.edu.ups.batexpw.dao;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.batexpw.model.Persona;
<<<<<<< HEAD
=======


>>>>>>> 8bc91b86e64cf7eacb6907bba18121f208faacdd
@Stateless
public class PersonaDao {
	@PersistenceContext
	private EntityManager em;
	
<<<<<<< HEAD
	public void insertar(Persona p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}
	public void update(Persona p) {
		// TODO Auto-generated method stub
		em.persist(p);
	}
	public Persona read(String cedula) {
		// TODO Auto-generated method stub
		Persona p=new Persona();
		return p;
	}
	public void delete(int  codigo) {
		// TODO Auto-generated method stub
		Persona p= em.find(Persona.class, codigo);
		em.remove(p);
	}
	public List<Persona> getList() {
		// TODO Auto-generated method stub
		List<Persona> listado =new ArrayList<Persona>();
		
		String jpql = "SELECT p FROM Persona p";
		Query query= em.createQuery(jpql,Persona.class);
		listado = query.getResultList();
		
		return listado;
	}

=======
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
>>>>>>> 8bc91b86e64cf7eacb6907bba18121f208faacdd
}
