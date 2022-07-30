/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;



import Clases.ClsCandidato;
import Clases.ClsMensaje;
import  Modelos.MdlCandidato;
import java.util.LinkedList;

/**
 *
 * @author leiner
 */
public class CtlCandidato {
       MdlCandidato modelocandidato;
   
       public   CtlCandidato (){
        this.modelocandidato = new MdlCandidato();
}
   
    public LinkedList <ClsCandidato> llamarcandidato (){
        LinkedList<ClsCandidato> listacandidatos = this.modelocandidato.llamarcandidato();
        return listacandidatos;
    }  
       
       
    public ClsMensaje agregarCandidato(ClsCandidato candidato){
        ClsMensaje mensaje = this.modelocandidato.agregarCandidato(candidato);
        return mensaje;
    }
    
    
    public ClsMensaje eliminarCandidato(String id) {

        ClsMensaje mensaje = this.modelocandidato.eliminarCandidato(id);

        return mensaje;
    }
        public ClsMensaje actualizarCandidato(ClsCandidato candidato) {

        ClsMensaje mensaje = this.modelocandidato.actualizarCandidato(candidato);

        return mensaje;
    }
        
         public ClsMensaje actualizarVotoCandidato(ClsCandidato candidato) {

        ClsMensaje mensaje = this.modelocandidato.actualizarVotoCandidato(candidato);

        return mensaje;
    }
    
    
    
    
    
}
