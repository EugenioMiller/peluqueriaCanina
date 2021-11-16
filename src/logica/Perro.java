package logica;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Perro implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Basic
    private String nombre;
    private String raza;
    private String color;
    private String alergico;
    private String atEspecial;
    private String observaciones;

    public Perro() {
    }

    public Perro(int id, String nombre, String raza, String color, String alergico, String atEspecial, String observaciones) {
        this.id = id;
        this.nombre = nombre;
        this.raza = raza;
        this.color = color;
        this.alergico = alergico;
        this.atEspecial = atEspecial;
        this.observaciones = observaciones;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return color;
    }

    public String isAlergico() {
        return alergico;
    }

    public String isAtEspecial() {
        return atEspecial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtEspecial(String atEspecial) {
        this.atEspecial = atEspecial;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }
    
    
}
