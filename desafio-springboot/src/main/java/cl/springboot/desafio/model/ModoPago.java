package cl.springboot.desafio.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "modo_pago")
public class ModoPago {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_pago;
	
	@Column(name = "nombre", nullable=false, length=20)
	private String nombre;
	
	@Column(name="otros_detalles", nullable=true, length=100)
	private String otros_detalles;

	public Integer getNum_pago() {
		return num_pago;
	}

	public void setNum_pago(Integer num_pago) {
		this.num_pago = num_pago;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getOtros_detalles() {
		return otros_detalles;
	}

	public void setOtros_detalles(String otros_detalles) {
		this.otros_detalles = otros_detalles;
	}
	
	

}
