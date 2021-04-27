package comunicacion;

public class Tesis extends Escrito {
	
	// ATRIBUTOS
	private String idea;
	private String[] argumentos;
	private String conclusion;
	private String referencias;
	private String interpretacion;
	
	// CONSTRUCTOR
	public Tesis(
			String origen, String titulo, String autor, int paginas,
			String idea, String[] argumentos, String conclusion,
			String referencias, String interpretacion
			) {
		
		super(origen, titulo, autor, paginas);
		this.idea = idea;
		this.argumentos = argumentos;
		this.conclusion = conclusion;
		this.referencias = referencias;
		this.interpretacion = interpretacion;
	}
	
	// MÉTODOS
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return super.getPaginas()*palabrasPagina*5;
	}
	
	@Override
	public String interpretacion() {
		return interpretacion;
	}
	
	// GETTERS Y SETTERS
	public String getIdea() {
		return idea;
	}

	public void setIdea(String idea) {
		this.idea = idea;
	}

	public String[] getArgumentos() {
		return argumentos;
	}

	public void setArgumentos(String[] argumentos) {
		this.argumentos = argumentos;
	}

	public String getConclusion() {
		return conclusion;
	}

	public void setConclusion(String conclusion) {
		this.conclusion = conclusion;
	}

	public String getReferencias() {
		return referencias;
	}

	public void setReferencias(String referencias) {
		this.referencias = referencias;
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
				+ "\n" + idea
				+ "\n" + argumentos.length
				+ "\n" + conclusion
				+ "\n" + referencias;
	}
}
