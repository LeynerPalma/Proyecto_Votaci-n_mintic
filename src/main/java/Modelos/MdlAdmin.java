/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Clases.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.LinkedList;

/**
 *
 * @author leine
 */
public class MdlAdmin {
      ClsJdbc jdbc;
       
    public MdlAdmin() {
        this.jdbc = new ClsJdbc();
        this.jdbc.crearConexion();
    }
      
      
      
      
      
         public LinkedList <ClsAdmin> llamarAdmin (){    
                try{
                        LinkedList <ClsAdmin> lista = new LinkedList<>();
                        String cosulta = "SELECT * FROM tbl_user_admin";
                        PreparedStatement sentencia = this.jdbc.conexio.prepareStatement(cosulta);
                        ResultSet  resultado = sentencia.executeQuery();

                        while (resultado.next()){
                                String user = resultado.getString("cedula");
                                String contrasena = resultado.getString("contrasena");


                                ClsAdmin admin = new ClsAdmin(user, contrasena);

                                lista. add(admin);
                        }

                        return  lista;    
                }  
                catch (Exception e){
                        return null;
        }
         
         
        }

}
