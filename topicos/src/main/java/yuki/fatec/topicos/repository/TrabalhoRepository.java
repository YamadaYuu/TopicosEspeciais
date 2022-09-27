package yuki.fatec.topicos.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.data.jpa.repository.Query;

import yuki.fatec.topicos.entity.Trabalho;

public interface TrabalhoRepository extends JpaRepository<Trabalho, Long> {

	//public Trabalho findByTitulo(String titulo);
	
	 @Query("select tra from Trabalho tra where tra.nota > ?1")
	public List<Trabalho> findByNota(int nota);
	
}