package ec.edu.ups.batexpw.dao;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless


public class RolPersonaDao {
	
	@PersistenceContext
	private EntityManager em;
	
	public void insert(RolPersonaDao tu) {
		em.persist(tu);
	}
	
	public RolPersonaDao read(int id) {
		RolPersonaDao tu = em.find(RolPersonaDao.class, id);
		return tu;
	}
}
