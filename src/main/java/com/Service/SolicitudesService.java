package com.Service;
import com.proyecto.miconsultorio.Models.Solicitudes;
import com.DAO.SolicitudesDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class SolicitudesService{
     @Autowired
     private SolicitudesDAO SolicitudesDAO;

     
     @Transactional(readOnly = false)
     public Solicitudes save(Solicitudes Solicitudes){
     return SolicitudesDAO.save(Solicitudes);
    }

    @Transactional(readOnly = false)
    public void delete(Integer id) {
     SolicitudesDAO.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Solicitudes findById(Integer id) {
     return SolicitudesDAO.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Solicitudes> findByall(){
     return (List<Solicitudes>) SolicitudesDAO.findAll();   
    }

    @Transactional(readOnly = true)
    public List<Solicitudes> consulta_Solicitudes(Integer idsolic){
     return (List<Solicitudes>) SolicitudesDAO.consulta_solicitudes(idsolic);
    }

}
