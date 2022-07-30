/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;
import Clases.ClsAdmin;
import Clases.ClsCandidato;
import Clases.ClsMensaje;
import Modelos.MdlAdmin;
import java.util.LinkedList;
/**
 *
 * @author leine
 */
public class CtlAdmin {
    MdlAdmin modeladorAdmin;
    
    public CtlAdmin(){
    this.modeladorAdmin = new MdlAdmin();
    }
    
        public LinkedList <ClsAdmin> llamarAdmin (){
        LinkedList<ClsAdmin> listaAdmin = this.modeladorAdmin.llamarAdmin();
        return listaAdmin;
    }  
        
        
        
        
      //  public ClsMensaje eliminarCandidato(String id){
        
        
      //  ClsMensaje mensaje = this.modelocandidato.eliminarCandidato(id);
        
       // return mensaje;
    //}
       
     //public ClsMensaje actualizarCandidato(ClsCandidato candidato) {

        //ClsMensaje mensaje = this.modeloCandidato.actualizarCandidato(candidato);

        //return mensaje;
    //}
    
    
}
