package pe.edu.upc.entity;

import java.io.Serializable;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Servicio")

public class Servicio implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	@Column(name="tipoServicio", nullable=false, length=30)
	private String tipoServicio;
	
	@Column(name="nombreServicio", nullable=false, length=30)
	private String nombreServicio;
	
	@Column(name="lugarServicio", nullable=false, length=30)
	private String lugarServicio;
	
	@Column(name="direccionServicio", nullable=false, length=50)
	private String direccionServicio;
	
	@Column(name="calificacionServicio", nullable=false, length=6)
	private String calificacionServicio;
	
	@Column(name="favoritoServicio", nullable=false, length=2)
	private String favoritoServicio;

	public Servicio() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTipoServicio() {
		return tipoServicio;
	}

	public void setTipoServicio(String tipoServicio) {
		this.tipoServicio = tipoServicio;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public String getLugarServicio() {
		return lugarServicio;
	}

	public void setLugarServicio(String lugarServicio) {
		this.lugarServicio = lugarServicio;
	}

	public String getDireccionServicio() {
		return direccionServicio;
	}

	public void setDireccionServicio(String direccionServicio) {
		this.direccionServicio = direccionServicio;
	}

	public String getCalificacionServicio() {
		return calificacionServicio;
	}

	public void setCalificacionServicio(String calificacionServicio) {
		this.calificacionServicio = calificacionServicio;
	}

	public String getFavoritoServicio() {
		return favoritoServicio;
	}

	public void setFavoritoServicio(String favoritoServicio) {
		this.favoritoServicio = favoritoServicio;
	}

	public Servicio(int id, String tipoServicio, String nombreServicio, String lugarServicio, String direccionServicio,
			String calificacionServicio, String favoritoServicio) {
		super();
		this.id = id;
		this.tipoServicio = tipoServicio;
		this.nombreServicio = nombreServicio;
		this.lugarServicio = lugarServicio;
		this.direccionServicio = direccionServicio;
		this.calificacionServicio = calificacionServicio;
		this.favoritoServicio = favoritoServicio;
	}
	

	
	


}
