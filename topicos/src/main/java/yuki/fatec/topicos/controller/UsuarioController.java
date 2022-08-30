package yuki.fatec.topicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import yuki.fatec.topicos.entity.Usuario;
import yuki.fatec.topicos.service.SegurancaService;

@RequestMapping (value = "/usuario")
@CrossOrigin
public class UsuarioController {
 
	@Autowired
	private SegurancaService SegurancaService;
	
	@GetMapping
	public List<Usuario> buscarDados(){
		return SegurancaService.todosUsuarios();
	}
	
	@GetMapping(value = "/{id}")
	public Usuario BuscarID(@PathVariable("id") Long id) {
		return SegurancaService.searchUserID(id);
	}

    @PostMapping
    public Usuario novoUsuario(@RequestBody Usuario usuario) {
        return SegurancaService.novoUsuario(usuario);
    }
}
