package entity_annotations;

import dao.PessoaDAO;
import entities.Pessoa;

/**
 * @author Pedro Alex
 */
public class Principal {
	
	public static void main(String[] args) {
		PessoaDAO pessoaDAO = new PessoaDAO();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Maria");
		pessoaDAO.salvar(pessoa);
		
		pessoa = new Pessoa();
		pessoa.setNome("Lucas");
		pessoaDAO.salvar(pessoa);
		
		pessoa = pessoaDAO.buscarPorNome("Lucas");
		if (pessoa != null)
			System.out.println(pessoa.toString());
		
		pessoa = pessoaDAO.buscarPorNome("Ana");
		if (pessoa != null)
			System.out.println(pessoa.toString());
		
		pessoa = pessoaDAO.buscarPorNome("Maria");
		if (pessoa != null)
			System.out.println(pessoa.toString());
		
	}
}
