package DAO;

import Clases.Asesoria;
import Clases.Info;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AsesoriaDAO {

    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;

    public AsesoriaDAO() {
    }

    public boolean agregarAsesoria(Asesoria sce, String rut) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_ASESORIA(?,?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, sce.getProf_a_Cargo());
            cstmt.setDate(2, (Date) sce.getAses_Fecha_Ini());
            cstmt.setDate(3, (Date) sce.getAses_Fecha_Fin());
            cstmt.setString(4, sce.getEstado());
            cstmt.setInt(5, sce.getPrecio());
            cstmt.setInt(6, sce.getArea_Id_Area());
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
    
    public int verificarIDpago(String rut) throws SQLException {
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
    
    
    

    public boolean agregarAsesoriafk(Asesoria sce, int id_asesoriaafk, int id_contratoafk, int id_pagoo, int montototales) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_ASESORIAFK(?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, sce.getProf_a_Cargo());
            cstmt.setDate(2, (Date) sce.getAses_Fecha_Ini());
            cstmt.setDate(3, (Date) sce.getAses_Fecha_Fin());
            cstmt.setString(4, sce.getEstado());
            cstmt.setInt(5, sce.getPrecio());
            cstmt.setInt(6, sce.getArea_Id_Area());
            cstmt.setInt(7, id_asesoriaafk);
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

    public boolean agregarContratocfk(Asesoria sce, String pago_fechacfk, int pago_montocfk, String rutCFK, String cont_firma_clientecfk, String cont_fecha_iniciocfk, String cont_fecha_fincontratocfk,String StartDateNEW,String EndDateNEW,String CAP_StartDateNEW,String CAP_EndDateNEW) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_CONTRATOCFK(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, pago_fechacfk);
            cstmt.setInt(2, pago_montocfk);
            cstmt.setString(3, rutCFK);
            cstmt.setString(4, cont_firma_clientecfk);
            cstmt.setString(5, cont_fecha_iniciocfk);
            cstmt.setString(6, cont_fecha_fincontratocfk);
            cstmt.setDate(7, (Date) sce.getAses_Fecha_Ini());
            cstmt.setDate(8, (Date) sce.getAses_Fecha_Fin());
            cstmt.setString(9, sce.getEstado());
            cstmt.setInt(10, sce.getArea_Id_Area());
            cstmt.setString(11, StartDateNEW);
            cstmt.setString(12, EndDateNEW);
            cstmt.setString(13, CAP_StartDateNEW);
            cstmt.setString(14, CAP_EndDateNEW);

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

    public int obtenerPrecioPago(String rut) throws SQLException {
        int centinela = 0;
        String sql = "SELECT p.pago_monto FROM PAGO p JOIN orden_compra oc on oc.id_pago = p.id_pago JOIN contrato c on oc.id_orden_pago = c.id_orden_pago where c.rut_empresa = '" + rut + "'";

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

    
    
    
    
}
