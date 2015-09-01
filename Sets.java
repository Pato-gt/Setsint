import java.util.*;
public class Sets {
	private Set<Programador> web;
	private Set<Programador> java;
	private Set<Programador>  moviles;
	private Programador primero;
	
	public Sets(int tipo){
		if(tipo == 1){
		}
			web = new HashSet<Programador>();
			java = new HashSet<Programador>();
			moviles = new HashSet<Programador>();
		if(tipo == 2){
			web = new TreeSet<Programador>();
			java = new TreeSet<Programador>();
			moviles = new TreeSet<Programador>();
		}
		
		if(tipo == 3){
			web = new LinkedHashSet<Programador>();
			java = new LinkedHashSet<Programador>();
			moviles = new LinkedHashSet<Programador>();
		}
	}
	
	public void agregar(String Name,int tipo){
		primero = new Programador(Name,tipo);
		if(tipo == 1){
			web.add(primero);
		}
		if(tipo == 2){
			java.add(primero);
		}
		if(tipo == 3){
			moviles.add(primero);
		}
	}
	
	public void primera(){
		System.out.println("");
		System.out.println("EN LAS TRES CATEGORIAS SE ENCUENTRAN: ");
		System.out.println("");
		for(Iterator<Programador> ir = web.iterator(); ir.hasNext();){
			int Esta = 0;
			Programador tipow = ir.next();
			String Nombre = tipow.getNombre();
			for(Iterator<Programador> enotro = java.iterator();enotro.hasNext();){
					Programador tipoj = enotro.next();
					String Nombrej = tipoj.getNombre();
					if(Nombre.compareTo(Nombrej)==0){
						Esta +=1;
					}
			}
			for(Iterator<Programador> otromas = moviles.iterator();otromas.hasNext();){
				Programador tipom = otromas.next();
				String Nombrem = tipom.getNombre();
				if(Nombre.compareTo(Nombrem)==0){
					Esta +=1;
				}
		}
		if(Esta == 2){
			System.out.println(Nombre);
		}
		}
	}
	
	public void Segunda(){
		System.out.println("");
		System.out.println("JAVA SIN WEB");
		for(Iterator<Programador> en = java.iterator(); en.hasNext();){
			Programador enJ = en.next();
			String NombreJ = enJ.getNombre();
			for(Iterator<Programador> igual = web.iterator(); igual.hasNext();){
				Programador enW = igual.next();
				String NombreW = enW.getNombre();
				if(NombreJ.compareTo(NombreW) !=0){
					System.out.println(NombreJ);
				}
			}
		}
		System.out.println("");
	}
	
	public void Tercera(){
		System.out.println("");
		System.out.println("WEB Y CEL NO CON JAVA");
		for(Iterator<Programador> en = moviles.iterator(); en.hasNext();){
			Programador enM = en.next();
			String NombreM = enM.getNombre();
			for(Iterator<Programador> esta = web.iterator(); esta.hasNext();){
				Programador siW = esta.next();
				String NombreW = siW.getNombre();
				if(NombreW.compareTo(NombreM)== 0){
					for(Iterator<Programador> si = java.iterator(); si.hasNext(); ){
						Programador enJa = si.next();
						String NombreJ = enJa.getNombre();
						if(NombreW.compareTo(NombreJ) !=0){
							System.out.println(NombreM);
						}
					}
				}
			}
		}
	}
	
	public void Cuarta(){
		
	}
		
	}
	

	