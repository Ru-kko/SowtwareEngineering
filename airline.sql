
CREATE DATABASE IF NOT EXISTS airline;

USE airline;

CREATE TABLE IF NOT EXISTS aviones(
    matricula VARCHAR(30) NOT NULL PRIMARY KEY,
    capascdad INT NOT NULL,
    fabricante VARCHAR(50),
    motor VARCHAR(75)
);

CREATE TABLE if NOT EXISTS pilotos(
    codigo INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(255),
    horas_vuelo INT
);

CREATE TABLE if NOT EXISTS tripulacion(
    codigo INT NOT NULL PRIMARY KEY,
    nombre VARCHAR(255),
    telefono BIGINT,
    direccion VARCHAR(255),
    fecha_ingreso DATE
);


CREATE TABLE IF NOT EXISTS vuelos(
    numero_vuelo INT NOT NULL PRIMARY KEY,
    origen VARCHAR(255) NOT NULL,
    destino VARCHAR(255) NOT NULL,
    fecha DATE NOT NULL,
    avion VARCHAR(30) NOT NULL,
    CONSTRAINT avion_vuelo FOREIGN KEY(avion) REFERENCES aviones(matricula),
    piloto INT NOT NULL,
    CONSTRAINT vuelo_piloto FOREIGN KEY(piloto) REFERENCES pilotos(codigo)
);


CREATE TABLE IF NOT EXISTS pasajeros(
    numero_vuelo INT NOT NULL,
    CONSTRAINT pasejero_vuelo FOREIGN KEY(numero_vuelo) REFERENCES vuelos(numero_vuelo),
    tripulante INT NOT NULL,
    CONSTRAINT tripulante_vuelo FOREIGN KEY(tripulante) REFERENCES tripulacion(codigo),
    PRIMARY KEY(numero_vuelo , tripulante)
);