package comunicacion;

public class Periodico extends Escrito{
	
	// ATRIBUTOS
	private String fecha;
	private String primicia;
	private String interpretacion;

	// CONSTRUCTOR
	public Periodico(
			String origen, String titulo, String autor, int paginas,
			String fecha, String primicia, String interpretacion
			) {
		super(origen, titulo, autor, paginas);
		
		this.fecha = fecha;
		this.primicia = primicia;
		this.interpretacion = interpretacion;
	}
	
	
	// MÉTODOS
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas()*palabrasPagina*10;
	}

	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	// GETTERS Y SETTERS
	public String getFecha() {
		return fecha;
	}


	public void setFecha(String fecha) {
		this.fecha = fecha;
	}


	public String getPrimicia() {
		return primicia;
	}


	public void setPrimicia(String primicia) {
		this.primicia = primicia;
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
				+ "\n" + fecha
				+ "\n" + primicia;
	}

}
