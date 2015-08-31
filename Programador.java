
public class Programador implements Comparable<Programador>{
	private String nombre;
	private int Tipo;
	
	public Programador(String Nombre, int tipo){
		this.setNombre(Nombre);
		this.setTipo(tipo);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getTipo() {
		return Tipo;
	}

	public void setTipo(int tipo) {
		Tipo = tipo;
	}

	@Override
	public int compareTo(Programador o) {
		return nombre.compareTo(o.nombre);
	}


	


}
