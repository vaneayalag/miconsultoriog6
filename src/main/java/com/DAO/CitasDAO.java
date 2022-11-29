package com.DAO;
import com.proyecto.miconsultorio.Models.Citas;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface CitasDAO extends CrudRepository<Citas,String> {
     //Operacion para seleccionar las cuentas de un cliente en particular
     @Transactional(readOnly = true) //No afecta la integridad de base de datos
     @Query(value = "SELECT *FROM citas WHERE id_cita= :identificacioncita",nativeQuery = true)
     public List<Citas> consulta_citas(@Param("identificacioncita")String identificacion);
}
