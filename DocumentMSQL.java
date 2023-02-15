CREATE TABLE viajes.recorrido
(
id_recorrido int not null,
nombre varchar(100) not null,
descripcion text not null,
primary key (id_recorrido),
unique (nombre)
);

commit;


create table viajes.bitacora
(
id_bitacora int not null,
id_turista int not null,
id_recorrido int not null,
fecha date,
karma set("excelente","bueno","podria mejorar","malo"),
primary Key (id_bitacora),
foreign key (id_turista) references turista (id_turista),
foreign key (id_recorrido) references recorrido (id_recorrido)
);

commit;


create table viajes.numeros
(
cero int(5) zerofill,
precio int default 100
);
commit;


alter table viajes.recorrido
add duracion int
;

commit;


alter table viajes.turista
modify pais varchar (100);

commit;

create table viajes.idiamas
(
idioma varchar (100) not null,
id_idiomas int not null primary key,
nombre varchar(100) not null,
primary key (id_idiomas)
);

commit;