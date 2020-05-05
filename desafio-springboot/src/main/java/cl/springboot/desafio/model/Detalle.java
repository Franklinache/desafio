package cl.springboot.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="detalle")
@IdClass(DetallePK.class)
public class Detalle {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer numDetalle;
	
	@Id
	private Producto producto;
	
	@Id
	private Factura factura;
	
	@Column(name = "cantidad", nullable=false)
	private Integer cantidad;
	
	@Column(name="precio", nullable=false)
	private Integer precio;

	public Integer getNumDetalle() {
		return numDetalle;
	}

	public void setNumDetalle(Integer numDetalle) {
		this.numDetalle = numDetalle;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Factura getFactura() {
		return factura;
	}

	public void setFactura(Factura factura) {
		this.factura = factura;
	}

	public Integer getCantidad() {
		return cantidad;
	}

	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}

	public Integer getPrecio() {
		return precio;
	}

	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	

}
