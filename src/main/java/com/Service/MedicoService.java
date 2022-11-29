package com.Service;
import com.proyecto.miconsultorio.Models.Medico;
import com.DAO.MedicoDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class MedicoService{
     @Autowired
     private MedicoDAO MedicoDAO;

     
     @Transactional(readOnly = false)
     public Medico save(Medico medico){
     return MedicoDAO.save(medico);
    }

    @Transactional(readOnly = false)
    public void delete(String id) {
     MedicoDAO.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Medico findById(String id) {
     return MedicoDAO.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Medico> findAll(){
     return (List<Medico>) MedicoDAO.findAll();   
    }

    @Transactional(readOnly = true)
    public Medico login(String identificacion, String clave){
     return MedicoDAO.login(identificacion, clave);
    }

}
