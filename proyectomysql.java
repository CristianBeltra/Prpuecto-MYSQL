alter table viajes.turista

add nombre varchar (100) not null
;

commit;

insert into viajes.turista (id_turista, nombre, pais, sexo, edad) values (1, "Jorge Juarez", "El Salvador", "M", "25");
insert into viajes.turista (id_turista, nombre, pais, sexo, edad) values (2, "Julia Gonzalez", "Honduras", "F", "24");
insert into viajes.turista (id_turista, nombre, pais, sexo, edad) values (3, "Lucia Lopez", "Costa Rica", "F", "23");
commit; 

select * from viajes.turista;

select * from viajes.recorrido;

Select * from viajes.bitacora;

select * from numeros;

SELECT * FROM viajes.idiamas;

ALTER TABLE tecorrido ADD Duracion INT;
ALTER TABLE turista MODIFY pais VARCHAR(100);
ALTER TABLE turista ADD  id_idiomas INT NOT NULL;
UPDATE turista SET id_idiomas = '1' WHERE id_turista = 1;
UPDATE turista SET id_idiomas = '2' WHERE id_turista = 2;
UPDATE turista SET id_idiomas = '3' WHERE id_turista = 3;
ALTER TABLE turista ADD FOREIGN KEY (id_idiomas) REFERENCES idioma(id_idiomas);



insert into viajes.numeros values (5,10.3);



insert into viajes.idiamas (id_idiomas, idioma, nombre) values (3,"español", "Lucia Lopez");

commit;
