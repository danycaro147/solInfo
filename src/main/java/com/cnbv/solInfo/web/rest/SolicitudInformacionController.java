package com.cnbv.solInfo.web.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cnbv.solInfo.service.SolicitudInformacionService;
import com.cnbv.solInfo.service.dto.ObservacionesSolicitudInformacionDTO;



@RestController
@RequestMapping("/solInfo")
public class SolicitudInformacionController {
	
	private final Logger log = LoggerFactory.getLogger(SolicitudInformacionController.class);
	
	@Autowired
	private SolicitudInformacionService solicitudInfoService;
	
	@PostMapping(path="/saveSolicitudInformacion", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ObservacionesSolicitudInformacionDTO> saveSolicitudInformacion(@RequestBody ObservacionesSolicitudInformacionDTO body) {
		log.info("SolicitudInformacionController.saveSolicitudInformacion");
		try {
			return ResponseEntity.ok(solicitudInfoService.save(body));
		} catch (Exception exc) {
			log.error(String.format("EXCEPCION %s", exc.getMessage()));
			return new ResponseEntity<ObservacionesSolicitudInformacionDTO>(body, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
   
   @GetMapping("/getByTipoEnvio")
   public ResponseEntity<String> getByTipoEnvio(@RequestParam int tipoEnvio) {
	   return ResponseEntity.ok(solicitudInfoService.findById(1L).get().getObservacion());
   }
}