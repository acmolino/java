/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conectando;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 *
 * @author VERITON
 */
public class Consultas {
    
    public ResultSet devolverRegistros() throws Exception {
      String sql = "SELECT * FROM persona";
      Conexion db = Conexion.getInstancia();
      Connection conn = db.getConnection();
      Statement st = conn.createStatement();
      ResultSet rs = st.executeQuery(sql);
      conn.close();
      return rs;
    }
    
    public void IngresarDatos(String doc, String nombre) throws Exception {
       Conexion db = Conexion.getInstancia();
       Connection conn = db.getConnection();
       String sql = "INSERT INTO persona(doc, nombre) VALUES ('"+doc+"', '"+nombre+"')";
       PreparedStatement st = conn.prepareStatement(sql);
       st.executeUpdate();
       conn.close();
    }
    
}
