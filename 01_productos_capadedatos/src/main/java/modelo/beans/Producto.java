package modelo.beans;

import java.util.Date;

public class Producto {

	private int idProducto;
	private String descripcion;
	private double precioUnidad;
	private Date fechaAlta;
	private Familia familia;
	
	public Producto(int idProducto, String descripcion, double precioUnidad, Date fechaAlta, Familia familia) {
		super();
		this.idProducto = idProducto;
		this.descripcion = descripcion;
		this.precioUnidad = precioUnidad;
		this.fechaAlta = fechaAlta;
		this.familia = familia;
	}

	public Producto() {
		super();
	}

	public int getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public double getPrecioUnidad() {
		return precioUnidad;
	}

	public void setPrecioUnidad(double precioUnidad) {
		this.precioUnidad = precioUnidad;
	}

	public Date getFechaAlta() {
		return fechaAlta;
	}

	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}

	public Familia getFamilia() {
		return familia;
	}

	public void setFamilia(Familia familia) {
		this.familia = familia;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + idProducto;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Producto))
			return false;
		Producto other = (Producto) obj;
		if (idProducto != other.idProducto)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", descripcion=" + descripcion + ", precioUnidad=" + precioUnidad
				+ ", fechaAlta=" + fechaAlta + ", familia=" + familia + "]";
	}
	
	
	
	
}
