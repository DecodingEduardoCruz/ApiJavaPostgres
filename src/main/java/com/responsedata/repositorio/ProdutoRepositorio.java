package com.responsedata.repositorio;

import com.responsedata.modelo.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepositorio extends JpaRepository<Produto, Long>{
	Produto findByCodigo(Long codigo);
}
