/**
 * 
 */
package com.cnbv.solInfo.service;

import java.util.Optional;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cnbv.solInfo.repository.SolicitudInformacionRepository;
import com.cnbv.solInfo.service.domain.ObservacionesSolicitudInformacion;
import com.cnbv.solInfo.service.dto.ObservacionesSolicitudInformacionDTO;

/**
 * @author daniel
 *
 */
@Service
public class SolicitudInformacionService {
	
	private final Logger log = LoggerFactory.getLogger(SolicitudInformacionService.class);
	
	// usarlo cuando se consuma otro microservicio
	@Autowired
	ModelMapper modelMapper;
	
	@Autowired
	private SolicitudInformacionRepository solicitudInfoRepository;
	
	public Optional<ObservacionesSolicitudInformacion> findById(Long requestedId) {
		return solicitudInfoRepository.findById(requestedId);
	}
	
	public ObservacionesSolicitudInformacionDTO save(ObservacionesSolicitudInformacionDTO body) {
		try {
			ObservacionesSolicitudInformacion obj = new ObservacionesSolicitudInformacion();
			obj.setIdTipoEnvio(body.getIdTipoEnvio());
			obj.setObservacion(body.getObservaciones());
			solicitudInfoRepository.save(obj);			
		} catch (Exception e) {
			log.error("FALLO EL GUARDADO: " + e.getMessage());
		}
		return body;
	}

}
