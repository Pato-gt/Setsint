import java.util.*;
public class Principal {
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		Sets sets = new Sets(0);
		int continuar = 1;
		System.out.println("");
		System.out.println("ORGANIZADOR DE PROGRAMADORES");
		System.out.println("");
		System.out.println("Ingrese tipo de tabla a utilizar:  1 Hash, 2 Tree, 3 Linked");
		String opcion  = sc.nextLine();
		try{
			int elegido = Integer.parseInt(opcion);
			if(elegido >3 || elegido<1){
				opcion = sc.nextLine();
			}
			else{
				sets = new Sets(elegido);
			}
		}catch (Exception E){
			opcion  = sc.nextLine();
		}
		
		System.out.println("TIPOS DE PROGRAMADORES");
		System.out.println("");
		System.out.println("1 desarrollador web");
		System.out.println("2 desarrollador java");
		System.out.println("3 desarrollador Moviles");
		System.out.println("ingrese 0 al momento de indicar si continuar para terminar");
		
		while(continuar != 0){
			System.out.println("Nombre:");
			String Nombre = sc.next();
			sc.nextLine();
			if(Nombre.equals("0")){
				continuar  = 0;
			}
			else{
			System.out.println("TIPO");
			int tipo = sc.nextInt();
			if(tipo <=3 || tipo>=1){
				sets.agregar(Nombre, tipo);
			}
			System.out.println("Pertenece a otro grupo 0 no , o ingrese grupo");
			tipo = sc.nextInt();
			if(tipo <=3 || tipo>=1){
				sets.agregar(Nombre, tipo);
			}
			System.out.println("Pertenece a otro grupo 0 no , o ingrese grupo");
			tipo = sc.nextInt();
			if(tipo <=3 || tipo>=1){
				sets.agregar(Nombre, tipo);
			}
			}
		}
		
		sets.primera();
		sets.Segunda();
		
	}
}
