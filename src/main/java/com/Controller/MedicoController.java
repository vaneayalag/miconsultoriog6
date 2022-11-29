package com.Controller;
import com.proyecto.miconsultorio.Models.Medico;
import com.DAO.MedicoDAO;
import com.Service.MedicoService;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam; //tomado de una captura 
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController //definir recursos GET POST PUT DELETE 
@CrossOrigin("*") //el intercambio de recursos de origen cruzado crea un protocolo estandar (el back y front estan en diferentes servidores)
@RequestMapping("/medico")
public class MedicoController {
     @Autowired
     MedicoDAO medicoDAO;
     @Autowired
     MedicoService medicoService;

     @PostMapping(value = "/") //la ruta principal definidad en request Mapping 
     @ResponseBody
     public ResponseEntity<Medico> agregar(@RequestBody Medico medico ){
          Medico obj= medicoService.save(medico);
          return new ResponseEntity<>(obj,HttpStatus.OK);
     }
     @DeleteMapping(value = "/{id}")// se elimina por el idpor eso se pone asi 
     public ResponseEntity<Medico> eliminar(@PathVariable String id){
          Medico obj = medicoService.findById(id);
          if(obj!=null) 
               medicoService.delete(id);
          else
               return new ResponseEntity<>(obj,HttpStatus.INTERNAL_SERVER_ERROR);
          return new ResponseEntity<>(obj,HttpStatus.OK);
     }
     @PutMapping(value="/")
     @ResponseBody
     public ResponseEntity<Medico> editar(@RequestBody Medico Medico){
          Medico obj = medicoService.findById(Medico.getId_medico());
          if (obj!=null){
               obj.setNombre_medico(Medico.getNombre_medico());
               obj.setClave_medico(Medico.getClave_medico());
               medicoService.save(Medico);
          }
          else
               return new ResponseEntity<>(obj, HttpStatus.INTERNAL_SERVER_ERROR);
          return new ResponseEntity<>(obj,HttpStatus.OK);
          }
     
     @GetMapping("/list")
     public List<Medico> consultarTodo(){
     return medicoService.findAll(); 
     }

     @GetMapping("/list/{id}")
     @ResponseBody
     public Medico consultarPorId(@PathVariable String id){
          return medicoService.findById(id);
     }

     @GetMapping("/login")
     @ResponseBody
     public Medico ingresar(@RequestParam ("usuario") String usuario,@RequestParam ("clave")String clave){
          return medicoService.login(usuario,clave);
     }

     }
