package com.udea.dominio.dto;
// Generated 28/04/2016 10:30:44 PM by Hibernate Tools 3.5.0.Final

import java.util.HashSet;
import java.util.Set;

/**
 * TbAdmRecurso generated by hbm2java
 */
public class TbAdmRecurso implements java.io.Serializable {

	private long nbId;
	private TbAdmRecurso tbAdmRecurso;
	private String vrNombre;
	private short nbTipo;
	private String vrUrl;
	private Set tbAdmPermisosxrols = new HashSet(0);
	private Set tbAdmRecursos = new HashSet(0);

	public TbAdmRecurso() {
	}

	public TbAdmRecurso(long nbId, TbAdmRecurso tbAdmRecurso, short nbTipo) {
		this.nbId = nbId;
		this.tbAdmRecurso = tbAdmRecurso;
		this.nbTipo = nbTipo;
	}

	public TbAdmRecurso(long nbId, TbAdmRecurso tbAdmRecurso, String vrNombre, short nbTipo, String vrUrl,
			Set tbAdmPermisosxrols, Set tbAdmRecursos) {
		this.nbId = nbId;
		this.tbAdmRecurso = tbAdmRecurso;
		this.vrNombre = vrNombre;
		this.nbTipo = nbTipo;
		this.vrUrl = vrUrl;
		this.tbAdmPermisosxrols = tbAdmPermisosxrols;
		this.tbAdmRecursos = tbAdmRecursos;
	}

	public long getNbId() {
		return this.nbId;
	}

	public void setNbId(long nbId) {
		this.nbId = nbId;
	}

	public TbAdmRecurso getTbAdmRecurso() {
		return this.tbAdmRecurso;
	}

	public void setTbAdmRecurso(TbAdmRecurso tbAdmRecurso) {
		this.tbAdmRecurso = tbAdmRecurso;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public short getNbTipo() {
		return this.nbTipo;
	}

	public void setNbTipo(short nbTipo) {
		this.nbTipo = nbTipo;
	}

	public String getVrUrl() {
		return this.vrUrl;
	}

	public void setVrUrl(String vrUrl) {
		this.vrUrl = vrUrl;
	}

	public Set getTbAdmPermisosxrols() {
		return this.tbAdmPermisosxrols;
	}

	public void setTbAdmPermisosxrols(Set tbAdmPermisosxrols) {
		this.tbAdmPermisosxrols = tbAdmPermisosxrols;
	}

	public Set getTbAdmRecursos() {
		return this.tbAdmRecursos;
	}

	public void setTbAdmRecursos(Set tbAdmRecursos) {
		this.tbAdmRecursos = tbAdmRecursos;
	}

}
