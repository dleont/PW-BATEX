package ec.edu.ups.batexpw.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tbl_persona")
public class Persona implements Serializable {
	@Id
	@Column(name = "per_id")
	private int id;
	@Column(name = "per_cedula")
	private String cedula;
	@Column(name = "per_nombre")
	private String nombre;
	@Column(name = "per_apellido")
	private String apellido;
	@Column(name = "per_direccion")
	private String direccion;
	@Column(name = "per_telefono")
	private String telefono;
	@Column(name = "per_email")
	private String email;
	@Column(name = "per_fechaN")
	private Date fechaN;
	@Column(name = "per_genero")
	private String genero;
	@Column(name = "per_password")
	private String password;
	
	private String  rolpersona;
	
	
	
	
	public String getRolpersona() {
		return rolpersona;
	}
	public void setRolpersona(String rolpersona) {
		this.rolpersona = rolpersona;
	}
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFechaN() {
		return fechaN;
	}
	public void setFechaN(Date fechaN) {
		this.fechaN = fechaN;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Persona [id=" + id + ", cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido
				+ ", direccion=" + direccion + ", telefono=" + telefono + ", email=" + email + ", fechaN=" + fechaN
				+ ", genero=" + genero + ", password=" + password + "]";
	}
	
	
}
