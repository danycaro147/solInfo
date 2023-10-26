/**
 * 
 */
package com.cnbv.solInfo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cnbv.solInfo.service.domain.ObservacionesSolicitudInformacion;

/**
 * @author daniel
 *
 */
public interface SolicitudInformacionRepository extends JpaRepository<ObservacionesSolicitudInformacion, Long>{

}
