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
public class ClsCandidato extends ClsPersona{
    
    private String partidoPoliticoCandidato;
    private String biografiaCandidato;
    private String smsCampana;
    private String propuestaCandidato;
    private int voto;

    public ClsCandidato(String cedula, String nombre, 
            String telefono,String partidoPoliticoCandidato,  String ciudad, String biografiaCandidato, 
            String smsCampana, String propuestaCandidato, int voto) {
        super(cedula, nombre, telefono, ciudad);
        this.partidoPoliticoCandidato = partidoPoliticoCandidato;
        this.biografiaCandidato = biografiaCandidato;
        this.smsCampana = smsCampana;
        this.propuestaCandidato = propuestaCandidato;
        this.voto =voto;
    }

    public int getVoto() {
        return voto;
    }

    public void setVoto(int voto) {
        this.voto = voto;
    }

    public String getPartidoPoliticoCandidato() {
        return partidoPoliticoCandidato;
    }

    public void setPartidoPoliticoCandidato(String partidoPoliticoCandidato) {
        this.partidoPoliticoCandidato = partidoPoliticoCandidato;
    }

    public String getBiografiaCandidato() {
        return biografiaCandidato;
    }

    public void setBiografiaCandidato(String biografiaCandidato) {
        this.biografiaCandidato = biografiaCandidato;
    }

    public String getSmsCampana() {
        return smsCampana;
    }

    public void setSmsCampana(String smsCampana) {
        this.smsCampana = smsCampana;
    }

    public String getPropuestaCandidato() {
        return propuestaCandidato;
    }

    public void setPropuestaCandidato(String propuestaCandidato) {
        this.propuestaCandidato = propuestaCandidato;
    }


    
    
    
    

  


    





    
}
