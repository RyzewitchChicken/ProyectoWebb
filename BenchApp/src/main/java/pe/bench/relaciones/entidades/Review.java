package pe.bench.relaciones.entidades;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="TB_REVIEW")
public class Review {
	/*Atributos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idReview")
	private Long codigo;
	
	private String titulo;
	private String descripcion;
	private Date fecha;
	//@ManyToOne
	//@JoinColumn(name="idCliente")
	//@JsonIgnore
	private Long codigo_cliente;
	
	
	
	/*Sets/Gets*/
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Long getCodigo_cliente() {
		return codigo_cliente;
	}
	public void setCodigo_cliente(Long codigo_cliente) {
		this.codigo_cliente = codigo_cliente;
	}
	
	
	

}
