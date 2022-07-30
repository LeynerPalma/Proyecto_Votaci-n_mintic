/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;
import Clases.ClsCandidato;
import Clases.ClsJdbc;
import Clases.ClsMensaje;
import Clases.ClsVotante;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;
import javax.swing.JOptionPane;



/**
 *
 * @author leine
 */
public class MdlVotante {
    
        ClsJdbc jdbc;
    
   

    public MdlVotante() {
        this.jdbc = new ClsJdbc();
        this.jdbc.crearConexion();
    }
    
    public ClsMensaje agregarVotante(ClsVotante votante) {

        ClsMensaje mensaje;

        try {
            String sql = "INSERT INTO tbl_registro_votante VALUES (?,?,?,?,?,?,?)";
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);
            sentencia.setString(1, votante.getCedula());
            sentencia.setString(2, votante.getNombre());
            sentencia.setString(3, votante.getTelefono());
            sentencia.setString(4, votante.getCorreo());
            sentencia.setString(5, votante.getCiudad());
            sentencia.setString(6, votante.getCotrasena());
            sentencia.setInt(7, votante.getEstado());


            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {
                JOptionPane.showMessageDialog(null, "Votante agregado con exito");
                return null;
            }
            return null;



        } catch (Exception excepcion) {
            
            JOptionPane.showMessageDialog(null, "Uy ocurrió un error: " + excepcion.getMessage());
           
           return null;
              }

    }
 
    public LinkedList <ClsVotante> llamarVotante (){    
        try{
                LinkedList <ClsVotante> lista = new LinkedList<>();
                String cosulta = "SELECT * FROM tbl_registro_votante";
                PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(cosulta);
                ResultSet  resultado = sentencia.executeQuery();
                
                while (resultado.next()){
                        String ncedula = resultado.getString("ncedula");
                        String nombre = resultado.getString("nombre");
                        String telefono = resultado.getString("telefono");
                        String correo =  resultado.getString("correo");
                        String ciudad = resultado.getString("ciudad");
                        String contrasena = resultado.getString("contrasena");
                        int estado = resultado.getInt("estado");

            
                        ClsVotante votante = new ClsVotante(ncedula, nombre, telefono, correo, ciudad, contrasena, estado);
                        
                        lista.add(votante);
                }
                

                return  lista;    
        }  
        catch (Exception e){
            
            System.out.println("problemon en la consulta");
                return null;
        }
    }
        
     public ClsMensaje eliminarVotante(String id) {

        ClsMensaje mensaje;

        try {
            String sql = "DELETE FROM tbl_registro_votante WHERE ncedula  = ?";
            
            
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
   
    public ClsMensaje actualizarVotante(ClsVotante votante) {

        ClsMensaje mensaje;

        try {
            String sql = "UPDATE tbl_registro_votante SET nombre = ?, telefono = ?, " +
                    " correo = ?, ciudad = ?  WHERE ncedula  = ?"
                    ;
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);
           
            sentencia.setString(1, votante.getNombre());
            sentencia.setString(2, votante.getTelefono());
            sentencia.setString(3, votante.getCorreo());
            sentencia.setString(4, votante.getCiudad());
            
            sentencia.setString(5, votante.getCedula());


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
    
    
    
    public ClsMensaje actualizarVoto(ClsVotante votante) {

        ClsMensaje mensaje;

        try {
            String sql = "UPDATE tbl_registro_votante SET estado = ?  WHERE ncedula  = ?"
                    ;
            PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(sql);
           
            sentencia.setInt(1, votante.getEstado());
            sentencia.setString(2, votante.getCedula());


            int resultado = sentencia.executeUpdate();

            if (resultado >= 1) {

                JOptionPane.showMessageDialog(null, "Su voto está registrado");
               
            }

            mensaje = new ClsMensaje(ClsMensaje.ERROR, "Uy ocurrió un error");
            return mensaje;

        } catch (Exception excepcion) {
            JOptionPane.showMessageDialog(null, "Uy ocurrió un error: " + excepcion.getMessage());
            return null;
        }
    }
        
    }
  
    