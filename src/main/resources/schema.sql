create table pais(
    id varchar(2),
    nombre varchar(50),
    primary key (id)
);

create table persona (
      id number,
      nombre VARCHAR(50),
      apellido VARCHAR(50),
      pais_id VARCHAR(2),
      FOREIGN KEY (pais_id) REFERENCES pais(id)
);