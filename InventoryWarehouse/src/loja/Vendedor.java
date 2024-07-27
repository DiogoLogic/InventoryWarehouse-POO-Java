package loja;

public class Vendedor {
	
	private String nome;
	
	private String cpf;
	
	private Integer idade;
	
	public Vendedor(String nome, String cpf, Integer idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	
	public Integer getIdade() {
		return idade;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}


	@Override
	public String toString() {
		return "Vendedor [nome=" + nome + ", cpf=" + cpf + ", idade=" + idade + "]";
	}

	
	
}
