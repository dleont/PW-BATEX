package ec.edu.ups.batexpw.bussines;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.batexpw.model.Categoria;
import ec.edu.ups.batexpw.model.Persona;

@Local

public interface CategoriaOnLocal {
	
public void insertar(Categoria caLocal);
	
	public List<Categoria> getCategoria();
}


