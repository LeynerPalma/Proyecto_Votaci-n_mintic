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
public class ClsVotante extends ClsPersona{
    
    private String correo;
    private int estado;
    private String cotrasena;

    public ClsVotante(String cedula,String nombre, String telefono,String correo,String ciudad,String cotrasena, int estado ) {
        super(cedula, nombre, telefono, ciudad);
        this.correo = correo;
        this.estado = estado;
        this.cotrasena = cotrasena;
        
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getCotrasena() {
        return cotrasena;
    }

    public void setCotrasena(String cotrasena) {
        this.cotrasena = cotrasena;
    }



  
    
    
    
    
}    
        

   


     
        
   //    public String cargar_base_votante(){
        
       // String base = "";
       // for(ClsPersona p :lista_vacia){
   //        base += p.getTpdocumento() + p.getNdocumento() + p.getNombre() + p.getTelefono() + p.getCorreo() + p.getCiudad();
        //}
   // return base;
   // } 

