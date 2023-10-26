/**
 * 
 */
package com.cnbv.solInfo.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author daniel
 *
 */
public class ObservacionesSolicitudInformacionDTO {

	@JsonProperty("idTipoEnvio")
	@JsonInclude(Include.NON_NULL)
	public Long idTipoEnvio;
	
	@JsonProperty("observaciones")
	@JsonInclude(Include.NON_NULL)
	public String observaciones;

	public Long getIdTipoEnvio() {
		return idTipoEnvio;
	}

	public void setIdTipoEnvio(Long idTipoEnvio) {
		this.idTipoEnvio = idTipoEnvio;
	}

	public String getObservaciones() {
		return observaciones;
	}

	public void setObservaciones(String observaciones) {
		this.observaciones = observaciones;
	}

	@Override
	public String toString() {
		return "ObservacionesSolicitudInformacionDTO [idTipoEnvio=" + idTipoEnvio + ", observaciones=" + observaciones
				+ "]";
	}

}
