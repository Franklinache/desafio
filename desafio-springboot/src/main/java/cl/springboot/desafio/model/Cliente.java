package cl.springboot.desafio.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;

@Entity
@Table(name="cliente")
public class Cliente {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id_cliente;
	
	@Column(name="nombre", nullable=false, length=20)
	private String nombre;
	
	@Column(name ="apellido", nullable=false, length=20)
	private String apellido;
	
	@Column(name ="direccion", nullable=false, length=150)
	private String direccion;
	
	@Column
	private LocalDateTime fecha_nac;
	
	@Column(name = "telefono", nullable=true, length=9)
	private String telefono;
	
	@Email
	@Column(name = "email", nullable=true, length=55)
	private String email;

	public Integer getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(Integer id_cliente) {
		this.id_cliente = id_cliente;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public LocalDateTime getFecha_nac() {
		return fecha_nac;
	}

	public void setFecha_nac(LocalDateTime fecha_nac) {
		this.fecha_nac = fecha_nac;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
