package yuki.fatec.topicos.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import yuki.fatec.topicos.entity.Usuario;
import yuki.fatec.topicos.entity.SegurancaService;

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
	
//	public Usuario newUsuario(@RequestBody) //ctrl +7 pra comentar e descomentar <3
}
