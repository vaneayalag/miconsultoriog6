package com.proyecto.miconsultorio.Models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "Citas")
public class Citas implements Serializable {
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id_cita")
     private String id_cita;
     @NotEmpty(message="El nombre del paciente que toma la cita  no puede ser vacio ")
     @Column(name="nombre_cita")
     private String nombre_cita;
     @NotEmpty(message="La fecha de nacimiento  no puede ser vacio ")
     @Column(name="fechaNac_cita")
     private Date fechaNac_cita;
     @NotEmpty(message="el documento de identidad del paciente no puede ser vacio ")
     @Column(name="identificacion_cita")
     private String identificacion_cita;
     @NotEmpty(message="la fecha que toma la cita  no puede ser vacio ")
     @Column(name="fechaAt_cita")
     private Date fechaAt_cita;
     @NotEmpty(message="La hora a la que toma la cita  no puede ser vacio ")
     @Column(name="horaAt_cita")
     private String horaAt_cita;
     @NotEmpty(message="El correo del paciente que toma la cita  no puede ser vacio ")
     @Column(name="correo_cita")
     private String correo_cita;
     @ManyToOne 
     @NotEmpty(message="El id del medico de la atencion de la cita  no puede ser vacio ")
     @JoinColumn(name = "id_medico")
     private Medico medico;



     @Override
     public String toString() {
          return "Citas [id_cita=" + id_cita + ", nombre_cita=" + nombre_cita + ", fechaNac_cita=" + fechaNac_cita
                    + ", identificacion_cita=" + identificacion_cita + ", fechaAt_cita=" + fechaAt_cita
                    + ", horaAt_cita=" + horaAt_cita + ", correo_cita=" + correo_cita + ", medico=" + medico + "]";
     }
}