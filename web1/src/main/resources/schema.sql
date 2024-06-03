DROP TABLE IF EXISTS Alumno;
CREATE TABLE Alumno (
 
    nombre VARCHAR(255) NOT NULL PRIMARY KEY,
    edad INT NOT NULL
);

DROP TABLE IF EXISTS Examen;

CREATE TABLE Examen (
 
    id int  PRIMARY KEY,
    asignatura VARCHAR(255) NOT NULL,
   	texto VARCHAR(255),
    nota number NOT NULL,
    alumno_nombre varchar (255)
);