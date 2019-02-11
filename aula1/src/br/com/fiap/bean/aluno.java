package br.com.fiap.bean;

public class aluno extends pessoa{
	private String rm;
	public aluno(String nome,String cpf) {
		super(nome,cpf);
		
	}

	public String getRm() {
		return rm;
	}

	public void setRm(String rm) {
		this.rm = rm;
	}
	@Override
	public void cadastrar() {
		
	}
	
	

}
