package cl.paradogmas.clasesPrincipales;

import java.util.Date;
import java.util.List;

/**
 * 
 * @author      Alberto San Martin
 * @descripcion Clase que representa a commit
 *
 */
public class Commit {

	private String autor;
	private Date marcaTiempo;
	private String mensaje;

	private List<String> commitAnterior;
	private List<String> commitSiguiente;

	private String cambiosRealizados;

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public Date getMarcaTiempo() {
		return marcaTiempo;
	}

	public void setMarcaTiempo(Date marcaTiempo) {
		this.marcaTiempo = marcaTiempo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}

	public List<String> getCommitAnterior() {
		return commitAnterior;
	}

	public void setCommitAnterior(List<String> commitAnterior) {
		this.commitAnterior = commitAnterior;
	}

	public List<String> getCommitSiguiente() {
		return commitSiguiente;
	}

	public void setCommitSiguiente(List<String> commitSiguiente) {
		this.commitSiguiente = commitSiguiente;
	}

	public String getCambiosRealizados() {
		return cambiosRealizados;
	}

	public void setCambiosRealizados(String cambiosRealizados) {
		this.cambiosRealizados = cambiosRealizados;
	}
}
