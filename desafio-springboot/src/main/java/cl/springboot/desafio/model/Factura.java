package cl.springboot.desafio.model;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="factura")
public class Factura {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer num_factura;
	
	
	private LocalDateTime fecha;
	
	@ManyToOne
	@JoinColumn(name = "idCliente", nullable = false, foreignKey = @ForeignKey(name="FK_Cliente"))
	private Cliente cliente;
	
	@ManyToOne
	@JoinColumn(name = "num_pago", nullable = false, foreignKey =@ForeignKey (name = "FK_Modo_Pago"))
	private ModoPago modopago;


	public Integer getNum_factura() {
		return num_factura;
	}


	public void setNum_factura(Integer num_factura) {
		this.num_factura = num_factura;
	}


	public LocalDateTime getFecha() {
		return fecha;
	}


	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((num_factura == null) ? 0 : num_factura.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Factura other = (Factura) obj;
		if (num_factura == null) {
			if (other.num_factura != null)
				return false;
		} else if (!num_factura.equals(other.num_factura))
			return false;
		return true;
	}
	
	
	
		

}
