package com.proyecto.miconsultorio.Models;
import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import javax.persistence.Id;
import javax.persistence.Column;

@Getter
@Setter
@Entity
@Table(name="medico")
public class Medico implements Serializable{
    @Id
    @NotEmpty(message="El identificador del medico no puede ser vacío")
    @Column(name="id_medico")
    private String id_medico ; // Cambiar a VARCHAR
    @NotEmpty(message="La identificación del medico no puede ser vacío")
    @Column(name="identificacion_medico") 
    private String identificacion_medico ;
    @NotEmpty(message="El nombre del medico no puede ser vacío")
    @Size(min=5, max=80,message="El nombre del medico debe tener mínimo 5 caracteres y máximo 80")
    @Column(name="nombre_medico")
    private String nombre_medico;
    @NotEmpty(message="El registro del medico no puede ser vacío")
    @Column(name="rm_medico")
    private String rm_medico;
    @NotEmpty(message="El móvil del medico no puede ser vacío")
    @Column(name="movil_medico")
    private String movil_medico;
    @NotEmpty(message="El correo del medico no puede ser vacío")
    @Column(name="correo_medico")
    private String correo_medico;
    @NotEmpty(message="La clave del medico no puede ser vacío")
    @Size(min = 6, max = 10,message = "El campo clave del medico debe tener mínimo 5 caracteres y máximo 10")
    @Column(name="clave_medico")
    private String clave_medico;

    @Override 
    public String toString() {
        return "Medico [id_medico=" + id_medico + ", identificacion_medico=" + identificacion_medico + ", nombre_medico="
                + nombre_medico + ", rm_medico="+ rm_medico + ", movil_medico=" 
                + movil_medico + ", correo_medico=" + correo_medico + ", clave_medico=" + clave_medico + "]";
    }
    
}
