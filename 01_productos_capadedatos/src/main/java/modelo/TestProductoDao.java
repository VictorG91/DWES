package modelo;

import modelo.beans.Familia;
import modelo.beans.Producto;
import modelo.daos.IntProductos;
import modelo.daos.ProductosListImpl;

public class TestProductoDao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		IntProductos iprod = new ProductosListImpl();
		
		for (Producto product : iprod.findAll()) {
			System.out.println(product);
		}
		
		Producto prod1 = new Producto(1, "Telefono", 600, new Familia(1, "Camisa"));
		
		iprod.altaProducto(prod1);
		
		iprod.modificarProducto(new Producto(5, "PlayStation5", 799, new Familia(3, "Jersey")));
		
		for (Producto producto : iprod.findAll()) {
			System.out.println(producto);
		}
		
		iprod.eliminarProducto(3);
		
		for (Producto product : iprod.findAll()) {
			System.out.println(product);
		}
	}

}
