package yuki.fatec.topicos.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import yuki.fatec.topicos.entity.Trabalho;
import yuki.fatec.topicos.repository.TrabalhoRepository;

@RestController
@RequestMapping (value = "/trabalho")
@CrossOrigin
public class TrabalhoController  {
	
	@Autowired
	private TrabalhoRepository TraRepository;
	
	@GetMapping(value = "/{nota}")
	public List<Trabalho> findByNota(@PathVariable("nota") int nota){
		System.out.println(nota);
		return TraRepository.findByNota(nota);
		
	}
		
}
