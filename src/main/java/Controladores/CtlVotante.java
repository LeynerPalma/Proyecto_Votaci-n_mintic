/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsAdmin;
import Clases.ClsCandidato;
import Clases.ClsVotante;
import Clases.ClsMensaje;
import Modelos.MdlVotante;
import java.util.LinkedList;
/**
 *
 * @author leiner
 */
public class CtlVotante {
    
    MdlVotante modeloVotante;
    
    public CtlVotante(){
    this.modeloVotante = new MdlVotante();
    }
    
   public LinkedList <ClsVotante> llamarVotante (){
       LinkedList<ClsVotante> listaVotante = this.modeloVotante.llamarVotante();
       return listaVotante;
   }  
    
    
 
    
    public ClsMensaje agregarVotante (ClsVotante votante){
        ClsMensaje mensaje = this.modeloVotante.agregarVotante(votante);
        return mensaje;
    }
    public LinkedList <ClsVotante> llamarvotante (){
        LinkedList<ClsVotante> listavotantes = this.modeloVotante.llamarVotante();
        return listavotantes;
    }  
     public LinkedList <ClsVotante> enviarvotante (){
        LinkedList<ClsVotante> listavotantes = this.modeloVotante.llamarVotante();
        return listavotantes;
    }  
       
    
    public ClsMensaje actualizarVotante(ClsVotante votante) {

        ClsMensaje mensaje = this.modeloVotante.actualizarVotante(votante);

        return mensaje;
    }
    
    
     public ClsMensaje actualizarVoto(ClsVotante votante) {

        ClsMensaje mensaje = this.modeloVotante.actualizarVoto(votante);

        return mensaje;
    }
      public ClsMensaje eliminarVotante(String id) {

        ClsMensaje mensaje = this.modeloVotante.eliminarVotante(id);

        return mensaje;
    }
       
}
