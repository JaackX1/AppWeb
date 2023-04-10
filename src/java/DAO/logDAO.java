/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
/**
 *
 * @author User
 */
public class logDAO {
    
    private Connection con;

    public logDAO() {
    }
    
    //iniciar sesion
    public int Login(String correo, String password) throws SQLException {
        int tipo = 0;

        try {
            this.con = new Conexion.Conexion().obttenerrConexion();

            String llamada = "select TIPO_CLASE from LOG_IN where " + "NOMBRE_USUARIO='" + correo + "' and " + "CONTRASENIA='" + password + "'";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            ResultSet rs = cstmt.executeQuery();
            while (rs.next()) {
                tipo = rs.getInt("TIPO_CLASE");
                
            }
        } catch (Exception e) {
            System.out.println("ERROR EN LOGIN DE CORREO :" + e.getMessage());
        } finally {
            this.con.close();
        }
        return tipo;
    }
    
}
