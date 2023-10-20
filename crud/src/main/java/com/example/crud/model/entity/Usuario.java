package com.example.crud.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Usuario") // Caso a Classe não tenha o mesmo nome da tabela.
public class Usuario {
	
	@Id//Define que id é chave primária
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Chave surrogada sequencial!
	private long id;
	
	@Column(name = "nome")//Caso a coluna não tenha o mesmo nome de uma coluna.
	private String nome;
	private String email;
	private String senha;
	private String statusUsuario;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getStatusUsuario() {
		return statusUsuario;
	}
	public void setStatusUsuario(String statusUsuario) {
		this.statusUsuario = statusUsuario;
	}
	
	
}
