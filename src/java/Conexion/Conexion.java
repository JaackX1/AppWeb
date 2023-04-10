
package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    //Crear la variablle que abrira la conexion
    private static Connection con;
    //credenciales
    private String usuario = "nma";
    private String pass = "nma";
    private String url = "jdbc:oracle:thin:"+usuario+"/"+pass+"@localhost:1521:xe";

    public Conexion() {
        try {
            //cargar ña libreria ojdbc para conectarnos a rracle
            Class.forName("oracle.jdbc.OracleDriver").newInstance();
            this.con = DriverManager.getConnection(url,usuario,pass);
        } catch (Exception e) {
            System.out.println("Error de conexion"+e.getMessage());
        }
        
    }
    
    public Connection obttenerrConexion(){
        return this.con;
    }
    
    
    
}
