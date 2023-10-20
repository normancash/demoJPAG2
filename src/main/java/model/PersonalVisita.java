package model;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.Date;

@Entity
@DiscriminatorValue(value="PER")
public class PersonalVisita extends Visita{
    private String noCarnet;


    public PersonalVisita(Integer id, Date fecha, String nombre
            , String primerApellido, String noCarnet) {
        super(id, fecha, nombre, primerApellido);
        this.noCarnet = noCarnet;
    }

    public PersonalVisita() {

    }

    public String getNoCarnet() {
        return noCarnet;
    }

    public void setNoCarnet(String noCarnet) {
        this.noCarnet = noCarnet;
    }
}
