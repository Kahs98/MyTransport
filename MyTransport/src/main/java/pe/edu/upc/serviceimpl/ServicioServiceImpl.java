package pe.edu.upc.serviceimpl;

import java.io.Serializable;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.dao.IServicioDao;
import pe.edu.upc.entity.Servicio;
import pe.edu.upc.service.IServicioService;

@Named
@RequestScoped
public class ServicioServiceImpl implements IServicioService, Serializable {

	private static final long serialVersionUID = 1L;
	
	@Inject
	private IServicioDao mD;

	@Override
	public void insertar(Servicio servicio) {
		mD.insertar(servicio);		
	}

	@Override
	public List<Servicio> listar() {
		return mD.listar();
	}

	@Override
	public void eliminar(int idServicio) {
		mD.eliminar(idServicio);		
	}
	

}
