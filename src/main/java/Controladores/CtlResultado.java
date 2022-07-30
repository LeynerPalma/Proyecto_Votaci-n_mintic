/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controladores;

import Clases.ClsCandidato;
import Clases.ClsResultado;
import Modelos.MdlResultado;
import java.util.LinkedList;

/**
 *
 * @author leine
 */
public class CtlResultado {
    MdlResultado modeloresultado;

    public  CtlResultado(){
        this.modeloresultado = new MdlResultado();
    }
    
        public LinkedList <ClsResultado> llamarResultado (){
        LinkedList<ClsResultado> listaresultados = this.modeloresultado.llamarResultado();
        return listaresultados;
    } 
    
    
    
}
