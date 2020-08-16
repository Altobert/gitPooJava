package cl.paradogmas.clasesPrincipales;

import java.util.Date;
import java.util.List;
/**
 * 
 * @author alberto san martin
 * @descripcion: Representa un repositorio
 */
public class Repositorio {
	
	private String nombreRepositorio;
	private Date fcCreacionRepositorio;
	private List<ZonaTrabajo> listaZonas;
	
	public String getNombreRepositorio() {
		return nombreRepositorio;
	}
	public void setNombreRepositorio(String nombreRepositorio) {
		this.nombreRepositorio = nombreRepositorio;
	}
	public Date getFcCreacionRepositorio() {
		return fcCreacionRepositorio;
	}
	public void setFcCreacionRepositorio(Date fcCreacionRepositorio) {
		this.fcCreacionRepositorio = fcCreacionRepositorio;
	}
	public List<ZonaTrabajo> getListaZonas() {
		return listaZonas;
	}
	public void setListaZonas(List<ZonaTrabajo> listaZonas) {
		this.listaZonas = listaZonas;
	}

}
