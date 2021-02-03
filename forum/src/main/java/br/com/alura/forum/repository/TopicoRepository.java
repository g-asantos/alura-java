package br.com.alura.forum.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.alura.forum.modelo.Topico;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Page;

public interface TopicoRepository extends JpaRepository<Topico, Long> {

	Page<Topico> findByCurso_Nome(String nomeCurso, Pageable page);
    
}
