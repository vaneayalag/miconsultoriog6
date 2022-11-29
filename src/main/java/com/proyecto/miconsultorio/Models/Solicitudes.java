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
@Table(name="solicitudes")

public class Solicitudes implements Serializable{
     @Id
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="id_solicitud")
     private int id_solicitud;
     @NotEmpty(message="El nombre del paciente que toma la cita  no puede ser vacio ")
     @Column(name="nombre_solicitud")
     private String nombre_solicitud;
     @NotEmpty(message="La fecha del paciente que toma la cita  no puede ser vacio ")
     @Column(name="fechaNac_solicitud")
     private Date fechaNac_solicitud;
     @NotEmpty(message="la identificacion del paciente que toma la cita  no puede ser vacio ")
     @Column(name="identificacion_solicitud")
     private String identificacion_solicitud;
     @NotEmpty(message="la fecha de atencion del paciente que toma la cita  no puede ser vacio ")
     @Column(name="fechaAt_solicitud")
     private Date fechaAt_solicitud;
     @NotEmpty(message="La hora del paciente que toma la cita  no puede ser vacio ")
     @Column(name="horaAt_solicitud")
     private String horaAt_solicitud;
     @NotEmpty(message="El correo del paciente que toma la cita  no puede ser vacio ")
     @Column(name="correo_solicitud")
     private String correo_solicitud;
     @ManyToOne
     @NotEmpty(message="El id del medico de la atencion de la cita  no puede ser vacio ")
     @JoinColumn (name="id_medico")
     private Medico medico;

     @Override
     public String toString() {
          return "Solicitudes [id_solicitud=" + id_solicitud + ", nombre_solicitud=" + nombre_solicitud
                    + ", fechaNac_solicitud=" + fechaNac_solicitud + ", identificacion_solicitud="
                    + identificacion_solicitud + ", fechaAt_solicitud=" + fechaAt_solicitud + ", horaAt_solicitud="
                    + horaAt_solicitud + ", correo_solicitud=" + correo_solicitud + ", medico=" + medico + "]";
     }
     
}