/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.Asesorias;
import Clases.Capacitaciones;
import Clases.Cliente;
import Clases.Contrato;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class ContratoDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    public ContratoDAO() {
    }
    
    //METODO PARA AGREGAR CONTRATO
    public boolean agregarContrato(Contrato sce) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_CONTRATO(?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, sce.getPago_fecha());
            cstmt.setInt(2, sce.getPago_monto());
            cstmt.setInt(3, sce.getId_plan());
            cstmt.setString(4, sce.getRut());
            cstmt.setString(5, sce.getCont_firma_cliente());
            cstmt.setString(6, sce.getCont_fecha_inicio());

            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Eror all guardar" + e.getMessage());

        } finally {
            this.con.close();
        }
        return centinela;
    }
    
    
    //METODO LISTAR Y RETORNAR UNA LISTA
    public List listarInfo(String rut){
        List<Contrato>lista= new ArrayList<>();
        String sql = "select CONT_FECHA_FIN,ID_PLANES,RUT_EMPRESA,CONT_FIRMA_CLIENTE,CONT_FECHA_INICIO from CONTRATO where RUT_EMPRESA = '"+ rut +"' ";
        try {
            int num = 1;
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Contrato c = new Contrato();
                c.setPago_fecha(rs.getString(1));
                c.setPago_monto(num);
                c.setId_plan(rs.getInt(2));
                c.setRut(rs.getString(3));
                c.setCont_firma_cliente(rs.getString(4));
                c.setCont_fecha_inicio(rs.getString(5));
                lista.add(c);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    
    //LISTAR TODO POR RUN EN EL CONTRATO
    public List listarAsesorias(String run){
        List<Asesorias>asesorias= new ArrayList<>();
        String sql = "Select a.ID_ASESORIA,a.PROF_A_CARGO,a.ASES_FECHA_INI,a.ASES_FECHA_FIN,a.ESTADO,a.PRECIO,a.ID_AREA from contrato c join ASESORIA_FK af on af.ID_CONTRATO=c.ID_CONTRATO join ASESORIA a on a.ID_ASESORIA=af.ID_ASESORIA where c.RUT_EMPRESA='"+run+"'";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asesorias a = new Asesorias();
                a.setId_asesoria(rs.getInt(1));
                a.setProf_a_cargo(rs.getString(2)); 
                a.setFecha_inicio(rs.getString(3));
                a.setFecha_fin(rs.getString(4));
                a.setEstado(rs.getString(5));
                a.setPrecio(rs.getInt(6));
                a.setId_area(rs.getInt(7));
                
                if(a.getProf_a_cargo() == null){
                    a.setProf_a_cargo("Sin asignar");
                }
               
                
                asesorias.add(a);
            }

        } catch (Exception e) {

        }
        return asesorias;
    }
    //LISTAR UNA ASESORIA POR ID
    public List listarAsesoriasUnico(String id){
        List<Asesorias>asesorias= new ArrayList<>();
        String sql = "Select a.ID_ASESORIA,a.PROF_A_CARGO,a.ASES_FECHA_INI,a.ASES_FECHA_FIN,a.ESTADO,a.PRECIO,a.ID_AREA from contrato c join ASESORIA_FK af on af.ID_CONTRATO=c.ID_CONTRATO join ASESORIA a on a.ID_ASESORIA=af.ID_ASESORIA where a.ID_ASESORIA='"+id+"'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asesorias a = new Asesorias();
                a.setId_asesoria(rs.getInt(1));
                a.setProf_a_cargo(rs.getString(2)); 
                a.setFecha_inicio(rs.getString(3));
                a.setFecha_fin(rs.getString(4));
                a.setEstado(rs.getString(5));
                a.setPrecio(rs.getInt(6));
                a.setId_area(rs.getInt(7));
                
                if(a.getProf_a_cargo() == null){
                    a.setProf_a_cargo("Sin asignar");
                }
               
                
                asesorias.add(a);
            }

        } catch (Exception e) {

        }
        return asesorias;
    }
    
    //LISTAR TODO POR RUN EN EL CONTRATO
    public List listarAsesoriaProf(String run){
        List<Asesorias>lista= new ArrayList<>();
        String sql = "select * from ASESORIA where PROF_A_CARGO = '"+run+"'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Asesorias c = new Asesorias();
                c.setId_asesoria(rs.getInt(1));
                c.setProf_a_cargo(rs.getString(2));
                c.setFecha_inicio(rs.getString(3));
                c.setFecha_fin(rs.getString(4));
                c.setEstado(rs.getString(5));
                c.setPrecio(rs.getInt(6));
                c.setId_area(rs.getInt(7));
                if(c.getProf_a_cargo() == null){
                    c.setProf_a_cargo("Sin asignar");
                }
                
                lista.add(c);
            }

        } catch (Exception e) {

        }
        return lista;
    }
    
    
    //LISTAR TODO POR RUN EN EL CONTRATO
    public List listarCapacitaciones(String run){
        List<Capacitaciones>capacitacion= new ArrayList<>();
        String sql = "select c.ID_CAPACITACION,c.PROFE_A_CARGO,c.CAP_FECHA_INI,c.CAP_FECHA_FIN,c.ESTADO,c.CAP_PRECIO,c.ID_AREA from CONTRATO ct join CAPACITACION_FK cf on cf.ID_CONTRATO=ct.ID_CONTRATO join CAPACITACION c on cf.id_capacitacion = c.ID_CAPACITACION where ct.RUT_EMPRESA='"+run+"'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Capacitaciones c = new Capacitaciones();
                c.setId_capa(rs.getInt(1));
                c.setProf_a_cargo(rs.getString(2));
                c.setFecha_inicio(rs.getString(3));
                c.setFecha_fin(rs.getString(4));
                c.setEstado(rs.getString(5));
                c.setPrecio(rs.getInt(6));
                c.setId_area(rs.getInt(7));
                
                if(c.getProf_a_cargo() == null){
                    c.setProf_a_cargo("Sin asignar");
                }

                capacitacion.add(c);
            }

        } catch (Exception e) {

        }
        return capacitacion;
    }
    
    //LISTAR TODO POR RUN EN EL CONTRATO
    public List listarCapacitacionesProf(String run){
        List<Capacitaciones>capacitacion= new ArrayList<>();
        String sql = "select * from CAPACITACION where PROFE_A_CARGO = '"+run+"'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Capacitaciones c = new Capacitaciones();
                c.setId_capa(rs.getInt(1));
                c.setProf_a_cargo(rs.getString(2));
                c.setFecha_inicio(rs.getString(3));
                c.setFecha_fin(rs.getString(4));
                c.setEstado(rs.getString(5));
                c.setPrecio(rs.getInt(6));
                c.setId_area(rs.getInt(7));
                if(c.getProf_a_cargo() == null){
                    c.setProf_a_cargo("Sin asignar");
                }
                
                capacitacion.add(c);
            }

        } catch (Exception e) {

        }
        return capacitacion;
    }
    
    //LISTAR UNA CAPACITACION POR ID
    public List listarCapacitacionesUnico(String id){
        List<Capacitaciones>capacitacion= new ArrayList<>();
        String sql = "select c.ID_CAPACITACION,c.PROFE_A_CARGO,c.CAP_FECHA_INI,c.CAP_FECHA_FIN,c.ESTADO,c.CAP_PRECIO,c.ID_AREA from CONTRATO ct join CAPACITACION_FK cf on cf.ID_CONTRATO=ct.ID_CONTRATO join CAPACITACION c on cf.id_capacitacion = c.ID_CAPACITACION where c.ID_CAPACITACION='"+id+"'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Capacitaciones c = new Capacitaciones();
                c.setId_capa(rs.getInt(1));
                c.setProf_a_cargo(rs.getString(2));
                c.setFecha_inicio(rs.getString(3));
                c.setFecha_fin(rs.getString(4));
                c.setEstado(rs.getString(5));
                c.setPrecio(rs.getInt(6));
                c.setId_area(rs.getInt(7));
                if(c.getProf_a_cargo() == null){
                    c.setProf_a_cargo("Sin asignar");
                }
                capacitacion.add(c);
            }

        } catch (Exception e) {

        }
        return capacitacion;
    }
    
    public int obtenerPrecioPago(String rut) throws SQLException {
        int centinela = 0;
        String sql = "SELECT p.pago_monto FROM PAGO p JOIN orden_compra oc on oc.id_pago = p.id_pago JOIN contrato c on oc.id_orden_pago = c.id_orden_pago where c.rut_empresa = '"+ rut +"'";

        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                centinela = rs.getInt(1);
            }

        } catch (Exception e) {
            System.out.println("Error al verificar el id del contrato :" + e.getMessage());
        } finally {
            //SIEMPRE cerrar la conexiÃ³n
            con.close();
        }

        return centinela;
    }
    
    public String transFecha(String fechaFull){
        String txt = fechaFull;
        String txt2 = txt;
        if(txt.length()==9){
            txt2 = txt.substring(0,3)+"0"+txt.substring(3,9);
        }

        String month = txt2.substring(3,5);
        String dia = txt2.substring(0,2);
        String anio = txt2.substring(8,10);
        
        String txtfull = dia+"/"+month+"/"+anio;
        return txtfull;
    }
}
