package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Usuario")

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombreUsuario", nullable=false, length=30)
	private String nombreUsuario;
	
	@Column(name="apelidoUsuario", nullable=false, length=30)
	private String apelidoUsuario;
	
	@Column(name="correoUsuario", nullable=false, length=30)
	private String correoUsuario;
	
	private Date fechaUsuario;
	
	@Column(name="contraseñaUsuario", nullable=false, length=30)
	private String contraseñaUsuario;

	public Usuario() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	public String getApelidoUsuario() {
		return apelidoUsuario;
	}

	public void setApelidoUsuario(String apelidoUsuario) {
		this.apelidoUsuario = apelidoUsuario;
	}

	public String getCorreoUsuario() {
		return correoUsuario;
	}

	public void setCorreoUsuario(String correoUsuario) {
		this.correoUsuario = correoUsuario;
	}

	public Date getFechaUsuario() {
		return fechaUsuario;
	}

	public void setFechaUsuario(Date fechaUsuario) {
		this.fechaUsuario = fechaUsuario;
	}

	public String getContraseñaUsuario() {
		return contraseñaUsuario;
	}

	public void setContraseñaUsuario(String contraseñaUsuario) {
		this.contraseñaUsuario = contraseñaUsuario;
	}

	public Usuario(int id, String nombreUsuario, String apelidoUsuario, String correoUsuario, Date fechaUsuario,
			String contraseñaUsuario) {
		super();
		this.id = id;
		this.nombreUsuario = nombreUsuario;
		this.apelidoUsuario = apelidoUsuario;
		this.correoUsuario = correoUsuario;
		this.fechaUsuario = fechaUsuario;
		this.contraseñaUsuario = contraseñaUsuario;
	}

	


}
