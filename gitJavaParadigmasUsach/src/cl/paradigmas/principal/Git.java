package cl.paradigmas.principal;

public class Git {
	
	public String menuAplicacion() {
		StringBuilder sb = new StringBuilder();
		sb.append("### SIMULACION GIT ###\n");
		sb.append("Escoja su opción:     	\n");
		sb.append("1. add                	\n");
		sb.append("2. commit             	\n");
		sb.append("3. pull               	\n");
		sb.append("4. push               	\n");
		sb.append("5. status             	\n");
		sb.append("6. Crear nuevo archivo	\n");
		sb.append("INTRODUZCA SU OPCIÓN: _");
		return sb.toString();
	}
	
	public void opcionesGit(){
		Integer opcion = 1;
		switch (opcion) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
		case 4:
			
			break;
		case 5:
			
			break;
		case 6:
			
			break;	

		default:
			break;
		}
	}
	
	public void run() {
		saludaEstandard(menuAplicacion());
	}
	
	public void saludaEstandard(String s){
		System.out.println(s);
	}

}
