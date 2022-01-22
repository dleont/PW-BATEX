package ec.edu.ups.batexpw.Bean;

import java.util.List;


import ec.edu.ups.batexpw.bussines.PersonaOn;
import ec.edu.ups.batexpw.model.Persona;

//import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named
@RequestScoped
public class PersonaBean {

	private Persona newPersona = new Persona();
	private List<Persona> personas;
	
	public Persona getNewPersona() {
		return newPersona;
	}
	
	public void setNewPersona(Persona newPersona) {
		this.newPersona = newPersona;
	}
	
	@Inject
	private PersonaOn personaOn;
	
	//@PostConstruct
	public void init() {
		personas = personaOn.getPersonas();
		
	}
	
	public String guardarCliente() {
		try {
			this.newPersona.setRolpersona("Usuario");
			personaOn.insertar(newPersona);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return "lista-usuarios?faces-redirect=true";
	}
	
	public String guardarClienteAdmin() {
		try {
			personaOn.insertar(newPersona);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		
		return "lista-usuarios?faces-redirect=true";
	}
	
}
