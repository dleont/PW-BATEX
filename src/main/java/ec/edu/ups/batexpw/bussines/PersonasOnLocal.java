package ec.edu.ups.batexpw.bussines;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.batexpw.model.Persona;
@Local
public interface PersonasOnLocal {
	public void insertar(Persona p);
	
	public List<Persona> getClientes();
}
