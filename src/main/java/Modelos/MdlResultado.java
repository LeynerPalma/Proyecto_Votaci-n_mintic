/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsResultado;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author leine
 */
public class MdlResultado {
    ClsJdbc jdbc;

    public MdlResultado() {
        this.jdbc = new ClsJdbc();
        this.jdbc.crearConexion();
    }
    
     public LinkedList<ClsResultado> llamarResultado() {
        try {
            LinkedList<ClsResultado> lista = new LinkedList<>();
            String cosulta = "SELECT * FROM tbl_registro_candidato";
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(cosulta);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String nombre = resultado.getString("nombre");
                String partido = resultado.getString("partido");
                int voto = resultado.getInt("voto");
                ClsResultado votos = new ClsResultado(nombre, partido, voto);

                lista.add(votos);
            }

            return lista;
        } catch (Exception e) {
            return null;
        }
    }
    
    
    
    
    
    
}