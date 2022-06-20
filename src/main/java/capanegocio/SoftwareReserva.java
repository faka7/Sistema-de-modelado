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
public class SoftwareReserva extends Paquete  {
    
    private String id ;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public String Guardar()
    {
        return "Metodo no implementado";
    }
    
    public String Ingresar()
    {
        return "Metodo no implementado";
    }
    public String Ordenar()
    {
        return "Metodo no implementado";
    }
    
    public ArrayList<Vendedor> anotar = new ArrayList();
}
