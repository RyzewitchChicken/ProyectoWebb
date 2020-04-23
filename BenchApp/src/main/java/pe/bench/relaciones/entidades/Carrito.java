package pe.bench.relaciones.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TB_CARRITO")
public class Carrito {
	/*Atributos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idCarrito")
	private Long codigo;
	
	private Long cantidad;
	//@OneToOne(mappedBy = "carrito")
	private Long id_producto;
	//@OneToOne(mappedBy = "carrito")
	private Long id_cliente;

	
	/*Sets/Gets*/
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public Long getCantidad() {
		return cantidad;
	}
	public void setCantidad(Long cantidad) {
		this.cantidad = cantidad;
	}
	public Long getId_producto() {
		return id_producto;
	}
	public void setId_producto(Long id_producto) {
		this.id_producto = id_producto;
	}
	public Long getId_cliente() {
		return id_cliente;
	}
	public void setId_cliente(Long id_cliente) {
		this.id_cliente = id_cliente;
	}

	

}
