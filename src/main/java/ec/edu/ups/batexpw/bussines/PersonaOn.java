package ec.edu.ups.batexpw.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.batexpw.dao.PersonaDao;
import ec.edu.ups.batexpw.model.Persona;

@Stateless
public class PersonaOn {
	@Inject
	private PersonaDao personaDao;
	
	public void insertar(Persona p) {
		personaDao.insertar(p);
	}
	public List<Persona> getPersonas(){
		return personaDao.getList();
	}
	
}
