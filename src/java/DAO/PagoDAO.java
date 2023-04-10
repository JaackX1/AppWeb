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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author User
 */
public class PagoDAO {

    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    
    public PagoDAO() {
    }
    
    public int obtenerPrecioPago(String rut) throws SQLException {
        int centinela = 0;
        String sql = "SELECT p.pago_monto FROM PAGO p JOIN orden_compra oc on oc.id_pago = p.id_pago JOIN contrato c on oc.id_orden_pago = c.id_orden_pago where c.rut_empresa = '" + rut + "'";

        try {
            con = cn.obttenerrConexion();
            CallableStatement cstmt = this.con.prepareCall(sql);
            ResultSet rs = cstmt.executeQuery();
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

    public int obtenerIdPago(String rut) throws SQLException {
        int tipo = 0;

        try {
            con = cn.obttenerrConexion();
            String query = "SELECT p.id_pago FROM PAGO p JOIN orden_compra oc on oc.id_pago = p.id_pago JOIN contrato c on oc.id_orden_pago = c.id_orden_pago where c.rut_empresa = '" + rut + "'";
            CallableStatement cstmt = this.con.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                tipo = rs.getInt("ID_PAGO");
            }
        } catch (Exception e) {
            System.out.println("Error en actualizar contrato: " + e.getMessage());
        } finally {
            con.close();
        }
        return tipo;
    }
    
    //validar que no tenga un CHECKLIST CREADO
    public int verificarIdPago(String rut) throws SQLException{
        
        int verificacion = 0;
        
        String sql = "SELECT p.id_pago FROM PAGO p JOIN orden_compra oc on oc.id_pago = p.id_pago JOIN contrato c on oc.id_orden_pago = c.id_orden_pago where c.rut_empresa = '" + rut + "'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                verificacion = rs.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally{
            //SIEMPRE cerrar la conexión
            con.close();
        }
        
        return verificacion;
    }
    
    //validar que no tenga un CHECKLIST CREADO
    public int verificar(String rut) throws SQLException{
        
        int verificacion = 0;
        
        String sql = "SELECT id_pago FROM PAGO where pago_monto = '" + rut + "'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                verificacion = rs.getInt(1);
            }
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally{
            //SIEMPRE cerrar la conexión
            con.close();
        }
        
        return verificacion;
    }
    
    //validar que no tenga un CHECKLIST CREADO
    public String RescatarFechaPago(int id) throws SQLException{
        
        String verificacion = "";
        
        String sql = "SELECT PAGO_FECHA FROM PAGO where ID_PAGO = '" + id + "'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                verificacion = rs.getString(1);
            }
            
        } catch (Exception e) {
            System.out.println("Error :" + e.getMessage());
        } finally{
            //SIEMPRE cerrar la conexión
            con.close();
        }
        
        return verificacion;
    }
    
    
    //REGISTRAR HISTORIAL PAGO Y MODIFICAR PAGO
    public boolean registrarHistorialPago(String fecha_hoy, String fecha_nueva, int id_pag, int monto_total) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_HIST_PAGO(?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, fecha_hoy);
            cstmt.setString(2, fecha_nueva);
            cstmt.setInt(3, id_pag);
            cstmt.setInt(4, monto_total);
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
    
    public String sumarMeses(String FechaActual,int Cant_Mes) throws ParseException{
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yy");
        Date date1 = formatter1.parse(FechaActual);
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date1);
        calendar.add(Calendar.MONTH, Cant_Mes);
        
        String fecha_nueva = formatter1.format(calendar.getTime());
        return fecha_nueva;
    }
    
    public String ObtenerFechaHoy() throws ParseException{
        Date FechaActual = new Date();
        
        SimpleDateFormat formatter1=new SimpleDateFormat("dd/MM/yy");
        
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(FechaActual);
        
        String fecha_nueva = formatter1.format(calendar.getTime());
        return fecha_nueva;
    }
}
