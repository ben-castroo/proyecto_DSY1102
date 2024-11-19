
package Controlador;

import Modelo.Producto;
import Modelo.Usuario;
import bd.ConexionBD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Modelo.Bodega;


/**
 *
 * @author administrador
 */
public class Registro {
    
    public boolean agregarUsuario(Usuario usuario)
    {
        try {
            
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            

            //query SQL
            String query = "INSERT INTO usuario(nombre,apellido,correo,nombre_usuario,contrasena,celular) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usuario.getNombre());
            stmt.setString(2, usuario.getApellido());
            stmt.setString(3, usuario.getCorreo());
            stmt.setString(4, usuario.getNomUsuario());
            stmt.setString(5, usuario.getContrasena());
            stmt.setInt(6,usuario.getCelular());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            
            
            return true;
            
            
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al agregar usuario " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método agregar usuario " + e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean agregarProducto(Producto producto)
    {
        try {
            
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            

            //query SQL
            String query = "INSERT INTO producto(nombre,marca,modelo,idProducto,stock,idBodega) VALUES(?,?,?,?,?,?)";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getMarca());
            stmt.setString(3, producto.getModelo());
            stmt.setInt(4, producto.getIdProducto());
            stmt.setInt(5, producto.getStock());
            stmt.setInt(6, producto.getBodega().getIdBodega());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
            
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al agregar producto " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método agregar producto " + e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean eliminarProducto(int idProducto)
    {
        try {
                        
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            
            //query SQL
            String query = "DELETE FROM producto WHERE idProducto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idProducto);
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
            
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al eliminar producto " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método eliminar producto " + e.getMessage());
            return false;
        }
    }
    
    
    public boolean actualizarProducto(Producto producto){
        
        try {
                  
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
           
            //query SQL
            String query = "UPDATE proyecto.producto SET nombre = ?,marca=?,modelo=?,stock=?,idbodega=? WHERE idProducto=?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, producto.getNombre());
            stmt.setString(2, producto.getMarca());
            stmt.setString(3, producto.getModelo());
            stmt.setInt(4, producto.getStock());
            stmt.setInt(5, producto.getBodega().getIdBodega());
            stmt.setInt(6, producto.getIdProducto());
//            stmt.setString(7,producto.getBodega().getNombre());
            
            stmt.executeUpdate();
            stmt.close();
            cnx.close();
            
            return true;
            
            
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al actualizar producto " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método actualizar producto " + e.getMessage());
            return false;
        }
    }
    
    
    public Producto buscarPorIdProducto(int idProducto)
    {
        Producto producto = new Producto();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            //query SQL
            String query = "SELECT * FROM producto LEFT JOIN bodega on producto.idBodega=bodega.idBodega where idProducto = ? order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idProducto);
             ResultSet rs = stmt.executeQuery();
            
            if (rs.next()) {
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setMarca(rs.getString("marca"));
                producto.setModelo(rs.getString("modelo"));
                producto.setStock(rs.getInt("stock"));
                Bodega bodega = new Bodega(rs.getInt("idBodega"),rs.getString("nombre_bodega"));
                producto.setBodega(bodega);
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error  SQL al listar  producto por ID " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error en el método listar producto por ID " + e.getMessage());
        }
        return producto;
    }
    
