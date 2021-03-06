package com.udea.dominio.dto;
// Generated 28/04/2016 10:30:44 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * TbTipoActividad generated by hbm2java
 */
public class TbTipoActividad implements java.io.Serializable {

	private int nbId;
	private String vrNombre;
	private String vrDescripcion;
	
	private Set tbReporteActividads = new HashSet(0);

	public TbTipoActividad() {
	}

	public TbTipoActividad(int nbId, String vrNombre) {
		this.nbId = nbId;
		this.vrNombre = vrNombre;
	}

	public TbTipoActividad(int nbId, String vrNombre, String vrDescripcion, Set tbReporteActividads) {
		this.nbId = nbId;
		this.vrNombre = vrNombre;
		this.vrDescripcion = vrDescripcion;
		this.tbReporteActividads = tbReporteActividads;
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

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

	@JsonIgnore
	public Set getTbReporteActividads() {
		return this.tbReporteActividads;
	}
	
	public void setTbReporteActividads(Set tbReporteActividads) {
		this.tbReporteActividads = tbReporteActividads;
	}

}
