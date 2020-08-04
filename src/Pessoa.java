
public class Pessoa {

	private int id;
	private String nome;
	private int valor;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getValor() {
		return valor;
	}
	public void setValor(int valor) {
		this.valor = valor;
	}
	public Pessoa(int id, String nome, int valor) {
		super();
		this.id = id;
		this.nome = nome;
		this.valor = valor;
	}
	
	@Override
	public String toString() {
		return "Pessoa [id=" + id + ", nome=" + nome + ", salario=" + valor +"]";
		
	}
	
	
}