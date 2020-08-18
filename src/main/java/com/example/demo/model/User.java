package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.sun.istack.NotNull;

@Entity(name = "utilisateur")
public class User {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
Long id;
@NotNull
@Column(name = "nom", length = 30)
String nom;
@Column(unique=true, nullable = false)
String email;
@Column(unique=false, nullable = false)
String mot_de_passe;
@Column(columnDefinition = "integer default 25")
int age;
@Column(columnDefinition = "varchar(255) default 'Khalil '")
String teste;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getMot_de_passe() {
	return mot_de_passe;
}
public void setMot_de_passe(String mot_de_passe) {
	this.mot_de_passe = mot_de_passe;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public String getTeste() {
	return teste;
}
public void setTeste(String teste) {
	this.teste = teste;
}


}
