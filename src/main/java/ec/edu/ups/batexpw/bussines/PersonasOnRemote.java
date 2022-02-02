package ec.edu.ups.batexpw.bussines;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.Remote;

import ec.edu.ups.batexpw.model.Persona;
@Remote
public interface PersonasOnRemote {
	public void insertar(Persona p);
	
	public List<Persona> getClientes();
}
