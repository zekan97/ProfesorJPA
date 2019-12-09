package com.hibernate.modelo;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(name="Profesor", 
       uniqueConstraints={@UniqueConstraint(columnNames={"id"})})
public class Profesor {
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="id", nullable=false, unique=true, length=11, insertable=false, updatable=false)
	private int id;
	@Column(name="nombre", nullable=false, length=30)
	private String nombre;
	@Column(name="ape1", nullable=false, length=30)
	private String ape1;
	@Column(name="ape2", nullable=false, length=30)
	private String ape2;
	@OneToOne(cascade=CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Direccion direccion;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApe1() {
		return ape1;
	}
	public void setApe1(String ape1) {
		this.ape1 = ape1;
	}
	public String getApe2() {
		return ape2;
	}
	public void setApe2(String ape2) {
		this.ape2 = ape2;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	
	public String toString() {
		return "Profesor: id= " + id + "nombre= " + nombre +
				"ape1= " + ape1 + "ape2= " + ape2 + 
				"id direccion= " + direccion;
	}
}
