package org.catolicasc.acervo.service;

import java.util.List;

import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

import org.catolicasc.acervo.dao.LivroDAO;
import org.catolicasc.acervo.model.Livro;
import org.catolicasc.acervo.model.Usuario;

@WebService
public class LivrosService {
	
	@WebResult(name = "livros")
	public List<Livro> listarLivros(){
		LivroDAO livroDAO = new LivroDAO();
		return livroDAO.obterLivros();
	}
	
	private LivroDAO obterDAO(){
		return new LivroDAO();
	}
	
	public void criarLivro(@WebParam(name="livro") Livro livro, 
			@WebParam(name="usuario", header = true) Usuario usuario) throws UsuarioNaoAutorizadoException{
		
		if (usuario.getLogin().equals("admin") && usuario.getSenha().equals("admin")){
			obterDAO().criarLivro(livro);
		} else {
			throw new UsuarioNaoAutorizadoException("Nao autorizado");
		}
	}
	
	public static void main(String[] args){
		Endpoint.publish("http://localhost:8180/livros", new LivrosService());
		System.out.print("Serviço inicializado!");
	}

}
