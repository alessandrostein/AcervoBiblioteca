package org.catolicasc.acervo.model;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;

@XmlAccessorType(XmlAccessType.FIELD)
public class Livro {
	
	private String nome;
	
	@XmlElementWrapper(name = "autores")
	@XmlElement(name = "autor")
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
