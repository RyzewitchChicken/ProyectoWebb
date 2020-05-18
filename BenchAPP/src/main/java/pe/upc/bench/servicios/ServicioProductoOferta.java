package pe.upc.bench.servicios;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import pe.upc.bench.entidades.Oferta;
import pe.upc.bench.entidades.Producto;
import pe.upc.bench.entidades.Producto_Oferta;
import pe.upc.bench.repositorios.RepositorioProductoOferta;

@Service
public class ServicioProductoOferta {
	@Autowired
	private RepositorioProductoOferta repositorioProductoOferta;
	
	@Autowired
	private ServicioProducto servicioproducto;
	
	@Autowired
	private ServicioOferta serviciooferta;
	
	//REGISTRAR PRODUCTO OFERTA
	@Transactional(rollbackFor = Exception.class)
	public Producto_Oferta registrarProductoOferta(Long codigo, Long codigo2, Producto_Oferta producto_Oferta) throws Exception {
		Producto producto=servicioproducto.obtenerProducto(codigo);
		producto_Oferta.setProducto(producto);
		Oferta oferta=serviciooferta.obtenerOferta(codigo2);
		producto_Oferta.setOferta(oferta);
		return repositorioProductoOferta.save(producto_Oferta);
	}
	
	//MOSTRAR LISTA PRODUCTO_OFERTA
	public List<Producto_Oferta> mostrarLista(){
		return repositorioProductoOferta.findAll();
	}
	
	//MOSTRAR RANGO FECHAS PRODUCTO_OFERTA
	public List<Producto_Oferta> buscarRangoFechas(String fecha_ini,String fecha_fin) throws Exception{
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MMM-dd");
		Date dateini=formatter.parse(fecha_fin);
		Date datefin=formatter.parse(fecha_fin);
		List<Producto_Oferta> po;
		po=repositorioProductoOferta.BuscarRangoFechas(dateini, datefin);
		if(po==null)throw new Exception("Listado no encontrado");
		return po;
	}
	
	
	//BUSCAR FECHA
	public List<Producto_Oferta> buscarFecha(String fecha) throws Exception {
		SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
		Date fechaini=formatter.parse(fecha);
		List<Producto_Oferta> po=null;
		po=repositorioProductoOferta.buscarFechaIni(fechaini);
		if(po==null)throw new Exception("Listado no encontrado");
		return po;
	}
	
}
