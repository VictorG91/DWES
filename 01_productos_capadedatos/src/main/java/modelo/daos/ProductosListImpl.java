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
		Producto aux = new Producto();
		aux.setIdProducto(idProducto);
		int pos = lista.indexOf(aux);
		if(pos == -1)
			return null;
		else
			return lista.get(pos);
	}

	@Override
	public List<Producto> findAll() {
		// TODO Auto-generated method stub
		return lista;
	}

	@Override
	public int altaProducto(Producto producto) {
		if(lista.contains(producto))
			return 0;
		else
			return lista.add(producto)?1:0;
	}

	@Override
	public int modificarProducto(Producto producto) {
		int pos = lista.indexOf(producto);
		if(pos == -1)
			return 0;
		else
			return (lista.set(pos, producto) !=null)?1:0;
	}

	@Override
	public int eliminarProducto(Producto producto) {
		return lista.remove(producto)?1:0;
	}

	@Override
	public int eliminarProducto(int idProducto) {
		Producto aux = new Producto();
		aux.setIdProducto(idProducto);
		int pos = lista.indexOf(aux);
		if(pos == -1)
			return 0;
		else
			
		return (lista.remove(pos) !=null)?1:0;
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
