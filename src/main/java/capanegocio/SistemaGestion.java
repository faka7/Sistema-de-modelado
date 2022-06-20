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
public class SistemaGestion extends SoftwareReserva{
    private String garantias;

    public String getGarantias() {
        return garantias;
    }

    public void setGarantias(String garantias) {
        this.garantias = garantias;
    }
    
    public String Verificar()
    {
        return "Metodo no implementado";
    }
    
    public String Solicitar()
    {
        return "Metodo no implementado";
    }
    public String Generar()
    {
        return "Metodo no implementado";
    }
}