 public List<Producto> buscarPorNombreProducto(String nombre)
    {
        List<Producto> lista = new ArrayList<>();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            //query SQL
            String query = "SELECT * FROM producto LEFT JOIN bodega on producto.idBodega=bodega.idBodega where nombre like ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, nombre + "%");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setMarca(rs.getString("marca"));
                producto.setModelo(rs.getString("modelo"));
                producto.setStock(rs.getInt("stock"));
                Bodega bodega = new Bodega(rs.getInt("idBodega"),rs.getString("nombre_bodega"));
                producto.setBodega(bodega);

                lista.add(producto);     
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error  SQL al listar  producto " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error en el método listar producto " + e.getMessage());
        }
        return lista;
    }
 
 public List<Producto> buscarPorMarcaProducto(String marca)
    {
        List<Producto> lista = new ArrayList<>();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            //query SQL
            String query = "SELECT * FROM producto LEFT JOIN bodega on producto.idBodega=bodega.idBodega where marca like ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, marca + "%");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setMarca(rs.getString("marca"));
                producto.setModelo(rs.getString("modelo"));
                producto.setStock(rs.getInt("stock"));
                Bodega bodega = new Bodega(rs.getInt("idBodega"),rs.getString("nombre_bodega"));
                producto.setBodega(bodega);

                lista.add(producto);     
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error  SQL al listar  producto  por marca" + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error en el método listar producto  por marca" + e.getMessage());
        }
        return lista;
    }
    
  public List<Producto> buscarPorModeloProducto(String modelo)
    {
        List<Producto> lista = new ArrayList<>();
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            //query SQL
            String query = "SELECT * FROM producto LEFT JOIN bodega on producto.idBodega=bodega.idBodega where modelo like ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, modelo + "%");
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setMarca(rs.getString("marca"));
                producto.setModelo(rs.getString("modelo"));
                producto.setStock(rs.getInt("stock"));
                Bodega bodega = new Bodega(rs.getInt("idBodega"),rs.getString("nombre_bodega"));
                producto.setBodega(bodega);

                lista.add(producto);     
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error  SQL al listar  producto  por modelo" + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error en el método listar producto  por modelo" + e.getMessage());
        }
        return lista;
    }
    
    public List<Producto> buscarTodosProductos()
    {
        List<Producto> lista = new ArrayList<>();
        
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            
            //query SQL
            String query = "SELECT * FROM producto LEFT JOIN bodega on producto.idBodega=bodega.idBodega order by nombre";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Producto producto = new Producto();
                producto.setIdProducto(rs.getInt("idProducto"));
                producto.setNombre(rs.getString("nombre"));
                producto.setMarca(rs.getString("marca"));
                producto.setModelo(rs.getString("modelo"));
                producto.setStock(rs.getInt("stock"));
                Bodega bodega = new Bodega(rs.getInt("idBodega"),rs.getString("nombre_bodega"));
                producto.setBodega(bodega);
                
                
                
                
                lista.add(producto);
                
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error  SQL al listar  producto " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error en el método listar producto " + e.getMessage());
        }
        return lista;
    }
    
    public List<Bodega> buscarTodosBodega()
    {
        List<Bodega> lista = new ArrayList<>();
        
        try {
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();
            
            
            //query SQL
            String query = "SELECT * FROM bodega order by nombre_bodega";
            PreparedStatement stmt = cnx.prepareStatement(query);
            
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                Bodega bodega = new Bodega();
                bodega.setIdBodega(rs.getInt("idBodega"));
                bodega.setNombre(rs.getString("nombre_bodega"));
                
                
                lista.add(bodega);
            }
            rs.close();
            stmt.close();
            cnx.close();
            
        } catch (SQLException e) {
            System.out.println("Error  SQL al listar  bodega " + e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println("Error en el método listar bodega " + e.getMessage());
        }
        return lista;
    }
    
    
    public boolean validarUsuario(String usuario, String contrasena)
    {
        try {
            
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();    
            
            //query SQL
            String query = "SELECT * FROM usuario WHERE nombre_usuario = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, usuario);
           
            stmt.executeQuery();
            
            ResultSet rs = stmt.executeQuery();
        
            while (rs.next()) {
                if (usuario.equals(rs.getString("nombre_usuario")) && contrasena.equals(rs.getString("contrasena"))){
                    System.out.println("Bienvenido, " + rs.getString("nombre"));
                    return true;
                }
            }
       
            stmt.close();
            cnx.close();
            
            return false;
               
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al logear usuario " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método logear usuario " + e.getMessage());
            return false;
        }
        
    }
    
    
    public boolean validarRegistroUsuario(String nombre_usuario)
    {
        try {
            
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();    
            
            //query SQL
            String query = "SELECT * FROM usuario WHERE nombre_usuario = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setString(1, nombre_usuario);
           
            stmt.executeQuery();
            
            ResultSet rs = stmt.executeQuery();
        
            while (rs.next()) {
                if (nombre_usuario.equals(rs.getString("nombre_usuario"))){
                    System.out.println("Ya existe un usuario con este nombre de usuario, ");
                    return true;
                }
            }
       
            stmt.close();
            cnx.close();
            
            return false;
               
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al validar nombre de usuario " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método validar nombre de usuario " + e.getMessage());
            return false;
        }
        
    }
    
    public boolean validarRegistroProducto(int idProducto)
    {
        try {
            
            ConexionBD conexion = new ConexionBD();
            Connection cnx = conexion.obtenerConexion();    
            
            //query SQL
            String query = "SELECT * FROM producto WHERE idProducto = ?";
            PreparedStatement stmt = cnx.prepareStatement(query);
            stmt.setInt(1, idProducto);
           
            stmt.executeQuery();
            
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                if(idProducto == rs.getInt("idProducto")){
                    System.out.println("Ya existe un PRODUCTO con este ID, ");
                    return true;
                }
            }
            stmt.close();
            cnx.close();
            
            return false;
               
        } catch (SQLException ex) {
            //Logger
            System.out.println("Error en SQL al validar registro de producto " + ex.getMessage());
            return false;
        }
        catch(Exception e){
            System.out.println("Error en el método validar registro de producto " + e.getMessage());
            return false;
        }
        
    } 
    
}
