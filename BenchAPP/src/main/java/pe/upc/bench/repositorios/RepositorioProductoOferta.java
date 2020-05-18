package pe.upc.bench.repositorios;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import pe.upc.bench.entidades.Producto_Oferta;

public interface RepositorioProductoOferta extends JpaRepository<Producto_Oferta, Long>{
	
	@Query("select c from Producto_Oferta c where c.codigo=:codigo ")
	Producto_Oferta buscarProductoOferta(@Param("codigo") Long codigo);
	
	@Query("select c from Producto_Oferta c "
			+ "where c.fecha_inicio >=:fecha_ini"
			+ " and c.fecha_fin<=:fecha_fin")
	List<Producto_Oferta> BuscarRangoFechas(@Param("fecha_ini") Date fecha_ini,@Param("fecha_fin") Date fecha_fin);

	@Query("select c from Producto_Oferta c where year(c.fecha_inicio)=year(:fecha_inicio)"
			+ "and month(c.fecha_inicio)=month(:fecha_inicio) "
			+ "and day(c.fecha_inicio)=day(:fecha_inicio)")
	List<Producto_Oferta> buscarFechaIni(@Param("fecha_inicio") Date fecha_inicio);
}
