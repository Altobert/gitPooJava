package cl.paradogmas.clasesPrincipales;

import java.util.Date;
/**
 * 
 * @author Alberto san martin C.
 *
 */
public class ArchivoTextoPlano {
	
	private String nombre;
	private Date fechaModificacion;
	private String contenido;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaModificacion() {
		return fechaModificacion;
	}
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}
	public String getContenido() {
		return contenido;
	}
	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

}
