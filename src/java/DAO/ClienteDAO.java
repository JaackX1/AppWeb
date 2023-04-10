/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Cliente;
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
public class ClienteDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    //METODO LISTAR Y RETORNAR UNA LISTA
    public List listarInfo(String rut){
        List<Cliente>lista= new ArrayList<>();
        String sql = "select * from CLIENTE_EMPRESA where rut_empresa = '"+ rut +"' ";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente p = new Cliente();
                p.setRUT_EMPRESA(rs.getString(1));
                p.setEMPR_NOMBRE(rs.getString(2));
                p.setEMPR_DIRECCION(rs.getString(3));
                p.setEMPR_TELEFONO(rs.getInt(4));
                p.setEMPR_CORREO(rs.getString(5));
                p.setID_RUBRO(rs.getInt(6));
                p.setID_CLASE_PERS(rs.getInt(7));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    
    //METODO LISTAR Y RETORNAR UNA LISTA SI EL CLIENTE TIENE UN CONTRATO 
    public List listarContrat(){
        List<Cliente>lista= new ArrayList<>();
        String sql = "Select ce.RUT_EMPRESA,ce.EMPR_NOMBRE,ce.EMPR_DIRECCION,ce.EMPR_TELEFONO,ce.EMPR_CORREO,ce.ID_RUBRO,ce.ID_CLASE_PERS from CLIENTE_EMPRESA ce join Contrato c on ce.RUT_EMPRESA=c.RUT_EMPRESA where c.CONT_ESTADO = 'Activo'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente p = new Cliente();
                p.setRUT_EMPRESA(rs.getString(1));
                p.setEMPR_NOMBRE(rs.getString(2));
                p.setEMPR_DIRECCION(rs.getString(3));
                p.setEMPR_TELEFONO(rs.getInt(4));
                p.setEMPR_CORREO(rs.getString(5));
                p.setID_RUBRO(rs.getInt(6));
                p.setID_CLASE_PERS(rs.getInt(7));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    
    
    //METODO LISTAR Y RETORNAR UNA CLASE
    public Cliente listarIdInfo(String rut) {
        String sql = "select * from CLIENTE_EMPRESA where rut_empresa= '"+rut+"' ";
        Cliente p = new Cliente();
        try {
            con=cn.obttenerrConexion();
            ps=con.prepareStatement(sql);
            rs=ps.executeQuery();
            while (rs.next()){
                p.setRUT_EMPRESA(rs.getString(1));
                p.setEMPR_NOMBRE(rs.getString(2));
                p.setEMPR_DIRECCION(rs.getString(3));
                p.setEMPR_TELEFONO(rs.getInt(4));
                p.setEMPR_CORREO(rs.getString(5));
                p.setID_RUBRO(rs.getInt(6));
                p.setID_CLASE_PERS(rs.getInt(7));
            }
        } catch (Exception e) {

        }
        return p;
    }
    
    //METODO LISTAR POR PROFESIONAL ASIGNADO Y CONTRATO FIRMADO
    public List listarProfCont(String run){
        List<Cliente>lista= new ArrayList<>();
        String sql = "select ce.RUT_EMPRESA,ce.EMPR_NOMBRE,ce.EMPR_DIRECCION,ce.EMPR_TELEFONO,ce.EMPR_CORREO,ce.ID_RUBRO,ce.ID_CLASE_PERS from CLIENTE_EMPRESA ce join contrato c on ce.RUT_EMPRESA=c.RUT_EMPRESA where c.CONT_FIRMA_CLIENTE = 'Firmado' AND c.ID_CONTRATO IN (Select id_contrat from asignacion_contrato where id_prof = '"+run+"')";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente p = new Cliente();
                p.setRUT_EMPRESA(rs.getString(1));
                p.setEMPR_NOMBRE(rs.getString(2));
                p.setEMPR_DIRECCION(rs.getString(3));
                p.setEMPR_TELEFONO(rs.getInt(4));
                p.setEMPR_CORREO(rs.getString(5));
                p.setID_RUBRO(rs.getInt(6));
                p.setID_CLASE_PERS(rs.getInt(7));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista; 
    }
    
    
    //METODO BUSCAR POR ID DE VISITA
    public List listarIdVisita(String id){
        List<Cliente>lista= new ArrayList<>();
        String sql = "select ce.RUT_EMPRESA,ce.EMPR_NOMBRE,ce.EMPR_DIRECCION,ce.EMPR_TELEFONO,ce.EMPR_CORREO,ce.ID_RUBRO,ce.ID_CLASE_PERS from asesoria a join ASESORIA_FK af on af.ID_ASESORIA=a.ID_ASESORIA join CONTRATO c on C.id_contrato = af.id_contrato join CLIENTE_EMPRESA ce on ce.rut_empresa = c.RUT_EMPRESA where a.ID_ASESORIA='"+id+"'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente p = new Cliente();
                p.setRUT_EMPRESA(rs.getString(1));
                p.setEMPR_NOMBRE(rs.getString(2));
                p.setEMPR_DIRECCION(rs.getString(3));
                p.setEMPR_TELEFONO(rs.getInt(4));
                p.setEMPR_CORREO(rs.getString(5));
                p.setID_RUBRO(rs.getInt(6));
                p.setID_CLASE_PERS(rs.getInt(7));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista; 
    }
    
    //METODO BUSCAR POR ID DE VISITA
    public List listarIdCapacitacion(String id){
        List<Cliente>lista= new ArrayList<>();
        String sql = "select ce.RUT_EMPRESA,ce.EMPR_NOMBRE,ce.EMPR_DIRECCION,ce.EMPR_TELEFONO,ce.EMPR_CORREO,ce.ID_RUBRO,ce.ID_CLASE_PERS from capacitacion c join CAPACITACION_FK cf on cf.ID_CAPACITACION=c.ID_CAPACITACION join CONTRATO ct on ct.id_contrato = cf.ID_CONTRATO join CLIENTE_EMPRESA ce on ct.rut_empresa = ce.RUT_EMPRESA where c.ID_CAPACITACION='"+id+"'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Cliente p = new Cliente();
                p.setRUT_EMPRESA(rs.getString(1));
                p.setEMPR_NOMBRE(rs.getString(2));
                p.setEMPR_DIRECCION(rs.getString(3));
                p.setEMPR_TELEFONO(rs.getInt(4));
                p.setEMPR_CORREO(rs.getString(5));
                p.setID_RUBRO(rs.getInt(6));
                p.setID_CLASE_PERS(rs.getInt(7));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista; 
    }
    
    
}
