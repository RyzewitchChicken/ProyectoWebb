package pe.bench.relaciones.entidades;

import java.util.List;


import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="TB_PIZZERIA")
public class Pizzeria {
	/*Atributos*/
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="idRestaurante")
	private Long id_restaurante;
	
	private String descripcion;
	private String direccion;
	private String nombre;
	private Long telefono;
	//@OneToMany(mappedBy = "pizzeria", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Producto> productos;
	//@OneToMany(mappedBy = "pizzeria", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
    private List<Oferta> ofertas;  
	//@OneToMany(mappedBy = "pizzeria", cascade = CascadeType.ALL,fetch = FetchType.LAZY)
	private List<Pedido> pedidos;
    
    /*Sets/Gets*/
	public Long getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(Long id_restaurante) {
		this.id_restaurante = id_restaurante;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Long getTelefono() {
		return telefono;
	}
	public void setTelefono(Long telefono) {
		this.telefono = telefono;
	}
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public List<Oferta> getOfertas() {
		return ofertas;
	}
	public void setOfertas(List<Oferta> ofertas) {
		this.ofertas = ofertas;
	}
    
    
    
	
	
}
