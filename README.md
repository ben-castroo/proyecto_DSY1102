# Sistema de Gestión de Productos en Bodega

Este proyecto es un sistema de escritorio desarrollado en **Java** utilizando la librería **Swing** para la interfaz gráfica y **MySQL** como base de datos. Sigue el patrón de diseño **MVC (Modelo-Vista-Controlador)** para mantener una estructura organizada y escalable.

## Características del Sistema

- **Registro y Login de usuarios**: Control de acceso al sistema.
- **Gestión de productos**:
  - Listado y búsqueda de productos.
  - Creación de nuevos productos.
  - Modificación y eliminación de productos existentes.
- Relación de productos con bodegas para una gestión más eficiente.

## Modelo de Base de Datos

El sistema utiliza una base de datos relacional con el siguiente esquema compuesto por tres tablas principales:

### Tabla `Usuario`
| Campo           | Tipo         | Restricción                 |
|------------------|--------------|-----------------------------|
| `idUsuario`     | `int(11)`    | AI, PK                     |
| `nombre`        | `varchar(20)`|                             |
| `apellido`      | `varchar(20)`|                             |
| `contrasena`    | `varchar(20)`|                             |
| `nombre_usuario`| `varchar(20)`|                             |
| `correo`        | `varchar(30)`|                             |
| `celular`       | `int(9)`     |                             |

### Tabla `Producto`
| Campo         | Tipo         | Restricción                 |
|---------------|--------------|-----------------------------|
| `idProducto`  | `int(11)`    | PK                          |
| `nombre`      | `varchar(20)`|                             |
| `marca`       | `varchar(20)`|                             |
| `modelo`      | `varchar(20)`|                             |
| `stock`       | `int`        | NOT NULL                    |
| `idBodega`    | `int(11)`    | FK -> `Bodega(idBodega)`    |

### Tabla `Bodega`
| Campo           | Tipo         | Restricción                 |
|------------------|--------------|-----------------------------|
| `idBodega`      | `int(11)`    | PK                          |
| `nombre_bodega` | `varchar(20)`|                             |

### Relaciones
- La tabla `Producto` se relaciona con la tabla `Bodega` mediante el campo `idBodega`, que es una clave foránea que referencia a `idBodega` en la tabla `Bodega`.

## Requisitos del Sistema

- **Java**: Versión 17 o superior.
- **MySQL**: Versión 5.7 o superior.
- Librerías adicionales: Asegúrate de tener configurado el conector JDBC para la conexión con MySQL.
