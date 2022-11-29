package com.DAO;
import com.proyecto.miconsultorio.Models.Solicitudes;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface SolicitudesDAO extends CrudRepository<Solicitudes, Integer> {
     //operacion para seleccionar las solicitudes de un medico 
     @Transactional(readOnly = true) //No afecta la integridad de base de datos
     @Query(value = "SELECT *FROM solicitudes WHERE id_solicitud= :identificacionsolicitud",nativeQuery = true)
     public List<Solicitudes> consulta_solicitudes (@Param("identificacionsolicitud")Integer identificacion);
}