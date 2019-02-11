package br.com.fia.teste;

import java.lang.reflect.Field;

import br.com.fiap.anotacoes.Coluna;
import br.com.fiap.anotacoes.Tabela;
import br.com.fiap.bean.Carro;

public class Teste {

	public static void main(String[] args) {
		//Instanciar um carro
		Carro carro = new Carro();
		criar_tabela(carro);
		criarSelect(carro);
	}
	public static void criar_tabela(Object obj) {
	//API reflection vamos recuperar o noem da classe
		
		String nome = obj.getClass().getName();
		System.out.println(nome);
	//recuperar os atributos da classe
		
	Field[] atributos =  obj.getClass().getDeclaredFields();

	//exercicio
	
	for(Field f : atributos) {
		System.out.println(f.getName());
		
		//recuperar a anotação @Coluna que esta localizada acima dos tipos
		Coluna anotacao = f.getAnnotation(Coluna.class);
		System.out.println("Nome: "+anotacao.nome());
		System.out.println("Tipo: "+ anotacao.tipo());
		System.out.println("Obrigatorio: "+ anotacao.obrigatorio());

	
	}
	
		
	}
public static void criarSelect(Object obj) {
	//recuperar o nome da tabela
	Tabela tabela = obj.getClass().getAnnotation(Tabela.class);
	System.out.println("SELECT * FROM "+tabela.nome());
		
	}

}
