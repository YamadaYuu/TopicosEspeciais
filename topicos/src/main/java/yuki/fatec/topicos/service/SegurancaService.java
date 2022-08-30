package yuki.fatec.topicos.service;

import java.util.List;

import yuki.fatec.topicos.entity.Usuario;

public interface SegurancaService {
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public List<Usuario> todosUsuarios();

    public Usuario searchUserID(Long id);

}