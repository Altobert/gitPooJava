package cl.paradogmas.clasesPrincipales;

import java.util.List;

/**
 * 
 * @author alberto san martin
 * @descripcion : clase que simula las zonas.
 *
 */
public class ZonaTrabajo {
	
	private List<String> workspace;
	private List<String> index;
	private List<String> localRepo;
	private List<String> remoteRepo;
	
	public List<String> getWorkspace() {
		return workspace;
	}
	public void setWorkspace(List<String> workspace) {
		this.workspace = workspace;
	}
	public List<String> getIndex() {
		return index;
	}
	public void setIndex(List<String> index) {
		this.index = index;
	}
	public List<String> getLocalRepo() {
		return localRepo;
	}
	public void setLocalRepo(List<String> localRepo) {
		this.localRepo = localRepo;
	}
	public List<String> getRemoteRepo() {
		return remoteRepo;
	}
	public void setRemoteRepo(List<String> remoteRepo) {
		this.remoteRepo = remoteRepo;
	}

}
