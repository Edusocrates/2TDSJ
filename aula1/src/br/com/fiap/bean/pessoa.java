package br.com.fiap.bean;

import java.util.Date;

//toda classe herda de Object 
public class pessoa {
	private String nome;
	private String cpf;
	private genero sexo;
	
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
	public genero getSexo() {
		return sexo;
	}
	public void setSexo(genero sexo) {
		this.sexo = sexo;
	}
	@Deprecated //metodo fica obsoleto 
	public void cadastrar() {
		new Date("");
	}
	
	public pessoa(String nome, String cpf) {
		super();//chama o construtor pai 
		this.nome = nome;
		this.cpf = cpf;
	}
	public pessoa() {
		super();
	}
	
	
	

}
