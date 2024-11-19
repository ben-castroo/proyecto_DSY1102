
package Modelo;

/**
 *
 * @author administrador
 */
public class Usuario {
    
    private String nombre,apellido,correo,nomUsuario,contrasena;
    private int celular;

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String correo, String nomUsuario, String contrasena, int celular) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.correo = correo;
        this.nomUsuario = nomUsuario;
        this.contrasena = contrasena;
        this.celular = celular;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNomUsuario() {
        return nomUsuario;
    }

    public void setNomUsuario(String nomUsuario) {
        this.nomUsuario = nomUsuario;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        return "Usuario{" + "nombre=" + nombre + ", apellido=" + apellido + ", correo=" + correo + ", nomUsuario=" + nomUsuario + ", contrasena=" + contrasena + ", celular=" + celular + '}';
    }
    
    
    
}
