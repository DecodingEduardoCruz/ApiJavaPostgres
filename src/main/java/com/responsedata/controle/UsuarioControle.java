package com.responsedata.controle;

import java.util.List;
import io.swagger.annotations.Api;
import com.responsedata.modelo.Usuario;
import com.responsedata.repositorio.UsuarioRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
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
@RequestMapping("/api/usuario")
@Api(value="API REST 1.0 Android")
public class UsuarioControle {
	
	@Autowired
	private UsuarioRepositorio usuarioRepositorio;
	
	@Autowired
	private PasswordEncoder encoder;
	
	@PostMapping
	public Usuario salvar(@RequestBody Usuario usuario) {
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		return usuarioRepositorio.save(usuario);
	}
	
	@GetMapping
	public List<Usuario> getList() {
		return usuarioRepositorio.findAll();
	}
	
	@PutMapping
	public Usuario update(@RequestBody Usuario usuario) {
		usuario.setPassword(encoder.encode(usuario.getPassword()));
		return usuarioRepositorio.save(usuario);
	}		
	
	@DeleteMapping
	public void deletar(@RequestBody Usuario usuario) {
		usuarioRepositorio.delete(usuario);
	}

}
