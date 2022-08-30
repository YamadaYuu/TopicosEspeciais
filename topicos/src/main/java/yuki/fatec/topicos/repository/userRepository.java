package yuki.fatec.topicos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import yuki.fatec.topicos.entity.Usuario;

public interface userRepository extends JpaRepository<Usuario, Long> {
    
}
