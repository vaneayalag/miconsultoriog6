package com.Service;
import com.proyecto.miconsultorio.Models.Citas;
import com.DAO.CitasDAO;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service 
public class CitasService{
     @Autowired
     private CitasDAO CitasDAO;

     
     @Transactional(readOnly = false)
     public Citas save(Citas Citas){
     return CitasDAO.save(Citas);
    }

    @Transactional(readOnly = false)
    public void delete(String id) {
     CitasDAO.deleteById(id);
    }

    @Transactional(readOnly = true)
    public Citas findById(String id) {
     return CitasDAO.findById(id).orElse(null);
    }

    @Transactional(readOnly = true)
    public List<Citas> findAll(){
     return (List<Citas>) CitasDAO.findAll();   
    }

    @Transactional(readOnly = true)
    public List<Citas> consulta_citas(String idc){
     return (List<Citas>) CitasDAO.consulta_citas(idc);
    }

}
