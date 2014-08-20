package org.catolicasc.acervo.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.catolicasc.acervo.model.Livro;

public class LivroDAO {

	private static List<Livro> Livros = new ArrayList<Livro>();	
	
	static{

		Livro livro1 = new Livro();
		livro1.setNome("A Startup Enxuta");
		
		livro1.setResumo("Eric Ries criou uma abordagem revolucionária de administração "
					   + "que esta transformando a maneira pela qual os novos produtos  "
					   + "são criados, desenvolvidos e lançados.                        ");
		
		livro1.setEditora("Lua de Papel");
		livro1.setAnoPublicacao(2012);
		livro1.setAutores(Arrays.asList("Eric Ries"));
		Livros.add(livro1);
		
		Livro livro2 = new Livro();
		livro2.setNome("Coletânea Front-end: Uma antologia da comunidade front-end brasileira");
		
		livro2.setResumo("Um grupo de 11 autores de renome nacional na comunidade se juntou "
				       + "para escrever artigos que julgamos relevantes para a Web.         ");
		
		livro2.setEditora("Casa do Código");
		livro2.setAnoPublicacao(2014);
		livro2.setAutores(Arrays.asList("Almir Filho", "Bernard De Luna", "Caio Gondim", 
										"Deivid Marques", "Eduardo Shiota", "Giovanni Keppelen", 
										"Luiz Corte Real", "Jaydson Gomes", "Reinaldo Ferraz", 
										"Sergio Lopes"));
		Livros.add(livro2);
		
	}
	
	public List<Livro> obterLivros(){	
		return Livros;		
	}
	
	public void criarLivros(Livro livro){
		Livros.add(livro);
	}
}
