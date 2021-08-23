package com.springbeans;

public class Autor implements AutorLivro {
	
	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void exibirAutor() {
		System.out.println(this.nome);
	}

}
