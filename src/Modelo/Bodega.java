
package Modelo;

/**
 *
 * @author administrador
 */
public class Bodega {
    
    private int idBodega;
    private String nombre;

    public Bodega() {
    }

    public Bodega(int idBodega, String nombre) {
        this.idBodega = idBodega;
        this.nombre = nombre;
    }

    public int getIdBodega() {
        return idBodega;
    }

    public void setIdBodega(int idBodega) {
        this.idBodega = idBodega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
