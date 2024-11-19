create database proyecto;
use proyecto;
create table proyecto.usuario(
idUsuario int not null auto_increment,
nombre varchar(20) not null,
apellido varchar(20) not null,
contrasena varchar(20) not null,
nombre_usuario varchar(20) not null,
correo varchar(30) not null,
celular int(9) not null,
primary key (idUsuario)
);

create table proyecto.producto(
idProducto int not null,
nombre varchar(20) not null,
marca varchar(20) not null,
modelo varchar(20) not null,
stock int not null,
primary key(idProducto)
);

create table proyecto.bodega(
idBodega int not null AUTO_INCREMENT,
nombre_bodega varchar(20) not null,
primary key(idBodega)
);

ALTER TABLE Producto
	ADD COLUMN idBodega INT,
	ADD FOREIGN KEY (idBodega) REFERENCES Bodega(idBodega);

insert into bodega(nombre) values ("Valparaíso");
insert into bodega(nombre) values ("Viña del Mar");
insert into bodega(nombre) values ("Quilpué");
insert into bodega(nombre) values ("Con Con");

insert into producto(idProducto, nombre, marca, modelo, stock, idBodega) values (123, "ajedrez", "bilingual","madera",22,3);
insert into producto(idProducto, nombre, marca, modelo, stock, idBodega) values (124, "damas", "trilingual","plastico",11,1);
insert into producto(idProducto, nombre, marca, modelo, stock, idBodega) values (125, "catan", "ansaldo","xd",123,1);

