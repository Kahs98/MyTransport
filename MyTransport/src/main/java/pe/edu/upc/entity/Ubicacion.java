package pe.edu.upc.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Ubicacion")

public class Ubicacion implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="nombreUbicacion", nullable=false, length=30)
	private String nombreUbicacion;

	public Ubicacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Ubicacion(int id, String nombreUbicacion) {
		super();
		this.id = id;
		this.nombreUbicacion = nombreUbicacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombreUbicacion() {
		return nombreUbicacion;
	}

	public void setNombreUbicacion(String nombreUbicacion) {
		this.nombreUbicacion = nombreUbicacion;
	}
	
	

	


}
