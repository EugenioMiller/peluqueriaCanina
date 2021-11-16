package logica;

import java.util.List;
import persistencia.ControladoraPersistencia;

public class ControladoraLogica {
    
    ControladoraPersistencia c = new ControladoraPersistencia();
    
    //---------------CLIENTE------------------------------
    
    public void altaCliente(int id, String nombre, String celu){
        Cliente cliente = new Cliente();
        cliente.setId(id);
        cliente.setNombre(nombre);
        cliente.setCelular(celu);
        c.crearCliente(cliente);
    }
    
    public void altaCliente(Cliente cliente){
        c.crearCliente(cliente);
    }
    
    public void bajaCliente(Cliente cliente){
        c.eliminarCliente(cliente);
    }
    
    public List<Cliente> traerCliente(){
        return c.obtenerCliente();
    }
    
    public void modificarCliente(Cliente cliente){
        c.modificarCliente(cliente);
    }
    
    public Cliente buscarCliente(Cliente cliente){
        return c.BuscarCliente(cliente);
    }
    
    
    //----------------------PERRO---------------------
    
    public void altaPerro(String nombre, String raza, String color, String alergico, String especial, String obs){
        Perro perro = new Perro();
        perro.setNombre(nombre);
        perro.setRaza(raza);
        perro.setColor(color);
        perro.setAlergico(alergico);
        perro.setAtEspecial(especial);
        perro.setObservaciones(obs);
        c.crearPerro(perro);
    }
    
    public void altaPerro(Perro p){
        c.crearPerro(p);
    }
    
    public void bajaPerro(Perro p){
        c.eliminarPerro(p);
    }
    
    public List<Perro> traerPerro(){
        return c.obtenerPerro();
    }
    
    public void modificarPerro(Perro p){
        c.modificarPerro(p);
    }
    
    public Perro buscarPerro(Perro p){
        return c.BuscarPerro(p);
    }
}
