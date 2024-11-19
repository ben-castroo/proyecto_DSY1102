
package Modelo;

/**
 *
 * @author administrador
 */
public class Producto {
    
    private String nombre,marca,modelo;
    private int idProducto,stock;
    private Bodega bodega;

    public Producto() {
    }

    public Producto(String nombre, String marca, String modelo, int idProducto, int stock, Bodega bodega) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.idProducto = idProducto;
        this.stock = stock;
        this.bodega = bodega;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Bodega getBodega() {
        return bodega;
    }

    public void setBodega(Bodega bodega) {
        this.bodega = bodega;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", marca=" + marca + ", modelo=" + modelo + ", idProducto=" + idProducto + ", stock=" + stock + ", bodega=" + bodega + '}';
    }

    
    
    
    
}
