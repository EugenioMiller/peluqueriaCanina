package persistencia;

import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import logica.Cliente;
import logica.Perro;
import persistencia.exceptions.NonexistentEntityException;

public class ControladoraPersistencia {
    
    ClienteJpaController clienteJPA = new ClienteJpaController();
    PerroJpaController perroJPA = new PerroJpaController();
    
    
    //-------------------CLIENTE------------------
    //Método alta
    public void crearCliente(Cliente c){
        try {
            clienteJPA.create(c);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método baja
    public void eliminarCliente(Cliente cliente){
        try {
            clienteJPA.destroy(cliente.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    //Método para lectura
    public List<Cliente> obtenerCliente(){
        return clienteJPA.findClienteEntities();
    }
    
    //Método modificación
    public void modificarCliente(Cliente cliente){

        try {
            clienteJPA.edit(cliente);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    //Método para búsqueda
    public Cliente BuscarCliente(Cliente cliente){
        return clienteJPA.findCliente(cliente.getId());
    }
    
    
    //--------------------PERRO------------------------------
    //Método alta
    public void crearPerro(Perro p){
        try {
            perroJPA.create(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    //Método baja
    public void eliminarPerro(Perro p){
        try {
            perroJPA.destroy(p.getId());
        } catch (NonexistentEntityException ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
     
    }
    
    //Método para lectura
    public List<Perro> obtenerPerro(){
        return perroJPA.findPerroEntities();
    }
    
    //Método modificación
    public void modificarPerro(Perro p){

        try {
            perroJPA.edit(p);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
    
    //Método para búsqueda
    public Perro BuscarPerro(Perro p){
        return perroJPA.findPerro(p.getId());
    }
}
