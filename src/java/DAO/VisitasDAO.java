/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Clases.ObsMej;
import Clases.ObsMejResp;
import Clases.VisitaProf;
import Clases.respCheck;
import Conexion.Conexion;
import Clases.Visitas;
import Clases.Visitass;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
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
public class VisitasDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    //LISTAR TODO
    public List listar(){
        List<Visitas>planes= new ArrayList<>();
        String sql = "select * from Visita";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Visitas p = new Visitas();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));                
                p.setDescripcion(rs.getString(3));
                p.setFecha_ini(rs.getDate(4));
                p.setFecha_ter(rs.getDate(5));
                p.setId_estado(rs.getInt(6));/*
                
                String Start = p.getStart_date();
                String Start2 = Start.substring(0,10);
                p.setStart_date(Start2);
                
                String End = p.getEnd_date();
                String End2 = End.substring(0,10);
                p.setEnd_date(End2);*/
                
                planes.add(p);
            }

        } catch (Exception e) {

        }
        return planes;
    }
    
    //LISTAR TODO POR RUN EN EL CONTRATO
    public List listarContrat(String run){
        List<Visitas>planes= new ArrayList<>();
        String sql = "select v.ID_VISITA,v.NOMBRE,v.DESCRIPCION,v.FECHA_INI,v.FECHA_TER,v.ID_ESTADO,v.ID_OBSERVACIONES from Visita v join VISITA_FK vf on v.ID_VISITA=vf.ID_VISITA join CONTRATO c on c.ID_CONTRATO=vf.ID_CONTRATO where c.RUT_EMPRESA='"+run+"'";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Visitas p = new Visitas();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));                
                p.setDescripcion(rs.getString(3));
                p.setFecha_ini(rs.getDate(4));
                p.setFecha_ter(rs.getDate(5));
                p.setId_estado(rs.getInt(6));
                planes.add(p);
            }

        } catch (Exception e) {

        }
        return planes;
    }
    
    //LISTAR VISITA POR ID DE VISITA
    public List listarVisitaId(String id){
        List<Visitas>visitas= new ArrayList<>();
        String sql = "select * from visita where id_visita = '"+id+"'";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Visitas v = new Visitas();
                v.setId(rs.getInt(1));
                v.setNombre(rs.getString(2));                
                v.setDescripcion(rs.getString(3));
                v.setFecha_ini(rs.getDate(4));
                v.setFecha_ter(rs.getDate(5));
                v.setId_estado(rs.getInt(6));
                visitas.add(v);
            }

        } catch (Exception e) {

        }
        return visitas;
    }
    
    
    //LISTAR POR PROCEDIMIENTO ALMACENADO
    public List listarRun(String run){
        List<Visitas>planes= new ArrayList<>();
        String sql = "select V.ID_VISITA,V.NOMBRE,V.DESCRIPCION,V.FECHA_INI,V.FECHA_TER,V.ID_ESTADO from visita V join HIST_PROFESIONAL HP on V.ID_VISITA=HP.ID_VISITA where HP.RUN = '"+run+"' ";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Visitas p = new Visitas();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));                
                p.setDescripcion(rs.getString(3));
                p.setFecha_ini(rs.getDate(4));
                p.setFecha_ter(rs.getDate(5));
                p.setId_estado(rs.getInt(6));/*
                
                String Start = p.getStart_date();
                String Start2 = Start.substring(0,10);
                p.setStart_date(Start2);
                
                String End = p.getEnd_date();
                String End2 = End.substring(0,10);
                p.setEnd_date(End2);*/
                
                planes.add(p);
            }

        } catch (Exception e) {

        }
        return planes;
    }
    
    //LISTAR POR PROCEDIMIENTO ALMACENADO
    public List listarRunAsignado(String run){
        List<VisitaProf>planes= new ArrayList<>();
        String sql = "select v.ID_VISITA,v.NOMBRE,v.DESCRIPCION,v.FECHA_INI,v.FECHA_TER,v.ID_ESTADO,v.ID_OBSERVACIONES from visita v join VISITA_FK vf on vf.id_visita = v.ID_VISITA join CONTRATO c on vf.id_contrato = c.ID_CONTRATO where c.ID_CONTRATO in (select ID_CONTRAT from ASIGNACION_CONTRATO where ID_PROF = '"+run+"')";
        
        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                VisitaProf p = new VisitaProf();
                p.setId(rs.getInt(1));
                p.setNombre(rs.getString(2));                
                p.setDescripcion(rs.getString(3));
                p.setFecha_ini(rs.getString(4));
                p.setFecha_ter(rs.getString(5));
                p.setId_estado(rs.getInt(6));
                p.setId_observaciones(rs.getInt(6));
                
                planes.add(p);
            }

        } catch (Exception e) {

        }
        return planes;
    }
    
    
    //Agregar CON CLASE VISITA
    public boolean agregarVisita(Visitas visitas) throws SQLException {

        boolean centinela = false;

        try {

            //abrir conexión
            con = cn.obttenerrConexion();

            //Creamos la llamada al procedimiento
            String llamada = "{ call SP_REGISTRAR_VISITA(?,?,?,?,?)}";

            //Crear CallableStatement que permite ejecutar script en la BD
            CallableStatement cstmt = con.prepareCall(llamada);

            //Pasar los parametros del libro
            cstmt.setString(1, visitas.getNombre());
            cstmt.setString(2, visitas.getDescripcion());
            cstmt.setDate(3, (Date) visitas.getFecha_ini());
            cstmt.setDate(4, (Date) visitas.getFecha_ter());
            cstmt.setInt(5, visitas.getId_estado());

            //Ejecutar el Cstmt - 1 Algo se guarda / 0 o - No se guardo nada
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Error al agregar CALENDARIO :" + e.getMessage());

        } finally {

            //SIEMPRE cerrar la conexión
            con.close();
        }

        return centinela;

    }
    
    //Agregar CON CLASE VISITA
    public boolean agregarVisita2(Visitass visitas) throws SQLException {

        boolean centinela = false;

        try {

            //abrir conexión
            con = cn.obttenerrConexion();

            //Creamos la llamada al procedimiento
            String llamada = "{ call SP_REGISTRAR_VISITA2(?,?,?,?,?,?,?)}";

            //Crear CallableStatement que permite ejecutar script en la BD
            CallableStatement cstmt = con.prepareCall(llamada);

            //Pasar los parametros del libro
            cstmt.setString(1, visitas.getNombre());
            cstmt.setString(2, visitas.getDescripcion());
            cstmt.setDate(3, (Date) visitas.getFecha_ini());
            cstmt.setDate(4, (Date) visitas.getFecha_ter());
            cstmt.setInt(5, visitas.getId_estado());
            cstmt.setString(6, visitas.getRun());
            cstmt.setString(7, visitas.getRut());

            //Ejecutar el Cstmt - 1 Algo se guarda / 0 o - No se guardo nada
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Error al agregar CALENDARIO :" + e.getMessage());

        } finally {

            //SIEMPRE cerrar la conexión
            con.close();
        }

        return centinela;

    }
    
    
    //Agregar CON CLASE VISITA
    public boolean agregarObs_Mej(ObsMej obsMej) throws SQLException {

        boolean centinela = false;

        try {

            //abrir conexión
            con = cn.obttenerrConexion();

            //Creamos la llamada al procedimiento
            String llamada = "{ call SP_REGISTRAR_OBS_MEJ(?,?,?,?,?,?,?,?,?,?,?,?,?)}";

            //Crear CallableStatement que permite ejecutar script en la BD
            CallableStatement cstmt = con.prepareCall(llamada);

            //Pasar los parametros del libro
            cstmt.setInt(1, obsMej.getId_visita());
            cstmt.setString(2, obsMej.getObs1());
            cstmt.setString(3, obsMej.getObs2());
            cstmt.setString(4, obsMej.getObs3());
            cstmt.setString(5, obsMej.getObs4());
            cstmt.setString(6, obsMej.getObs5());
            cstmt.setString(7, obsMej.getObs6());
            cstmt.setString(8, obsMej.getMej1());
            cstmt.setString(9, obsMej.getMej2());
            cstmt.setString(10, obsMej.getMej3());
            cstmt.setString(11, obsMej.getMej4());
            cstmt.setString(12, obsMej.getMej5());
            cstmt.setString(13, obsMej.getMej6());

            //Ejecutar el Cstmt - 1 Algo se guarda / 0 o - No se guardo nada
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Error al agregar OBSERVACIONES Y MEJORAS :" + e.getMessage());

        } finally {

            //SIEMPRE cerrar la conexión
            con.close();
        }

        return centinela;

    }
    
    //validar que no tenga un CHECKLIST CREADO
    public boolean verificarSinCHK(int id_visit) throws SQLException{
        boolean centinela = false;
        
        int verificacion = 0;
        
        String sql = "select id_visita from visita where id_visita = '"+id_visit+"'  and ID_OBSERVACIONES is null";
        
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                verificacion = rs.getInt(1);
            }
            
            if(verificacion == id_visit){
                centinela = true;
            }
            
        } catch (Exception e) {
            System.out.println("Error al verificar si existe checklist :" + e.getMessage());
        } finally{
            //SIEMPRE cerrar la conexión
            con.close();
        }
        
        return centinela;
    }
    
    //METODO LISTAR LOS CHECKLIST CREADOS DEL CLIENTE
    public List listarChecklist(String run){
        List<respCheck>lista= new ArrayList<>();
        String sql = "select v.NOMBRE, v.FECHA_INI,c.RUT_EMPRESA,v.ID_OBSERVACIONES,am.ID_MEJORA,r.ID_RESPUESTAS,v.ID_VISITA from cliente_empresa c join contrato ct on c.RUT_EMPRESA =ct.RUT_EMPRESA join visita_fk vf on vf.ID_CONTRATO=ct.ID_CONTRATO join visita v on vf.ID_VISITA=v.ID_VISITA join OBSERVACIONES o on o.ID_OBSERVACIONES=v.ID_OBSERVACIONES join RESPUESTAS r on r.ID_RESPUESTAS=o.ID_RESPUESTAS join ACTIVIDAD_MEJORA am on am.ID_MEJORA=o.ID_MEJORA where c.RUT_EMPRESA = '"+run+"' and v.ID_OBSERVACIONES is not null";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                respCheck p = new respCheck();
                p.setNombre(rs.getString(1));
                p.setFecha_inicio(rs.getString(2));
                p.setRut_empr(rs.getString(3));
                p.setID_OBSERVACIONES(rs.getInt(4));
                p.setID_MEJORA(rs.getInt(5));
                p.setID_RESPUESTAS(rs.getInt(6));
                p.setID_VISITA(rs.getInt(7));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista; 
    }
    
    //METODO LISTAR LOS CHECKLIST SEGUN LA ID_VISITA
    public List RespChecklist(int idd){
        List<ObsMej>lista= new ArrayList<>();
        String sql = "select o.ID_OBSERVACIONES,o.OBSERVACION1,o.OBSERVACION2,o.OBSERVACION3,o.OBSERVACION4,o.OBSERVACION5,o.OBSERVACION6,am.MEJORA1,am.MEJORA2,am.MEJORA3,am.MEJORA4,am.MEJORA5,am.MEJORA6 from visita v join observaciones o on o.ID_OBSERVACIONES=v.ID_OBSERVACIONES join ACTIVIDAD_MEJORA am on am.ID_MEJORA=o.ID_MEJORA where v.ID_VISITA='"+idd+"'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ObsMej p = new ObsMej();
                p.setId_visita(idd);
                p.setId_obs(rs.getInt(1));
                p.setObs1(rs.getString(2));
                p.setObs2(rs.getString(3));
                p.setObs3(rs.getString(4));
                p.setObs4(rs.getString(5));
                p.setObs5(rs.getString(6));
                p.setObs6(rs.getString(7));
                p.setMej1(rs.getString(8));
                p.setMej2(rs.getString(9));
                p.setMej3(rs.getString(10));
                p.setMej4(rs.getString(11));
                p.setMej5(rs.getString(12));
                p.setMej6(rs.getString(13));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista; 
    }
    
    //METODO LISTAR LOS CHECKLIST SEGUN LA ID_VISITA
    public List ObsMejRespChecklist(int idd){
        List<ObsMejResp>lista= new ArrayList<>();
        String sql = "select o.ID_OBSERVACIONES,o.OBSERVACION1,o.OBSERVACION2,o.OBSERVACION3,o.OBSERVACION4,o.OBSERVACION5,o.OBSERVACION6,am.MEJORA1,am.MEJORA2,am.MEJORA3,am.MEJORA4,am.MEJORA5,am.MEJORA6,r.RESPUESTAS1,r.RESPUESTAS2,r.RESPUESTAS3,r.RESPUESTAS4,r.RESPUESTAS5,r.RESPUESTAS6 from visita v join observaciones o on o.ID_OBSERVACIONES=v.ID_OBSERVACIONES join ACTIVIDAD_MEJORA am on am.ID_MEJORA=o.ID_MEJORA join RESPUESTAS r on o.ID_RESPUESTAS=r.ID_RESPUESTAS where v.ID_VISITA='"+idd+"'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                ObsMejResp p = new ObsMejResp();
                p.setId_visita(idd);
                p.setId_obs(rs.getInt(1));
                p.setObs1(rs.getString(2));
                p.setObs2(rs.getString(3));
                p.setObs3(rs.getString(4));
                p.setObs4(rs.getString(5));
                p.setObs5(rs.getString(6));
                p.setObs6(rs.getString(7));
                p.setMej1(rs.getString(8));
                p.setMej2(rs.getString(9));
                p.setMej3(rs.getString(10));
                p.setMej4(rs.getString(11));
                p.setMej5(rs.getString(12));
                p.setMej6(rs.getString(13));
                p.setRep1(rs.getInt(14));
                p.setRep2(rs.getInt(15));
                p.setRep3(rs.getInt(16));
                p.setRep4(rs.getInt(17));
                p.setRep5(rs.getInt(18));
                p.setRep6(rs.getInt(19));
                lista.add(p);
            }

        } catch (Exception e) {

        }
        return lista; 
    }
    
    //validar que no tenga un CHECKLIST CREADO
    public int verificarRespuesta(int resp1,int resp2,int resp3,int resp4,int resp5,int resp6) throws SQLException{
        
        int verificacion = 0;
        String sql = "select ID_RESPUESTAS from respuestas where RESPUESTAS1 = '"+resp1+"' AND RESPUESTAS2 = '"+resp2+"' AND RESPUESTAS3 = '"+resp3+"' AND RESPUESTAS4 = '"+resp4+"' AND RESPUESTAS5 = '"+resp5+"' AND RESPUESTAS6 = '"+resp6+"'";
        try {
            con = cn.obttenerrConexion();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                verificacion = rs.getInt(1);
            }
        } catch (Exception e) {
            System.out.println("Error al verificar si existe checklist :" + e.getMessage());
        } finally{
            //SIEMPRE cerrar la conexión
            con.close();
        }
        return verificacion;
    }
    
    
    
    
    
    //UPDATE RESPUESTA EN OBSERVACIONES
    public boolean updateResp(int id_obs,int id_resp) throws SQLException {

        boolean centinela = false;

        try {

            //abrir conexión
            con = cn.obttenerrConexion();

            //Creamos la llamada al procedimiento
            String llamada = "{ call SP_MODIFICAR_OBS(?,?)}";

            //Crear CallableStatement que permite ejecutar script en la BD
            CallableStatement cstmt = con.prepareCall(llamada);

            //Pasar los parametros
            cstmt.setInt(1, id_obs);
            cstmt.setInt(2, id_resp);

            //Ejecutar el Cstmt - 1 Algo se guarda / 0 o - No se guardo nada
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }

        } catch (Exception e) {
            System.out.println("Error al realizar UPDATE en OBSERVACIONES :" + e.getMessage());

        } finally {

            //SIEMPRE cerrar la conexión
            con.close();
        }

        return centinela;

    }
    
    //UPDATE RESPUESTA EN OBSERVACIONES
    public boolean updateEstado(int id_visita,int id_estado) throws SQLException {
        boolean centinela = false;
        try {
            //abrir conexión
            con = cn.obttenerrConexion();
            //Creamos la llamada al procedimiento
            String llamada = "{ call SP_MODIFICAR_ESTADO(?,?)}";
            //Crear CallableStatement que permite ejecutar script en la BD
            CallableStatement cstmt = con.prepareCall(llamada);
            //Pasar los parametros
            cstmt.setInt(1, id_visita);
            cstmt.setInt(2, id_estado);
            //Ejecutar el Cstmt - 1 Algo se guarda / 0 o - No se guardo nada
            if (cstmt.executeUpdate() > 0) {
                centinela = true;
            }
        } catch (Exception e) {
            System.out.println("Error al realizar UPDATE en VISITA :" + e.getMessage());
        } finally {
            //SIEMPRE cerrar la conexión
            con.close();
        }
        return centinela;
    }
    
    
    public String transFecha(String fechaFull){
        String txt = fechaFull;

        String month = txt.substring(4,7);
        String mes = "";
        String dia = txt.substring(8,10);
        String anio = txt.substring(11,15);
        
        if(month.equals("Jan")){mes="01";}
        if(month.equals("Feb")){mes="02";}
        if(month.equals("Mar")){mes="03";}
        if(month.equals("Apr")){mes="04";}
        if(month.equals("May")){mes="05";}
        if(month.equals("Jun")){mes="06";}
        if(month.equals("Jul")){mes="07";}
        if(month.equals("Aug")){mes="08";}
        if(month.equals("Sep")){mes="09";}
        if(month.equals("Oct")){mes="10";}
        if(month.equals("Nov")){mes="11";}
        if(month.equals("Dec")){mes="12";}
        
        String txtfull = dia+"/"+mes+"/"+anio;
        return txtfull;
    }
    
    public String transFecha2(String fechaFull){
        String txt = fechaFull;

        String month = txt.substring(4,7);
        String mes = "";
        String dia = txt.substring(8,10);
        String anio = txt.substring(25,29);
        
        if(month.equals("Jan")){mes="01";}
        if(month.equals("Feb")){mes="02";}
        if(month.equals("Mar")){mes="03";}
        if(month.equals("Apr")){mes="04";}
        if(month.equals("May")){mes="05";}
        if(month.equals("Jun")){mes="06";}
        if(month.equals("Jul")){mes="07";}
        if(month.equals("Aug")){mes="08";}
        if(month.equals("Sep")){mes="09";}
        if(month.equals("Oct")){mes="10";}
        if(month.equals("Nov")){mes="11";}
        if(month.equals("Dec")){mes="12";}
        
        String txtfull = dia+"/"+mes+"/"+anio;
        return txtfull;
    }
}
