package com.udea.dominio.dto;
// Generated 28/04/2016 10:30:44 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

/**
 * TbDependenciaAcademica generated by hbm2java
 */
public class TbDependenciaAcademica implements java.io.Serializable {

	private int nbId;
	private String vrNombre;
	@JsonManagedReference
	private Set tbCursos = new HashSet(0);

	public TbDependenciaAcademica() {
	}

	public TbDependenciaAcademica(int nbId, String vrNombre) {
		this.nbId = nbId;
		this.vrNombre = vrNombre;
	}

	public TbDependenciaAcademica(int nbId, String vrNombre, Set tbCursos) {
		this.nbId = nbId;
		this.vrNombre = vrNombre;
		this.tbCursos = tbCursos;
	}

	public int getNbId() {
		return this.nbId;
	}

	public void setNbId(int nbId) {
		this.nbId = nbId;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public Set getTbCursos() {
		return this.tbCursos;
	}

	public void setTbCursos(Set tbCursos) {
		this.tbCursos = tbCursos;
	}

}
