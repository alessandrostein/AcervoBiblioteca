package org.catolicasc.acervo.model;

import java.util.List;

public class Livro {
	
	private String nome;
	private List<String> autores;
	private int anoPublicacao;
	private String editora;
	private String resumo;	
	
	public Livro() {
		super();
	}

	public Livro(String nome, List<String> autores, int anoPublicacao,
			String editora, String resumo) {
		super();
		this.nome = nome;
		this.autores = autores;
		this.anoPublicacao = anoPublicacao;
		this.editora = editora;
		this.resumo = resumo;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public List<String> getAutores() {
		return autores;
	}
	public void setAutores(List<String> autores) {
		this.autores = autores;
	}
	public int getAnoPublicacao() {
		return anoPublicacao;
	}
	public void setAnoPublicacao(int anoPublicacao) {
		this.anoPublicacao = anoPublicacao;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public String getResumo() {
		return resumo;
	}
	public void setResumo(String resumo) {
		this.resumo = resumo;
	}	

}
