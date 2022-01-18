package ec.edu.ups.batexpw.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class RolPersona {
	@Id
	@Column(name = "rol_id")
	private int id;
	@Column(name = "rol_rolPersona")
	private String rolPersona;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getRolPersona() {
		return rolPersona;
	}
	public void setRolPersona(String rolPersona) {
		this.rolPersona = rolPersona;
	}
	
}
