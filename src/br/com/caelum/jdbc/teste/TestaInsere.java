package br.com.caelum.jdbc.teste;

import java.util.Calendar;

import br.com.caelum.jdbc.dao.ContatoDao;
import br.com.caelum.jdbc.modelo.Contato;

public class TestaInsere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Pronto para gravar
		Contato contato = new Contato();
		contato.setNome("Caelum");
		contato.setEmail("contato@caelum.com.br");
		contato.setEndereco("R. Vergueiro 3185");
		contato.setDataNascimento(Calendar.getInstance());
		
//		Grave na conexao!!!
		ContatoDao dao = new ContatoDao();
		
//		método elegante
		dao.adiciona(contato);
		
		System.out.println("Gravando com Sucesso!!!");		
	}
}
