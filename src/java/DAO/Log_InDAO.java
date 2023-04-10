
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Log_InDAO {
    private Connection con;

    public Log_InDAO() {
    }
    
    
    //método para iniciar sesion
    
    public int Login(String Nombre_usuario, String Contrasenia) throws SQLException{
        int tipo = 0;
        
        try {
            this.con = new Conexion.Conexion().obttenerrConexion();
            String query = "SELECT tipo_clase from Log_in WHERE "+ "nombre_usuario = '"+Nombre_usuario+"'  "+ "AND contrasenia = '"+Contrasenia+"'  ";
            CallableStatement cstmt = this.con.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();
            
            while (rs.next()){
                tipo = rs.getInt("tipo_clase");
            }
        } catch (Exception e) {
            System.out.println("Error en login"+e.getMessage());
        } finally {
            this.con.close();
        }
        return tipo;
    }
    

}

    