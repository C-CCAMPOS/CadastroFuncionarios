package entities;

public class Funcionario {

	private Integer idFuncionario;
	private String nome;
	private String cpf;
	private String matricula;
	private Double salario;

	public void setIdFuncionario(Integer funcionario) {
		this.idFuncionario = funcionario;
	}

	public Integer getIdFuncionario() {
		return idFuncionario;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getCpf() {
		return cpf;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Double getSalario() {
		return salario;
	}

}
