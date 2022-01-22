package ec.edu.ups.batexpw.bussines;

import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.batexpw.model.Categoria;
import ec.edu.ups.batexpw.model.Persona;

@Stateless
public class CategoriaOn {
	
	@Inject
	
private CategoriaOn categoriaOn;
	
	public void insertar(Categoria caOn) {
		categoriaOn.insertar(caOn);
		
	}
	public List<Categoria> getCategoria(){
		return categoriaOn.getCategoria();
	}
	

}
