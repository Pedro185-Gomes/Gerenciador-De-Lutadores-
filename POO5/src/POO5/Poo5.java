package POO5;

public class Poo5 implements Lutar {
	private String lutador;
	private String nacionalidade;
	private int idade;
	private float peso;
	private String categoria;
	private float altura;
	private int derrotas;	
	private int vitorias;
	private int empates;
	
	public Poo5(String lutador, String nacionalidade, int idade, float peso, float altura, int derrotas, int vitorias,
			int empates) {
		super();
		this.lutador = lutador;
		this.nacionalidade = nacionalidade;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.derrotas = derrotas;
		this.vitorias = vitorias;
		this.empates = empates;
	}
	public String getLutador() {
		return lutador;
	}
	public void setLutador(String lutador) {
		this.lutador = lutador;
	}
	public String getNacionalidade() {
		return nacionalidade;
	}
	public void setNacionalidade(String nacionalidade) {
		this.nacionalidade = nacionalidade;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		if (this.peso <53) {
			System.out.println("Invalido");
		}else if (this.peso<=70){
			System.out.println("Peso leve");
		}else if (this.peso <= 82){
			System.out.println("Peso medio");
		}else if (this.peso <= 110){
			System.out.println("Peso pesado");
		}else {
			System.out.println("Invalido");
		}
			
			
	}
	public float getAltura() {
		return altura;
	}
	public void setAltura(float altura) {
		this.altura = altura;
	}
	public int getDerrotas() {
		return derrotas;
	}
	public void setDerrotas(int derrotas) {
		this.derrotas = derrotas;
	}
	public int getVitorias() {
		return vitorias;
	}
	public void setVitorias(int vitorias) {
		this.vitorias = vitorias;
	}
	public int getEmpates() {
		return empates;
	}
	public void setEmpates(int empates) {
		this.empates = empates;
	}
	
	@Override
	public void apresentar(){
		System.out.println("Apresentamos: " + this.lutador);
		System.out.println("Diretamente de: " + this.nacionalidade);
		System.out.println("Com "+ this.idade + "anos e" + this.altura );
		System.out.println("Pesando: " + this.getPeso());
		System.out.println(this.getVitorias() + "Vitorias");
		System.out.println(this.getDerrotas() + "Derrotas");
		System.out.println(this.getEmpates() + "Empates");
		
	}
	@Override
	public void status() {
	System.out.println(this.getLutador() + "É um peso: " + this.getCategoria());
	System.out.println("Gnhou: " + this.getVitorias() + "vezes");
	System.out.println("Perdeu: " + this.getEmpates() + "vezes");
    System.out.println("Empatou: " + this.getEmpates() + " Vezes");	
	
	}
	@Override
	public void ganharLuta() {
		this.setVitorias(this.getVitorias() + 1);
	}
	@Override
	public void perderLuta() {
		this.setDerrotas(this.getDerrotas() + 1);
	}
	@Override
	public void empatarLuta() {
				this.setEmpates(this.getEmpates() + 1);
	}
}
