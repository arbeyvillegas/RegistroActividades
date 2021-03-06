package com.udea.dominio.dto;
// Generated 28/04/2016 10:30:44 PM by Hibernate Tools 3.5.0.Final

import java.math.BigDecimal;
import java.util.Date;

/**
 * TbReporteActividad generated by hbm2java
 */
public class TbReporteActividad implements java.io.Serializable {

	private long nbId;
	private TbDocenteSemestreCurso tbDocenteSemestreCurso;
	private TbTipoActividad tbTipoActividad;
	private Date dtFecha;
	private BigDecimal nbHoras;
	private String vrDescripcion;

	public TbReporteActividad() {
	}

	public TbReporteActividad(long nbId, TbDocenteSemestreCurso tbDocenteSemestreCurso,
			TbTipoActividad tbTipoActividad, Date dtFecha, BigDecimal nbHoras) {
		this.nbId = nbId;
		this.tbDocenteSemestreCurso = tbDocenteSemestreCurso;
		this.tbTipoActividad = tbTipoActividad;
		this.dtFecha = dtFecha;
		this.nbHoras = nbHoras;
	}

	public TbReporteActividad(long nbId, TbDocenteSemestreCurso tbDocenteSemestreCurso,
			TbTipoActividad tbTipoActividad, Date dtFecha, BigDecimal nbHoras, String vrDescripcion) {
		this.nbId = nbId;
		this.tbDocenteSemestreCurso = tbDocenteSemestreCurso;
		this.tbTipoActividad = tbTipoActividad;
		this.dtFecha = dtFecha;
		this.nbHoras = nbHoras;
		this.vrDescripcion = vrDescripcion;
	}

	public long getNbId() {
		return this.nbId;
	}

	public void setNbId(long nbId) {
		this.nbId = nbId;
	}

	public TbDocenteSemestreCurso getTbDocenteSemestreCurso() {
		return this.tbDocenteSemestreCurso;
	}

	public void setTbDocenteSemestreCurso(TbDocenteSemestreCurso tbDocenteSemestreCurso) {
		this.tbDocenteSemestreCurso = tbDocenteSemestreCurso;
	}

	public TbTipoActividad getTbTipoActividad() {
		return this.tbTipoActividad;
	}

	public void setTbTipoActividad(TbTipoActividad tbTipoActividad) {
		this.tbTipoActividad = tbTipoActividad;
	}

	public Date getDtFecha() {
		return this.dtFecha;
	}

	public void setDtFecha(Date dtFecha) {
		this.dtFecha = dtFecha;
	}

	public BigDecimal getNbHoras() {
		return this.nbHoras;
	}

	public void setNbHoras(BigDecimal nbHoras) {
		this.nbHoras = nbHoras;
	}

	public String getVrDescripcion() {
		return this.vrDescripcion;
	}

	public void setVrDescripcion(String vrDescripcion) {
		this.vrDescripcion = vrDescripcion;
	}

}
