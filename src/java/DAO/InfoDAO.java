/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Info;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class InfoDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public InfoDAO() {
    }
    
    public List solicitarInfo(String rut) throws SQLException {
        List<Info>lista= new ArrayList<>();

        try {
            con = cn.obttenerrConexion();
            String query = "select p.id_pago,p.pago_monto,c.id_contrato from pago p join orden_compra oc on oc.id_pago=p.id_pago join contrato c on oc.id_orden_pago=c.id_orden_pago where c.rut_empresa = '"+rut+"'";
            CallableStatement cstmt = this.con.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                Info p = new Info();
                p.setId_pago(rs.getInt(1));
                p.setPago_monto(rs.getInt(2));
                p.setId_contrato(rs.getInt(3));
                lista.add(p);
            }
        } catch (Exception e) {
            System.out.println("Error en pedir info : " + e.getMessage());
        } finally {
            this.con.close();
        }
        return lista;
    }
    
}
