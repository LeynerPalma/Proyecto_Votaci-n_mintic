/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author leiner
 */
public class ClsJdbc {
    
    String driver = "com.mysql.cj.jdbc.Driver";
    String user = "root";
    String password  = "";
    String bd = "db_votaciones_tic";
    String url = "jdbc:mysql://localhost:3306/" + this.bd;
    
    public Connection conexio;

    
    public void crearConexion() {
        try{
                Class.forName(driver);
                this.conexio = DriverManager.getConnection(url, user, password);
            
                if (this.conexio != null){
                        System.out.println("Conexión ok");
                }
                else{
                        System.out.println("Conexión ok");
                }
            
        }
        catch(Exception error){
                System.out.println("ocurrio un error:"+ error.getMessage());
        }

}
    
    
}
