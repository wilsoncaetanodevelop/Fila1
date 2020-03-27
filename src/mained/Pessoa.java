package mained;

public class Pessoa {

	private String nome;
	private String matricula;
	private String telefone;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getPessoa() {
		return "NOME : " + nome + String.format("%nMATRICULA: %s", matricula)
		+ String.format("%nTELEFONE : %s", telefone);

	}
	@Override
	public String toString() {
		
		return "NOME : " + nome + String.format("%nMATRICULA: %s", matricula)
		+ String.format("%nTELEFONE : %s", telefone);
	}

}
