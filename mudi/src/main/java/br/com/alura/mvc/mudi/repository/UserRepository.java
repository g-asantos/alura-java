package br.com.alura.mvc.mudi.repository;

import org.springframework.stereotype.Repository;

import br.com.alura.mvc.mudi.model.User;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User,String>{
    
    User findByUsername(String username);
}
