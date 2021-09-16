package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;


import pe.edu.upc.entity.Vehiculo;
import pe.edu.upc.service.IVehiculoService;

@Named
@RequestScoped

public class VehiculoController implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IVehiculoService mService;
	private Vehiculo vehiculo;
	List<Vehiculo> listaVehiculos;
	
	@PostConstruct
	public void init() {
		this.listaVehiculos = new ArrayList<Vehiculo>();
		this.vehiculo = new Vehiculo();
		this.listar();
	}
	public String nuevoVehiculo() {
		this.setVehiculo(new Vehiculo());
		return "vehiculo.xhtml";
	}
	
	public void insertar() {
		mService.insertar(vehiculo);
		limpiarVehiculo();
	}
	
	public void listar() {
		listaVehiculos = mService.listar();
	}

	public void limpiarVehiculo() {
		this.init();
	}
	
	public void eliminar(Vehiculo vehiculo) {
		mService.eliminar(vehiculo.getId());
		this.listar();
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
	public List<Vehiculo> getListaVehiculos() {
		return listaVehiculos;
	}
	public void setListaVehiculos(List<Vehiculo> listaVehiculos) {
		this.listaVehiculos = listaVehiculos;
	}
	
	

}
