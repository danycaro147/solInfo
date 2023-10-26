/**
 * 
 */
package com.cnbv.solInfo.service.domain;

import java.sql.Date;

import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author daniel
 *
 */

@Entity
@Table(name="observaciones_solicitud_informacion")
public class ObservacionesSolicitudInformacion {
	
	@Id
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@Column(name = "id_tipo_envio")
    private Long idTipoEnvio;
	
    @Column(name = "observacion")
    private String observacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdTipoEnvio() {
		return idTipoEnvio;
	}

	public void setIdTipoEnvio(Long idTipoEnvio) {
		this.idTipoEnvio = idTipoEnvio;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

}
