package br.org.generation.lojasgame.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.org.generation.lojasgame.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long>{
	
	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
	 
	public List <Produto> findByPrecoGreaterThanOrderByPreco(BigDecimal preco);
	 
	public List <Produto> findByPrecoLessThanOrderByPrecoDesc(BigDecimal preco);
	
}
