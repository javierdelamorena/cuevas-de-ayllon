package com.cuevasdeayllon.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.cuevasdeayllon.entity.Usuario;

public interface UsuarioService {
	
	Usuario usuarioPorId(int idUsuario);
	void salvarUsuario(Usuario usuario);
	List<Usuario> todosLosUsuarios();
	Usuario usuarioPorNombre(String nombre);

}
