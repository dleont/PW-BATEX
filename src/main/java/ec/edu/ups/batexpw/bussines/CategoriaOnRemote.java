package ec.edu.ups.batexpw.bussines;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.batexpw.model.Categoria;
import ec.edu.ups.batexpw.model.Persona;


@Local
public interface CategoriaOnRemote {

	
public void insertar(Categoria caRemo);
	
	public List<Categoria> getCategoria();
}
