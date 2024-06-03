DELETE from Alumno;
INSERT INTO Alumno (nombre, edad) VALUES ('Juan', 25);
INSERT INTO Alumno (nombre, edad) VALUES ('Maria', 30);
INSERT INTO alumno (nombre, edad) VALUES ('Carlos', 22);

DELETE from Examen;

INSERT INTO Examen (asignatura, texto, nota,alumno_nombre) VALUES ('Matematicas', 'pregunta1',5,'Juan');
INSERT INTO Examen (asignatura, texto, nota,alumno_nombre) VALUES ('Fisica', 'pregunta2',7,'Carlos');

