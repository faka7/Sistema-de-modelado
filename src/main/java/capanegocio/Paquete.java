
package capanegocio;
import java.util.ArrayList;

public class Paquete extends Cliente{
   private String tipo;
   private String transporte;
   private String fechadesalida;
   private String costo;
   private String especificacion;
   private String asistencia;
   private String destino;
   private String fechaentrada;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTransporte() {
        return transporte;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public String getFechadesalida() {
        return fechadesalida;
    }

    public void setFechadesalida(String fechadesalida) {
        this.fechadesalida = fechadesalida;
    }

    public String getCosto() {
        return costo;
    }

    public void setCosto(String costo) {
        this.costo = costo;
    }

    public String getEspecificacion() {
        return especificacion;
    }

    public void setEspecificacion(String especificacion) {
        this.especificacion = especificacion;
    }

    public String getAsistencia() {
        return asistencia;
    }

    public void setAsistencia(String asistencia) {
        this.asistencia = asistencia;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public String getFechaentrada() {
        return fechaentrada;
    }

    public void setFechaentrada(String fechaentrada) {
        this.fechaentrada = fechaentrada;
    }
    
    public Vendedor recepcionar;
   
}
