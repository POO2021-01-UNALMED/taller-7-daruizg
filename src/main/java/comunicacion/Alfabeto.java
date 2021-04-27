package comunicacion;

public class Alfabeto extends Pictograma{
	
	// ATRIBUTOS
	private String[] letras;
	private String interpretacion;
	
	// CONSTRUCTORS
	public Alfabeto(String origen, String[] letras, String interpretacion) {
		super(origen);
		this.letras = letras;
		this.interpretacion = interpretacion;
	}
	
	// MÉTODOS
	public int cantidadLetras() {
		return letras.length;
	}
	
	public String interpretacion() {
		return interpretacion;
	}
	
	// GETTERS Y SETTERS
	public String[] getLetras() {
		return letras;
	}

	public void setLetras(String[] letras) {
		this.letras = letras;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}

	// TOSTRING
	@Override
	public String toString() {
		
		String alfabeto = "";
		
		for (String l: letras) {
			alfabeto += (l.equals("Z"))? l: l + ", ";
		}
		
		return alfabeto;
	}
}
