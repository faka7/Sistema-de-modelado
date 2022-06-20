/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio;

/**
 *
 * @author lopez
 */
public class Administrador {
    private String nombre;
    private String apellidos;
    private String dni;
    private String horario;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }
    
    public String Respaldar()
    {
        return "Metodo no implementado";
    }
    
    public String Administrar()
    {
        return "Metodo no implementado";
    }
    public String Recuperar()
    {
        return "Metodo no implementado";
    }
}
