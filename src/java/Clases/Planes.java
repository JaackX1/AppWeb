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
public class Planes {
    
    int id_planes;
    String plan_nombre;
    String plan_desc;    
    String plan_metros;
    int plan_cant_prof;
    int plan_precio;

    public Planes() {
    }

    public Planes(int id_planes, String plan_nombre, String plan_desc, String plan_metros, int plan_cant_prof, int plan_precio) {
        this.id_planes = id_planes;
        this.plan_nombre = plan_nombre;
        this.plan_desc = plan_desc;
        this.plan_metros = plan_metros;
        this.plan_cant_prof = plan_cant_prof;
        this.plan_precio = plan_precio;
    }

    public int getId_planes() {
        return id_planes;
    }

    public void setId_planes(int id_planes) {
        this.id_planes = id_planes;
    }

    public String getPlan_nombre() {
        return plan_nombre;
    }

    public void setPlan_nombre(String plan_nombre) {
        this.plan_nombre = plan_nombre;
    }

    public String getPlan_desc() {
        return plan_desc;
    }

    public void setPlan_desc(String plan_desc) {
        this.plan_desc = plan_desc;
    }

    public String getPlan_metros() {
        return plan_metros;
    }

    public void setPlan_metros(String plan_metros) {
        this.plan_metros = plan_metros;
    }

    public int getPlan_cant_prof() {
        return plan_cant_prof;
    }

    public void setPlan_cant_prof(int plan_cant_prof) {
        this.plan_cant_prof = plan_cant_prof;
    }

    public int getPlan_precio() {
        return plan_precio;
    }

    public void setPlan_precio(int plan_precio) {
        this.plan_precio = plan_precio;
    }

    @Override
    public String toString() {
        return "Planes{" + "id_planes=" + id_planes + ", plan_nombre=" + plan_nombre + ", plan_desc=" + plan_desc + ", plan_metros=" + plan_metros + ", plan_cant_prof=" + plan_cant_prof + ", plan_precio=" + plan_precio + '}';
    }

   
    
    
    
}
