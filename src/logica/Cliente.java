package logica;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente {
    
    @Id
    private int id;
    @Basic
    private String nombre;
    private String celular;

    public Cliente() {
    }
    
    public Cliente (int id, String nombre, String celular){
        this.id = id;
        this.nombre = nombre;
        this.celular = celular;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCelular() {
        return celular;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
    
}
