/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author User
 */
public class Login {
    
    private String nombre_usuario;    
    private String contrasenia;
    private int tipo_clase;

    public Login() {
    }

    public String getNombre_usuario() {
        return nombre_usuario;
    }

    public void setNombre_usuario(String nombre_usuario) {
        this.nombre_usuario = nombre_usuario;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public int getTipo_clase() {
        return tipo_clase;
    }

    public void setTipo_clase(int tipo_clase) {
        this.tipo_clase = tipo_clase;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre_usuario=" + nombre_usuario + ", contrasenia=" + contrasenia + ", tipo_clase=" + tipo_clase + '}';
    }
    
}
