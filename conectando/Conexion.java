/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectando;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author VERITON
 */
public class Conexion {
    private static Conexion instancia;
    
    private Connection con;
    private String driver;
    private String url;
    private String usuario;
    private String passwd;
    private String nombreBase;
    
    private Conexion(){
        nombreBase = "pruebas";
        driver = "org.mariadb.jdbc.Driver";
        url = "jdbc:mariadb://localhost:3306/"+nombreBase;
        usuario="root";
        passwd = "1234";
    }
    
    public static Conexion getInstancia(){
        if(instancia == null){
            instancia = new Conexion();
        }
        return instancia;
    }
    
    public Connection getConnection() throws Exception{
        Class.forName(driver);
        con = DriverManager.getConnection(url, usuario, passwd);
        return con;
    }
}
