/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;
import java.util.LinkedList;
/**
 *
 * @author leiner
 */
public class ClsPersona {
        

     private String cedula;
     private String nombre;
     private String telefono;
     private String ciudad;

    public ClsPersona(String cedula, String nombre, String telefono, String ciudad) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.telefono = telefono;
        this.ciudad = ciudad;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
     
    

}
