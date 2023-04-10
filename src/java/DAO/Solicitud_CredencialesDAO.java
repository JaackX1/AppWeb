
package DAO;
import Clases.Solicitud_Credenciales;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.SQLException;

public class Solicitud_CredencialesDAO {
    private Connection conexion;

    public Solicitud_CredencialesDAO() {
    }
    
    //Agregar
    public boolean agregarSolicitud_Credenciales(Solicitud_Credenciales sce) throws SQLException{
    
        boolean centinela = false;
        try {
            this.conexion = new Conexion.Conexion().obttenerrConexion();
            //crear lla lllamada del procedimiento
            String llamada = "{ call SP_REGISTRAR_SCRED(?,?,?,?,?,?)}";
            //Creamos el calllabllestatement paraa poder ejecutar ell procedimiento
            CallableStatement cstmt = this.conexion.prepareCall(llamada);
            //Pasar llos datos del libro al procedimiento
            cstmt.setString(1,sce.getRut_empresa());
            cstmt.setString(2,sce.getNombre_empresa());
            cstmt.setString(3,sce.getDireccion());
            cstmt.setInt(4,sce.getTelefono_emp());
            cstmt.setString(5, sce.getCorreo());
            cstmt.setInt(6,sce.getId_rubro());
            //cstmt.setInt(6,sce.getId_clase());
            
            //Ejecutarr el procedimientto y comprobar si guardo algo
            
            if(cstmt.executeUpdate()>0){
                centinela = true;
            }
            
        } catch (Exception e) {
            System.out.println("Eror all guardar"+e.getMessage());
        } finally {
            this.conexion.close();
        }
        return centinela;
    
    }
    
    
}
