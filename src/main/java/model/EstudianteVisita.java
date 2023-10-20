package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue(value="EST")
public class EstudianteVisita extends Visita{
    private String noCif;

    public EstudianteVisita(Integer id, Date fecha
            , String nombre, String primerApellido
            , String noCif) {
        super(id, fecha, nombre, primerApellido);
        this.noCif = noCif;
    }

    public EstudianteVisita(String noCif) {
        this.noCif = noCif;
    }

    public EstudianteVisita() {

    }

    public String getNoCif() {
        return noCif;
    }

    public void setNoCif(String noCif) {
        this.noCif = noCif;
    }
}
