
package bd;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author administrador
 */
public class ConexionBD {
    
    public Connection obtenerConexion() {
        
        Connection conexion = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/proyecto","root","");
            System.out.println("Conexion exitosa");
        } catch (Exception e) {
            System.out.println("No se logro conectar a la BD");
        }
        
        return conexion;
        
    }
    
}
