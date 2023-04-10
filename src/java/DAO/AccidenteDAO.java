package DAO;

import Clases.Accidente;
import Conexion.Conexion;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AccidenteDAO {
    
    Connection con;
    Conexion cn = new Conexion();
    PreparedStatement ps;
    ResultSet rs;
    
    
    public AccidenteDAO(){
    }
    
        public boolean agregarAccidente(Accidente sce) throws SQLException {
        boolean centinela = false;
        try {
            con = cn.obttenerrConexion();
            String llamada = "{ call SP_REGISTRAR_ACCIDENTE(?,?,?,?)}";
            CallableStatement cstmt = this.con.prepareCall(llamada);
            cstmt.setString(1, sce.getAcc_observacion());
            cstmt.setString(2, sce.getAcc_fecha());
            cstmt.setString(3, sce.getAcc_hora());
            cstmt.setString(4, sce.getAcc_resolucion());
            
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
    
    
    
}
