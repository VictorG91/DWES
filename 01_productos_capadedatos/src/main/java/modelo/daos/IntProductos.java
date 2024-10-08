package modelo.daos;

import java.util.List;

import modelo.beans.Producto;

public interface IntProductos {

	Producto findById(int idProducto);
	List<Producto> findAll();
	int altaProducto(Producto producto);
	int modificarProducto(Producto producto);
	int eliminarProducto(Producto producto);
	int eliminarProducto(int idProducto);
	List <Producto> buscarPorFamilia(int idFamilia);
	List <Producto> novedades();
	
}
