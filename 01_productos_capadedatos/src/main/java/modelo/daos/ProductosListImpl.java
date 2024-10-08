package modelo.daos;

import java.util.ArrayList;
import java.util.List;

import modelo.beans.Familia;
import modelo.beans.Producto;

public class ProductosListImpl implements IntProductos{

	private List<Producto> lista;
	
	public ProductosListImpl() {
		lista = new ArrayList<Producto>();
		cargarDatos();
	}

	private void cargarDatos() {
		lista.add(new Producto(1, "Telefono", 600, new Familia(1, "Camisa")));
		lista.add(new Producto(2, "Televisor", 800, new Familia(1, "Camisa")));
		lista.add(new Producto(3, "Tablet", 180, new Familia(2, "Pantalon")));
		lista.add(new Producto(4, "Portatil", 1200, new Familia(2, "Pantalon")));
		lista.add(new Producto(5, "Kindle", 159, new Familia(3, "Jersey")));
		
		
	}
	
	@Override
	public Producto findById(int idProducto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int altaProducto(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int modificarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarProducto(Producto producto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int eliminarProducto(int idProducto) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Producto> buscarPorFamilia(int idFamilia) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Producto> novedades() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
