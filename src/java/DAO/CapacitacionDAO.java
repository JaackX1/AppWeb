package DAO;

import Clases.Capacitacion;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class CapacitacionDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public CapacitacionDAO() {

    }

    public boolean agregarCapacitacion(Capacitacion sce, String rut) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_CAPACITACION(?,?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, sce.getProfe_a_Cargo());
            cstmt.setDate(2, (Date) sce.getCap_Fecha_Ini());
            cstmt.setDate(3, (Date) sce.getCap_Fecha_Fin());
            cstmt.setString(4, sce.getEstado());
            cstmt.setInt(5, sce.getCap_Precio());
            cstmt.setInt(6, sce.getId_Area());
            cstmt.setString(7, rut);

            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Error al guardar" + e.getMessage());

        } finally {
            this.con.close();
        }
        return centinela;
    }

    public int verificarContrato(String rut) throws SQLException {
        int tipo = 0;

        try {
            con = cn.obttenerrConexion();
            String query = "SELECT ID_CONTRATO FROM CONTRATO WHERE RUT_EMPRESA = '" + rut + "'";
            CallableStatement cstmt = this.con.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                tipo = rs.getInt("ID_CONTRATO");
            }
        } catch (Exception e) {
            System.out.println("Error en actualizar contrato: " + e.getMessage());
        } finally {
            this.con.close();
        }
        return tipo;
    }

    public boolean agregarPagoTotal(int id_pago, int pago_monto) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_MODIFICAR_PAGO(?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setInt(1, id_pago);
            cstmt.setInt(2, pago_monto);

            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("Error al guardar" + e.getMessage());

        } finally {
            this.con.close();
        }
        return centinela;
    }

    //METODO SI YA TIENE UN CONTRATO
    public boolean agregarCapacitacionfk(Capacitacion sce, int id_capacitacionafk, int id_contratoafk, int id_pagoo, int montototales) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_CAPACITACIONCFK(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, sce.getProfe_a_Cargo());
            cstmt.setDate(2, (Date) sce.getCap_Fecha_Ini());
            cstmt.setDate(3, (Date) sce.getCap_Fecha_Fin());
            cstmt.setString(4, sce.getEstado());
            cstmt.setInt(5, sce.getCap_Precio());
            cstmt.setInt(6, sce.getId_Area());
            cstmt.setInt(7, id_capacitacionafk);
            cstmt.setInt(8, id_contratoafk);
            cstmt.setInt(9, id_pagoo);
            cstmt.setInt(10, montototales);

            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("Error al guardar" + e.getMessage());

        } finally {
            this.con.close();
        }
        return centinela;
    }

    //validar que no tenga un CHECKLIST CREADO
    public int obtenerRutCliente(String rut) throws SQLException {
        int centinela = 0;
        String sql = "select id_contrato from contrato where rut_empresa = '" + rut + "'";

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

    public boolean agregarContratocapfk(Capacitacion sce, String pago_fechacapfk, int pago_montocapfk, String rutcapFK, String cont_firma_clientecapfk, String cont_fecha_iniciocapfk, String cont_fecha_fincontratocapfk, String StartDateNEW, String EndDateNEW, String CAP_StartDateNEW, String CAP_EndDateNEW) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_CONTRATOCFK2(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, pago_fechacapfk);
            cstmt.setInt(2, pago_montocapfk);
            cstmt.setString(3, rutcapFK);
            cstmt.setString(4, cont_firma_clientecapfk);
            cstmt.setString(5, cont_fecha_iniciocapfk);
            cstmt.setString(6, cont_fecha_fincontratocapfk);
            cstmt.setDate(7, (Date) sce.getCap_Fecha_Ini());
            cstmt.setDate(8, (Date) sce.getCap_Fecha_Fin());
            cstmt.setString(9, sce.getEstado());
            cstmt.setInt(10, sce.getId_Area());
            cstmt.setString(11, StartDateNEW);
            cstmt.setString(12, EndDateNEW);
            cstmt.setString(13, CAP_StartDateNEW);
            cstmt.setString(14, CAP_EndDateNEW);

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

    public int obtenerPrecioPago(String rut) throws SQLException {
        int tipo = 0;

        try {
            con = cn.obttenerrConexion();
            String query = "SELECT p.pago_monto FROM PAGO p JOIN orden_compra oc on oc.id_pago = p.id_pago JOIN contrato c on oc.id_orden_pago = c.id_orden_pago where c.rut_empresa = '" + rut + "'";
            CallableStatement cstmt = con.prepareCall(query);
            ResultSet rs = cstmt.executeQuery();

            while (rs.next()) {
                tipo = rs.getInt(1);

            }
        } catch (Exception e) {
            System.out.println("Error en actualizar contrato: " + e.getMessage());
        } finally {
            this.con.close();
        }
        return tipo;
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
            this.con.close();
        }
        return tipo;
    }
    
    public String transFecha(String fechaFull){
        String txt = fechaFull;
        String txt2 = txt;
        if(txt.length()==9){
            txt2 = txt.substring(0,5)+"0"+txt.substring(5,9);
        }

        String month = txt2.substring(5,7);
        String dia = txt2.substring(8,10);
        String anio = txt2.substring(2,4);
        
        String txtfull = dia+"/"+month+"/"+anio;
        return txtfull;
    }

}
