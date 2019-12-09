package com.hibernate.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Direccion", 
       uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Direccion {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11, insertable=false, updatable=false)
	private int id;
	@Column(name="calle", nullable=false, length=50)
	private String calle;
	@Column(name="numero", nullable=false, length=3)
	private int numero;
	@Column(name="poblacion", nullable=false, length=30)
	private String poblacion;
	@Column(name="provincia", nullable=false, length=30)
	private String provincia;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCalle() {
		return calle;
	}
	public void setCalle(String calle) {
		this.calle = calle;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public String getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(String poblacion) {
		this.poblacion = poblacion;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	public String toString() {
		return "Direccion: id= " + id + " calle= " + calle +
				" numero= " + numero + " poblacion= " + poblacion +
				" provincia= " + provincia;
	}
}
