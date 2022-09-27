package yuki.fatec.topicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yuki.fatec.topicos.entity.Autorizacao;

public interface AuthorizationRepository extends JpaRepository<Autorizacao, Long>{

    public Autorizacao findByNome(String nome);
}
