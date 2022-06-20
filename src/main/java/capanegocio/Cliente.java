
package capanegocio;


public class Cliente {
    private String nombre;
    private String apellidos;
    private String lugarresidencia;
    private String idioma;
    private String correo;
    private String numTel;

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

    public String getLugarresidencia() {
        return lugarresidencia;
    }

    public void setLugarresidencia(String lugarresidencia) {
        this.lugarresidencia = lugarresidencia;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNumTel() {
        return numTel;
    }

    public void setNumTel(String numTel) {
        this.numTel = numTel;
    }
    
    public String Consultar()
    {
        return "Metodo no implementado";
    }
    
    public String Validar()
    {
        return "Metodo no implementado";
    }
    
    
}
