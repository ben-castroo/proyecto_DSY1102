Este proyecto es un sistema de escritorio, creado con lenguaje Java y base de datos MySQL. Se utiliza un modelo MVC y librería Swing.
Un sistema de gestión de productos en bodega. Tiene registro, login, lista y búsqueda de productos, modificación y eliminación de productos, y creación de productos.
En la bbdd el esquema se compone de 3 tablas:
-Usuario: idUsuario AI PK int(11), nombre varchar(20), apellido varchar(20), contrasena varchar(20), nombre_usuario varchar(20), correo varchar(30), celular int(9)
-Producto: IdProducto PK int(11), nombre varchar(20), marca varchar(20), modelo varchar(20), stock int not null, idBodega FK int(11).
-Bodega: IdBodega PK int(11), nombre_bodega varchar(20).
La tabla producto se relaciona con bodega ya que tiene el campo idBodega que hace referencia a idBodega de la tabla bodega.
