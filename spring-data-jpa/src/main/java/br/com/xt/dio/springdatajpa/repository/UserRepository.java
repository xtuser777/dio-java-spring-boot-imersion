package br.com.xt.dio.springdatajpa.repository;

import br.com.xt.dio.springdatajpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {
}
