/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Persona;
import Conexion.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nicolas
 */
public class PersonaDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public List listarInfo(String run){
        List<Persona>lista= new ArrayList<>();
        String sql = "select * from PERSONA where RUN = '"+ run +"' ";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                p.setRUN(rs.getString(1));
                p.setPER_P_NOMBRE(rs.getString(2));
                p.setPER_S_NOMBRE(rs.getString(3));
                p.setPER_P_APELLIDO(rs.getString(4));
                p.setPER_S_APELLIDO(rs.getString(5));
                p.setPER_TELEFONO(rs.getInt(6));
                p.setPER_CORREO(rs.getString(7));
                p.setPER_FECHA_NAC(rs.getString(8));
                p.setDIRECCION(rs.getString(9));
                p.setID_NACIONALIDAD(rs.getInt(10));
                p.setID_SEXO(rs.getInt(11));
                p.setID_CARGO(rs.getInt(12));
                p.setID_CLASE_PERS(rs.getInt(13));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    public List listarAll(){
        List<Persona>lista= new ArrayList<>();
        String sql = "select * from PERSONA where ID_CLASE_PERS=3";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Persona p = new Persona();
                p.setRUN(rs.getString(1));
                p.setPER_P_NOMBRE(rs.getString(2));
                p.setPER_S_NOMBRE(rs.getString(3));
                p.setPER_P_APELLIDO(rs.getString(4));
                p.setPER_S_APELLIDO(rs.getString(5));
                p.setPER_TELEFONO(rs.getInt(6));
                p.setPER_CORREO(rs.getString(7));
                p.setPER_FECHA_NAC(rs.getString(8));
                p.setDIRECCION(rs.getString(9));
                p.setID_NACIONALIDAD(rs.getInt(10));
                p.setID_SEXO(rs.getInt(11));
                p.setID_CARGO(rs.getInt(12));
                p.setID_CLASE_PERS(rs.getInt(13));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    
    public Persona listarIdInfo(String run) {
        String sql = "select * from PERSONA where RUN= '"+run+"' ";
        Persona p = new Persona();
        try {
            con=cn.obttenerrConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setRUN(rs.getString(1));
                p.setPER_P_NOMBRE(rs.getString(2));
                p.setPER_S_NOMBRE(rs.getString(3));
                p.setPER_P_APELLIDO(rs.getString(4));
                p.setPER_S_APELLIDO(rs.getString(5));
                p.setPER_TELEFONO(rs.getInt(6));
                p.setPER_CORREO(rs.getString(7));
                p.setPER_FECHA_NAC(rs.getString(8));
                p.setDIRECCION(rs.getString(9));
                p.setID_NACIONALIDAD(rs.getInt(10));
                p.setID_SEXO(rs.getInt(11));
                p.setID_CARGO(rs.getInt(12));
                p.setID_CLASE_PERS(rs.getInt(13));
            }
        } catch (Exception e) {

        }
        return p;
    }
}
