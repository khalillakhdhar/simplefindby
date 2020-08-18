package com.example.demo.Repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.model.User;

public interface UserRepository extends CrudRepository<User, Long> {
List<User> findByNom(String nom);
List<User> findByEmailAndMot_de_passe(String email, String mot_de_passe);
}
