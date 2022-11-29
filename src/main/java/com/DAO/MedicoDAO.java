package com.DAO;
import com.proyecto.miconsultorio.Models.Medico;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface MedicoDAO extends CrudRepository<Medico, String>{
     //operacion para autentificacion (SELECT)
     @Transactional(readOnly = true) //No afecta la integridad de base de datos
     @Query(value = "SELECT *FROM medico WHERE id_medico= :identificacion and clave_medico= :clave",nativeQuery = true)
     public Medico login(@Param("identificacion")String identificacion,@Param("clave")String clave);
}

