/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;

/**
 *
 * @author leiner
 */
public class MdlCandidato {

    ClsJdbc jdbc;

    //MdlCandidato modelocandidato;
    public MdlCandidato() {
        this.jdbc = new ClsJdbc();
        this.jdbc.crearConexion();
    }

    public ClsMensaje eliminarCandidato(String id) {

        ClsMensaje mensaje;

        try {
            String sql = "DELETE FROM tbl_registro_candidato WHERE numeroCedula  = ?";

            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);
            sentencia.setString(1, id);

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                mensaje = new ClsMensaje(ClsMensaje.OK, "Has eliminado un cadidato exitosamente");
                return mensaje;
            }

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error: " + excepcion.getMessage());
            return mensaje;
        }

    }

    public ClsMensaje agregarCandidato(ClsCandidato candidato) {

        ClsMensaje mensaje;

        try {
            String sql = "INSERT INTO tbl_registro_candidato VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);
            sentencia.setString(1, candidato.getCedula());
            sentencia.setString(2, candidato.getNombre());
            sentencia.setString(3, candidato.getTelefono());
            sentencia.setString(4, candidato.getPartidoPoliticoCandidato());
            sentencia.setString(5, candidato.getCiudad());
            sentencia.setString(6, candidato.getBiografiaCandidato());
            sentencia.setString(7, candidato.getSmsCampana());
            sentencia.setString(8, candidato.getPropuestaCandidato());
            sentencia.setInt(9, candidato.getVoto());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                mensaje = new ClsMensaje(ClsMensaje.OK, "Has creado un cadidato exitosamente");
                return mensaje;
            }

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error: " + excepcion.getMessage());
            return mensaje;
        }

    }

    public LinkedList<ClsCandidato> llamarcandidato() {
        try {
            LinkedList<ClsCandidato> lista = new LinkedList<>();
            String cosulta = "SELECT * FROM tbl_registro_candidato";
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(cosulta);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String ndocumento = resultado.getString("numeroCedula");
                String nombre = resultado.getString("nombre");
                String telefono = resultado.getString("telefono");
                String partido = resultado.getString("partido");
                String ciudad = resultado.getString("ciudad");
                String biografia = resultado.getString("biografia");
                String campania = resultado.getString("smsCampana");
                String propuesta = resultado.getString("propuesta");
                int voto = resultado.getInt("voto");

                ClsCandidato candidato = new ClsCandidato(ndocumento, nombre, telefono, partido, ciudad, biografia, campania, propuesta, voto);

                lista.add(candidato);
            }

            return lista;
        } catch (Exception e) {
            return null;
        }
    }

    public ClsMensaje actualizarCandidato(ClsCandidato candidato) {

        ClsMensaje mensaje;

        try {
            String sql = "UPDATE tbl_registro_candidato SET nombre = ?, telefono = ?, "
                    + " partido = ?, ciudad = ?, biografia = ?, smsCampana = ?, propuesta = ?  WHERE numeroCedula   = ?";
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);

            sentencia.setString(1, candidato.getNombre());
            sentencia.setString(2, candidato.getTelefono());

            sentencia.setString(3, candidato.getPartidoPoliticoCandidato());
            sentencia.setString(4, candidato.getCiudad());
            sentencia.setString(5, candidato.getBiografiaCandidato());
            sentencia.setString(6, candidato.getSmsCampana());
            sentencia.setString(7, candidato.getPropuestaCandidato());

            sentencia.setString(8, candidato.getCedula());

            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                JOptionPane.showMessageDialog(null, "actualizado con exito");

            }

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(null, "Uy ocurrió un error: " + excepcion.getMessage());
            return null;
        }
    }
    
        public ClsMensaje actualizarVotoCandidato(ClsCandidato candidato) {

        ClsMensaje mensaje;

        try {
            String sql = "UPDATE tbl_registro_candidato SET voto = ?  WHERE numeroCedula   = ?"
                    ;
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);
           
            sentencia.setInt(1, candidato.getVoto());
            sentencia.setString(2, candidato.getCedula());


            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                JOptionPane.showMessageDialog(null, "Voto al candidato exitoso");
               
            }

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error con el voto al candidato");
            return mensaje;

        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(null, "Uy ocurrió un error: " + excepcion.getMessage());
            return null;
        }
    }
}
