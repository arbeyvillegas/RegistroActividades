ALTER TABLE TB_CURSO DROP CONSTRAINT Curso_Curso_FK;

ALTER TABLE TB_DOCENTE_SEMESTRE_CURSO DROP CONSTRAINT DocSemCurso_Docente_FK;

ALTER TABLE TB_DOCENTE_SEMESTRE_CURSO DROP CONSTRAINT DocSemCurso_SemCur_FK ;

ALTER TABLE TB_DOCENTE DROP CONSTRAINT Docente_Persona_FK ;

ALTER TABLE TB_ADM_PERMISOSXROL DROP CONSTRAINT PERMISOSXROL_RECURSO_FK ;

ALTER TABLE TB_ADM_PERMISOSXROL DROP CONSTRAINT PERMISOSXROL_ROL_FK ;

ALTER TABLE TB_PERSONA DROP CONSTRAINT Persona_TipoIdentificacion_FK;

ALTER TABLE TB_ADM_RECURSO DROP CONSTRAINT RECURSO_RECURSO_FK ;

ALTER TABLE TB_REPORTE_ACTIVIDAD DROP CONSTRAINT RepAct_DocSemCurso_FK ;

ALTER TABLE TB_REPORTE_ACTIVIDAD DROP CONSTRAINT RepAct_TipoActividad_FK ;

ALTER TABLE TB_SEMESTRE_CURSO DROP CONSTRAINT SemestreCurso_Curso_FK ;

ALTER TABLE TB_SEMESTRE_CURSO DROP CONSTRAINT SemestreCurso_Grupo_FK ;

ALTER TABLE TB_SEMESTRE_CURSO DROP CONSTRAINT SemestreCurso_Semestre_FK ;

ALTER TABLE TB_ADM_USUARIOXROL DROP CONSTRAINT USUARIOXROL_ROL_FK ;

ALTER TABLE TB_ADM_USUARIOXROL DROP CONSTRAINT USUARIOXROL_USUARIO_FK;

ALTER TABLE TB_ADM_USUARIO DROP CONSTRAINT USUARIO_PERSONA_FK ;


DROP TABLE TB_ADM_PERMISOSXROL;
DROP TABLE TB_ADM_RECURSO;
DROP TABLE TB_ADM_ROL;
DROP TABLE TB_ADM_USUARIO;
DROP TABLE TB_ADM_USUARIOXROL;
DROP TABLE TB_CURSO;
DROP TABLE TB_DEPENDENCIA_ACADEMICA;
DROP TABLE TB_DOCENTE;
DROP TABLE TB_DOCENTE_SEMESTRE_CURSO;
DROP TABLE TB_GRUPO;
DROP TABLE TB_PERSONA;
DROP TABLE TB_REPORTE_ACTIVIDAD;
DROP TABLE TB_SEMESTRE;
DROP TABLE TB_SEMESTRE_CURSO;
DROP TABLE TB_TIPO_ACTIVIDAD;
DROP TABLE TB_TIPO_IDENTIFICACION;