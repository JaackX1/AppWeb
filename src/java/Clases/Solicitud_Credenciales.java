package Clases;


public class Solicitud_Credenciales {
    private String rut_empresa;
    private String nombre_empresa;
    private String direccion;
    private int telefono_emp;
    private String correo;
    private int id_rubro;
    private int id_clase;

    public Solicitud_Credenciales() {
    }

    public Solicitud_Credenciales(String rut_empresa, String nombre_empresa, String direccion, int telefono_emp, String correo, int id_rubro, int id_clase) {
        this.rut_empresa = rut_empresa;
        this.nombre_empresa = nombre_empresa;
        this.direccion = direccion;
        this.telefono_emp = telefono_emp;
        this.correo = correo;
        this.id_rubro = id_rubro;
        this.id_clase = id_clase;
    }

    public String getRut_empresa() {
        return rut_empresa;
    }

    public void setRut_empresa(String rut_empresa) {
        this.rut_empresa = rut_empresa;
    }

    public String getNombre_empresa() {
        return nombre_empresa;
    }

    public void setNombre_empresa(String nombre_empresa) {
        this.nombre_empresa = nombre_empresa;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getTelefono_emp() {
        return telefono_emp;
    }

    public void setTelefono_emp(int telefono_emp) {
        this.telefono_emp = telefono_emp;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public int getId_rubro() {
        return id_rubro;
    }

    public void setId_rubro(int id_rubro) {
        this.id_rubro = id_rubro;
    }

    public int getId_clase() {
        return id_clase;
    }

    public void setId_clase(int id_clase) {
        this.id_clase = id_clase;
    }

    @Override
    public String toString() {
        return "Solicitud_Credenciales{" + "rut_empresa=" + rut_empresa + ", nombre_empresa=" + nombre_empresa + ", direccion=" + direccion + ", telefono_emp=" + telefono_emp + ", correo=" + correo + ", id_rubro=" + id_rubro + ", id_clase=" + id_clase + '}';
    }
    

    
    
    
    
    
}



