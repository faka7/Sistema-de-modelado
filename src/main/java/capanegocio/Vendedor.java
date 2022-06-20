/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package capanegocio;
import java.util.ArrayList;
/**
 *
 * @author lopez
 */
public class Vendedor {
    
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
    
    public String Registrar()
    {
        return "Metodo no implementado";
    }
    
    public String Emitir()
    {
        return "Metodo no implementado";
    }
    
     public String Establecer()
    {
        return "Metodo no implementado";
    }
    
    public SoftwareReserva anotar; 
    public ArrayList<Paquete> recepcionar = new ArrayList(); 
}
