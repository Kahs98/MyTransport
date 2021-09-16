package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import pe.edu.upc.dao.IVehiculoDao;
import pe.edu.upc.entity.Vehiculo;

public class VehiculoDaoImpl implements IVehiculoDao, Serializable {

	private static final long serialVersionUID = 1L;
	
	@PersistenceContext(unitName="pu")
	private EntityManager em;

	@Transactional
	@Override
	public void insertar(Vehiculo vehiculo) {
		em.persist(vehiculo);		
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Vehiculo> listar() {
		List<Vehiculo> lista = new ArrayList<Vehiculo>();
		Query q = em.createQuery("select m from Vehiculo m");
		lista = (List<Vehiculo>) q.getResultList();
		return lista;
	}

	@Transactional
	@Override	
	public void eliminar(int idVehiculo) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo = em.getReference(Vehiculo.class, idVehiculo);
		em.remove(vehiculo);		
	}
	
}
