package pe.bench.relaciones.entidades;

import java.util.Date;
import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="TB_OFERTA")
public class Oferta {
	
	/*Atributos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idOferta")
	private Long codigo;
	
	private String titulo;
	private String descripcion;
	/*Fechas de inicio y final de oferta*/
	private Date fecha_inicio;
	private Date fecha_final;
	//@OneToMany(mappedBy = "oferta", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Producto> productos;
	//@ManyToOne
	//@JoinColumn(name="idRestaurante")
	//@JsonIgnore
	private Long id_restaurante;
	
	
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
	public Date getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(Date fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public Date getFecha_final() {
		return fecha_final;
	}
	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	
	

}
