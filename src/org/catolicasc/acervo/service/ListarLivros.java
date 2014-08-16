package org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import org.catolicasc.acervo.dao.LivroDAO;
import org.catolicasc.acervo.model.Livro;

@WebService
public class ListarLivros {
	
	@WebResult(name = "livros")
	public List<Livro> listarLivros(){
		LivroDAO livroDAO = new LivroDAO();
		return livroDAO.obterLivros();
	}
	
	public static void main(String[] args){
		Endpoint.publish("http://localhost:8180/livros", new ListarLivros());
		System.out.print("Serviço inicializado!");
	}

}
