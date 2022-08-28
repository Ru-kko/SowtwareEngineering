create database if not exists zoo;

use zoo;


create table if not exists  zoo(
    id int not null auto_increment primary key,
    nombre varchar(150) not null,
    ciudad varchar(50) not null,
    direccion varchar(150) not null,
    telefono bigint,
    size int,
    presupuesto int
);
create table if not exists zonas(
    id int not null primary key auto_increment,
    zoo_id int not null,
    zona varchar(24) not null,
    constraint zoo_zone FOREIGN key(zoo_id) REFERENCES zoo(id)
);

create table if not exists  animal(
    id int not null primary key auto_increment,
    nombre varchar(150) not null,
    nombre_cientifico varchar(150) not null,
    familia varchar(100),
    ingreso Date not null,
    nivel_peligro varchar(25),
    born_date Date not null,
    genero varchar(10),
    pais varchar(50),
    continente varchar(25),
    locacion int not null,
    constraint zoo_location FOREIGN key(locacion) REFERENCES zonas(id)
);
