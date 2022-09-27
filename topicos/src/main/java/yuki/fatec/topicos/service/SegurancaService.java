package yuki.fatec.topicos.service;

import java.util.List;

import yuki.fatec.topicos.entity.Usuario;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface SegurancaService extends UserDetailsService{
    
    public Usuario novoUsuario(Usuario usuario);

    public Usuario novoUsuario(String nome, String senha);

    public Usuario novoUsuario(String nome, String senha, String autorizacao);

    public List<Usuario> todosUsuarios();

    public Usuario searchUserId(Long id);

}