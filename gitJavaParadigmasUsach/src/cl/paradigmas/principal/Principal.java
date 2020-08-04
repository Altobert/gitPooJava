package cl.paradigmas.principal;

public class Principal {
	
	
	private static String menuAplicacion() {
		StringBuilder sb = new StringBuilder();
		sb.append("### SIMULACIÓN DE GIT ###\n");
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

	public static void main(String[] args) {
		
		salidaEstandar(menuAplicacion());
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
	
	public static void salidaEstandar(String s) {
		System.out.println(s);
	}
	
}
