/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import Clases.Planes;
import DAO.PlanesDAO;

/**
 *
 * @author User
 */
public class testPlanes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //LOGIN CON CORREO
        try {
            System.out.println(new PlanesDAO().listar());
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }
        
        
        /*LOGIN CON USUARIO
        try {
            
            System.out.println(new UsuarioDAO().LoginUser("tecnico", "tecnico"));
        } catch (Exception e) {
            System.out.println("Error: "+e);
        }*/
        
    }
    
}
