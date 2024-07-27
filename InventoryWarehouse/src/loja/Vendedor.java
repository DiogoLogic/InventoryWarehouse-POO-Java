package loja;

import java.sql.Date;

public class Vendedor {
	
	private String nome;
	
	private Date dataNascimento;

	private String cpf;
	
	private Integer idade;
	
	public Vendedor(String nome, String cpf, Integer idade) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.idade = idade;
	}
	
	
	
	public Date getDataNascimento() {
		return dataNascimento;
	}


	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
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
