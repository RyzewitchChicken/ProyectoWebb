package pe.bench.relaciones.entidades;

public class Producto {
	
	/*Atributos*/
	private Long codigo;
	private String nombre;
	private String descripcion;
	private Long precio;
	private Long id_restaurante;
	
	
	/*Sets/Gets*/
	public Long getCodigo() {
		return codigo;
	}
	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Long getPrecio() {
		return precio;
	}
	public void setPrecio(Long precio) {
		this.precio = precio;
	}
	public Long getId_restaurante() {
		return id_restaurante;
	}
	public void setId_restaurante(Long id_restaurante) {
		this.id_restaurante = id_restaurante;
	}

}
