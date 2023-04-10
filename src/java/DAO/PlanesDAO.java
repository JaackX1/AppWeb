/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Planes;
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
public class PlanesDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    
 
    
    public Planes listarId(int id) {
        String sql = "select * from PLANES where ID_PLANES="+id;
        Planes p = new Planes();
        try {
            con=cn.obttenerrConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setId_planes(rs.getInt(1));
                p.setPlan_nombre(rs.getString(2));
                p.setPlan_desc(rs.getString(3));
                p.setPlan_metros(rs.getString(4));
                p.setPlan_cant_prof(rs.getInt(5));
                p.setPlan_precio(rs.getInt(6));
            }
        } catch (Exception e) {

        }
        return p;
    }

    public List listar(){
        List<Planes>planes= new ArrayList<>();
        String sql = "select * from PLANES";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Planes p = new Planes();
                p.setId_planes(rs.getInt(1));
                p.setPlan_nombre(rs.getString(2));
                p.setPlan_desc(rs.getString(3));
                p.setPlan_metros(rs.getString(4));
                p.setPlan_cant_prof(rs.getInt(5));
                p.setPlan_precio(rs.getInt(6));
                planes.add(p);
            }

        } catch (Exception e) {

        }
        return planes;
    }
    
    public List listarNOMBRE(String nombreplan){
        List<Planes>planes= new ArrayList<>();
        String sql = "select * from PLANES where PLAN_NOMBRE = '"+nombreplan+"'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Planes p = new Planes();
                p.setId_planes(rs.getInt(1));
                p.setPlan_nombre(rs.getString(2));
                p.setPlan_desc(rs.getString(3));
                p.setPlan_metros(rs.getString(4));
                p.setPlan_cant_prof(rs.getInt(5));
                p.setPlan_precio(rs.getInt(6));
                planes.add(p);
            }

        } catch (Exception e) {

        }
        return planes;
    }
    
    public boolean modificarContratoPlan(int id_cont, int precio_nuevo, int id_pag, int id_plan_nuevo) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_MODIFICAR_PLANC(?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setInt(1, id_cont);
            cstmt.setInt(2, precio_nuevo);
            cstmt.setInt(3, id_pag);
            cstmt.setInt(4, id_plan_nuevo);
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Error all guardar" + e.getMessage());

        } finally {
            this.con.close();
        }
        return centinela;
    }
    
    

}
