package br.senai.sc.ti20013.pw.introducaojpa.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;

@Entity
public class Banda implements Serializable {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@GeneratedValue // indica que é autoincremente
	@Id
	private long id;
	private String nome;
	
	@Lob
	private String historia;
	public Long getId() {
		return id;
	}
	public String getHistoria() {
		return historia;
	}
	public void setHistoria(String historia) {
		this.historia = historia;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	

}
