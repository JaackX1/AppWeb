/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Clases.Visitas;
import DAO.ClienteDAO;
import DAO.VisitasDAO;

/**
 *
 * @author User
 */
public class testListar {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        //LOGIN CON CORREO
        try {
            String run = "200596846";
            
            //System.out.println(new VisitasDAO().listarRun(run));
            System.out.println(new ClienteDAO().listarProfCont(run));
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
