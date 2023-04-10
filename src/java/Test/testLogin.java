/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;
import DAO.Log_InDAO;
import DAO.logDAO;


/**
 *
 * @author User
 */
public class testLogin {
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //LOGIN CON CORREO
        try {
            
            //System.out.println(new logDAO().Login("user", "user"));
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
