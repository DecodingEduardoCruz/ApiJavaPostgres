package com.responsedata.controle;

import java.util.List;
import io.swagger.annotations.Api;
import com.responsedata.modelo.Produto;
import com.responsedata.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/api/produtos")
@Api(value="API REST 1.0 Android")
public class ProdutoControle {
	
	@Autowired
	private ProdutoRepositorio produtoRepositorio;
	
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		return produtoRepositorio.save(produto);
	}
	
	@GetMapping
	public List<Produto> getList() {
		return produtoRepositorio.findAll();
	}
	
	@PutMapping
	public Produto update(@RequestBody Produto produto) {
		return produtoRepositorio.saveAndFlush(produto);
	}		
	
	@DeleteMapping
	public void deletar(@RequestBody Produto produto) {
		produtoRepositorio.delete(produto);
	}
}
