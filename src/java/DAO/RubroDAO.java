/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Nicolas
 */
public class RubroDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //Buscar Rubro
    public String RubroID(int id) throws SQLException {
        String tipo = "";

        String sql = "select RUB_DESCRIPCION from RUBRO where ID_RUBRO = "+ id +" ";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                tipo = rs.getString("RUB_DESCRIPCION");
            }

        } catch (Exception e) {

        }
        return tipo;
    }
    
    
}
