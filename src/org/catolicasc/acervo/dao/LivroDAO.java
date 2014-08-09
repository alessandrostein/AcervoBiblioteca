package org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.catolicasc.acervo.model.Livro;

public class LivroDAO {

	public List<Livro> obterLivros(){
		List<Livro> livros = new ArrayList<Livro>();
		
		Livro livro1 = new Livro();
		livro1.setNome("Rails");
		livro1.setResumo("Aprendo Rails na prática");
		livro1.setEditora("Editora NovaTec");
		livro1.setAnoPublicacao(2012);
		livro1.setAutores(Arrays.asList("Paul Deitel", "Harvey Liro"));
		livros.add(livro1);
		
		Livro livro2 = new Livro();
		livro2.setNome("Rails");
		livro2.setResumo("Aprendo Rails na prática");
		livro2.setEditora("Editora NovaTec");
		livro2.setAnoPublicacao(2012);
		livro2.setAutores(Arrays.asList("Paul Deitel", "Harvey Liro"));
		livros.add(livro2);
				
		return livros;		
	}
}
