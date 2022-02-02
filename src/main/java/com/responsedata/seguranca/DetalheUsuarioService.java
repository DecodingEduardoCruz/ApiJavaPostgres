package com.responsedata.seguranca;

import lombok.Data;
import java.util.Optional;
import lombok.AllArgsConstructor;
import com.responsedata.modelo.Usuario;
import com.responsedata.repositorio.UsuarioRepositorio;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

@Data
@Component
@AllArgsConstructor
public class DetalheUsuarioService implements UserDetailsService {
	private final UsuarioRepositorio usuarioRepositorio;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<Usuario> usuario = usuarioRepositorio.findByUsuario(username);
		if(usuario.isEmpty()) {
			throw new UsernameNotFoundException("Usuario: " + username + "não encontrado!"); 
		}
		return new DetalheUsuarioData(usuario);
	}

}
