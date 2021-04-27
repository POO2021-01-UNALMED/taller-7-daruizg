package comunicacion;

public class Fabula extends Escrito{

	// ATRIBUTOS
	private String ensenanza;
	private String interpretacion;

	// CONSTRUCTOR
	public Fabula(
			String origen, String titulo, String autor, int paginas,
			String ensenanza, String interpretacion
			) {
		super(origen, titulo, autor, paginas);
		this.ensenanza = ensenanza;
		this.interpretacion = interpretacion;
	}
	
	// MÉTODOS
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas()*palabrasPagina*1;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	// GETTERS Y SETTERS
	public String getEnsenanza() {
		return ensenanza;
	}

	public void setEnsenanza(String ensenanza) {
		this.ensenanza = ensenanza;
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
		return super.getOrigen()
				+ "\n" + super.getTitulo()
				+ "\n" + super.getAutor()
				+ "\n" + super.getPaginas()
				+ "\n" + ensenanza;
	}

}
